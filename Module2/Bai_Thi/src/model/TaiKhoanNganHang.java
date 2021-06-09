package model;

public abstract class TaiKhoanNganHang {
    //Tài khoản ngân hàng bao gồm các thông tin: Id tài khoản, Mã tài khoản, Tên chủ tài khoản, Ngày tạo tài khoản
    protected String id ;
    protected String maTaiKhoan;
    protected String tenChuTaiKhoan;
    protected String ngayTaoTaiKhoan;

    public TaiKhoanNganHang(String id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan) {
        this.id = id;
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return id +
                "," + maTaiKhoan +
                "," + tenChuTaiKhoan +
                "," + ngayTaoTaiKhoan;
    }
    public abstract String showInfor();
}
