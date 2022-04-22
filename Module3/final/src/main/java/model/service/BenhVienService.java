package model.service;

import model.bean.BenhVien;

import java.util.List;

public interface BenhVienService {
    List<BenhVien> selectFindAll();
    BenhVien selectBenhVien(int id);
    List<String> updateBenhVien(BenhVien benhVien);
    boolean deleteBenhVien(int id);
    List<String> insertBenhVien(BenhVien benhVien);
    List<BenhVien> search(String search);
}
