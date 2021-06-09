package model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    //Số tiền gửi tiết kiệm, Ngày gửi tiết kiệm, Lãi suất, Kì hạn.
    private String soTienTietKiem ;
    private String ngayGui ;
    private String laiSuat ;
    private String kiHan ;

    public TaiKhoanTietKiem(String id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soTienTietKiem, String ngayGui, String laiSuat, String kiHan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienTietKiem = soTienTietKiem;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public String getSoTienTietKiem() {
        return soTienTietKiem;
    }

    public void setSoTienTietKiem(String soTienTietKiem) {
        this.soTienTietKiem = soTienTietKiem;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return id +
                "," + maTaiKhoan +
                "," + tenChuTaiKhoan +
                "," + ngayTaoTaiKhoan+ "," +
                        soTienTietKiem +
                        "," + ngayGui +
                        "," + laiSuat +
                        "," + kiHan ;
    }
    public String showInfor(){
        return "TaiKhoanTietKiem{" +
                " id='" + id + '\'' +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChuTaiKhoan='" + tenChuTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan='" + ngayTaoTaiKhoan + '\'' +
                "soTienTietKiem='" + soTienTietKiem + '\'' +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
