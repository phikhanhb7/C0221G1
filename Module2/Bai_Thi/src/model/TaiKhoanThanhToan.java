package model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    //Số thẻ, Số tiền trong tài khoản
    private String soThe ;
    private String soTien ;

    public TaiKhoanThanhToan(String id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe,
                             String soTien) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return id +
                "," + maTaiKhoan +
                "," + tenChuTaiKhoan +
                "," + ngayTaoTaiKhoan +
                        "," + soThe +
                        "," + soTien
                ;
    }
    public String showInfor(){
      return   "TaiKhoanThanhToan{" +
              " id='" + id + '\'' +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChuTaiKhoan='" + tenChuTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan='" + ngayTaoTaiKhoan + '\'' +
                "soThe='" + soThe + '\'' +
               ", soTien='" + soTien + '\'' +
                '}';
    }
}
