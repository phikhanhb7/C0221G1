package Quan_Ly_Truong_Hoc.src.models;

public class SinhVien extends ConNguoi {
    static public int temp=1;
    private int maSinhVien;
    private String maLopHoc;

    public SinhVien(String[] arrString) {
        super(arrString);
        this.maLopHoc = arrString[5];
        this.maSinhVien= Integer.parseInt(arrString[0]);
    }

    public SinhVien(String ten, String ngaySinh, String gioiTinh, String soDienThoai, String maLopHoc) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.maSinhVien=temp;
        this.maLopHoc = maLopHoc;
        temp++;
    }

    public SinhVien(int maSinhVien,String ten, String ngaySinh, String gioiTinh, String soDienThoai, String maLopHoc) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.maSinhVien=maSinhVien;
        this.maLopHoc = maLopHoc;

        temp++;
    }



    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    @Override
    public String showInfo() {
        return "SinhVien{" +
                "ma='" + this.getMaSinhVien() + '\'' +
                ", ten='" + this.getTen() + '\'' +
                ", ngaySinh='" + this.getNgaySinh() + '\'' +
                ", gioiTinh='" + this.getGioiTinh() + '\'' +
                ", soDienThoai='" + this.getSoDienThoai() + '\'' +
                ", maLopHoc='" + maLopHoc + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return   maSinhVien +','+ super.toString()+','+maLopHoc;
    }
}
