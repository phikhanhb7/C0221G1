package Quan_Ly_Truong_Hoc.src.models;

public class GiaoVien extends ConNguoi {
    private String maGiaoVien;

    public GiaoVien(String[] arrString) {
        super(arrString);
        this.maGiaoVien=arrString[0];
    }

    public GiaoVien(String maGiaoVien, String ten, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.maGiaoVien=maGiaoVien;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    @Override
    public String showInfo() {
        return "GiaoVien{" +
                "ma='" + this.getMaGiaoVien() + '\'' +
                ", ten='" + this.getTen() + '\'' +
                ", ngaySinh='" + this.getNgaySinh() + '\'' +
                ", gioiTinh='" + this.getGioiTinh() + '\'' +
                ", soDienThoai='" + this.getSoDienThoai() + '\'' +
                "}";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
