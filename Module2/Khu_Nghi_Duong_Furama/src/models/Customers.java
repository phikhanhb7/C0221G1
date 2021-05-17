package models;

public class Customers {
    //Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách, Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().

    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soChungMinh;
    private String soDienThoai;
    private String email;
    private String loaiKhach;
    private String diaChi ;

    public Customers(String hoTen, String ngaySinh, String gioiTinh, String soChungMinh, String soDienThoai, String email,String loaiKhach, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soChungMinh = soChungMinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach= loaiKhach;
        this.diaChi = diaChi;

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoChungMinh() {
        return soChungMinh;
    }

    public void setSoChungMinh(String soChungMinh) {
        this.soChungMinh = soChungMinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getLoaiKhach(){
        return loaiKhach ;
    }
    public void setLoaiKhach(String loaiKhach){
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return hoTen +
                "," + ngaySinh +
                "," + gioiTinh +
                "," + soChungMinh +
                "," + soDienThoai +
                "," + email +
                "," + loaiKhach +
                "," + diaChi;
    }
   public String showInfor(){
       return "Customers{" +
               "hoTen='" + hoTen + '\'' +
               ", ngaySinh='" + ngaySinh + '\'' +
               ", gioiTinh='" + gioiTinh + '\'' +
               ", soChungMinh='" + soChungMinh + '\'' +
               ", soDienThoai='" + soDienThoai + '\'' +
               ", email='" + email + '\'' +
               ", LoaiKhach='" + loaiKhach + '\'' +
               ", diaChi='" + diaChi + '\'' +
               '}';
   }



}
