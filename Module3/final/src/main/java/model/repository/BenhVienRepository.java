package model.repository;

import model.bean.BenhVien;

import java.util.List;

public interface BenhVienRepository {
    List<BenhVien> selectFindAll();
    BenhVien selectBenhVien(int id);
    boolean updateBenhVien(BenhVien benhVien);
    boolean deleteBenhVien(int id);
    boolean insertBenhVien(BenhVien benhVien);
    List<BenhVien> search(String search);
}
