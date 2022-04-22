package model.service.Impl;

import common.Validation;
import model.bean.BenhVien;
import model.repository.BenhVienRepository;
import model.repository.Impl.BenhVienRepositoryImpl;
import model.service.BenhVienService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BenhVienServiceImpl implements BenhVienService {
    private BenhVienRepository benhVienRepository = new BenhVienRepositoryImpl();
    @Override
    public List<BenhVien> selectFindAll() {
        return benhVienRepository.selectFindAll();
    }

    @Override
    public BenhVien selectBenhVien(int id) {
        return benhVienRepository.selectBenhVien(id);
    }

    @Override
    public List<String> updateBenhVien(BenhVien benhVien) {
        List<String> stringList = new ArrayList<>();
        boolean check = true;
        if(Validation.checkName(benhVien.getTenBenhNhan())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Tên sai định dạng");
        }
        if(Date.valueOf(benhVien.getNgayNhapVien()).compareTo(Date.valueOf(benhVien.getNgayRaVien())) < 0){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Ngay nhap phai nho hon ngay ra");
            stringList.add("Ngay ra phai lon hon ngay nhap");
        }
        if(check){
            benhVienRepository.updateBenhVien(benhVien);
        }
        return stringList;
    }

    @Override
    public boolean deleteBenhVien(int id) {
        return benhVienRepository.deleteBenhVien(id);
    }

    @Override
    public List<String> insertBenhVien(BenhVien benhVien) {
        List<String> stringList = new ArrayList<>();
        boolean check = true;
        if(Validation.checkMaBenhAn(benhVien.getMaBenhAn())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Sai định dạng BA-XXX");
        }
        if(Validation.checkMaBenhNhan(benhVien.getMaBenhNhan())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Sai định dạng BN-XXX");
        }
        if(Validation.checkName(benhVien.getTenBenhNhan())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Tên sai định dạng");
        }
        if(check){
            benhVienRepository.insertBenhVien(benhVien);
        }

        return stringList;
    }

    @Override
    public List<BenhVien> search(String search) {
        return null;
    }
}
