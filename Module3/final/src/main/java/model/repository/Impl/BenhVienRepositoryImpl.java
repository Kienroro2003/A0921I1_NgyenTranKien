package model.repository.Impl;

import model.bean.BenhVien;
import model.repository.BaseRepository;
import model.repository.BenhVienRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhVienRepositoryImpl implements BenhVienRepository {
    private static final String SELECT_FIND_ALL = "SELECT * FROM BENH_AN;";
    private static final String DELETE_BY_ID = "DELETE FROM BENH_AN WHERE ID = ?";
    private static final String INSERT_BENH_VIEN = "INSERT INTO BENH_AN(ma_benh_an,ma_benh_nhan,ten_benh_nhan,ngay_nhap_vien,ngay_ra_vien,ly_do) VALUES (?,?,?,?,?,?);";
    private static final String SELECT_BY_ID ="SELECT * FROM BENH_AN WHERE ID = ?";
    private static final String EIDT = "UPDATE BENH_AN SET ten_benh_nhan=?,ngay_nhap_vien=?,ngay_ra_vien=?,ly_do=? WHERE ID = ?";

    @Override
    public List<BenhVien> selectFindAll() {
        List<BenhVien> benhVienList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String maBenhAn = rs.getString("ma_benh_an");
                String maBenhNhan = rs.getString("ma_benh_nhan");
                String tenBenhNhan = rs.getString("ten_benh_nhan");
                String ngayNhapVien = rs.getString("ngay_nhap_vien");
                String ngayRaVien = rs.getString("ngay_ra_vien");
                String lyDo = rs.getString("ly_do");
                BenhVien benhVien = new BenhVien(id, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo);
                benhVienList.add(benhVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return benhVienList;
    }

    @Override
    public BenhVien selectBenhVien(int id) {
        BenhVien benhVien = null;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String maBenhAn = rs.getString("ma_benh_an");
                String maBenhNhan = rs.getString("ma_benh_nhan");
                String tenBenhNhan = rs.getString("ten_benh_nhan");
                String ngayNhapVien = rs.getString("ngay_nhap_vien");
                String ngayRaVien = rs.getString("ngay_ra_vien");
                String lyDo = rs.getString("ly_do");
                benhVien = new BenhVien(id,maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return benhVien;
    }

    @Override
    public boolean updateBenhVien(BenhVien benhVien) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(EIDT);
            preparedStatement.setString(1,benhVien.getTenBenhNhan());
            preparedStatement.setString(2,benhVien.getNgayNhapVien());
            preparedStatement.setString(3,benhVien.getNgayRaVien());
            preparedStatement.setString(4,benhVien.getLyDo());
            preparedStatement.setInt(5,benhVien.getId());
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteBenhVien(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1,id);
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insertBenhVien(BenhVien benhVien) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BENH_VIEN);
            preparedStatement.setString(1,benhVien.getMaBenhAn());
            preparedStatement.setString(2,benhVien.getMaBenhNhan());
            preparedStatement.setString(3,benhVien.getTenBenhNhan());
            preparedStatement.setString(4,benhVien.getNgayNhapVien());
            preparedStatement.setString(5,benhVien.getNgayRaVien());
            preparedStatement.setString(6,benhVien.getLyDo());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<BenhVien> search(String search) {
        return null;
    }
}
