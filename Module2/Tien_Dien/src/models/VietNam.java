package models;

public class VietNam extends KhachHang {
    private String loaiKhachHang;
    private double dinhMuctieuThu;

    public VietNam(String maKhachHang, String tenKhachHang, String loaiKhachHang, double dinhMuctieuThu) {
        super(maKhachHang, tenKhachHang);
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMuctieuThu = dinhMuctieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public double getDinhMuctieuThu() {
        return dinhMuctieuThu;
    }

    public void setDinhMuctieuThu(double dinhMuctieuThu) {
        this.dinhMuctieuThu = dinhMuctieuThu;
    }

    @Override
    public String toString() {
        return super.toString() +
                loaiKhachHang + "," +
                dinhMuctieuThu;
    }
}
