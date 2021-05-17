package Quan_Ly_Truong_Hoc.src.models;

public class LopHoc {
    private String maLopHoc;
    private String tenLopHoc;
    private String maGiaoVien;

    public LopHoc(String maLopHoc, String tenLopHoc, String maGiaoVien) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.maGiaoVien = maGiaoVien;
    }

    public LopHoc(String[] arrString) {
        this.maLopHoc = arrString[0];
        this.tenLopHoc = arrString[1];
        this.maGiaoVien = arrString[2];
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String showInfo() {
        return "LopHoc{" +
                "maLopHoc='" + maLopHoc + '\'' +
                ", tenLopHoc='" + tenLopHoc + '\'' +
                ", maGiaoVien='" + maGiaoVien + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return maLopHoc+','+tenLopHoc+','+maGiaoVien;
    }
}
