package model.bean;

public class BenhVien {
    private int id;
    private String maBenhAn;
    private String maBenhNhan;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDo;

    public BenhVien(int id, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo) {
        this.id = id;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDo = lyDo;
    }

    public BenhVien(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDo = lyDo;
    }

    public BenhVien(int id, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo) {
        this.id = id;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDo = lyDo;
    }

    public int getId() {
        return id;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public String getLyDo() {
        return lyDo;
    }
}
