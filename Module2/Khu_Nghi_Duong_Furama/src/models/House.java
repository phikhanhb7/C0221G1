package models;

public class House extends Service {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
    private String tieuChuanPhong;
    private String tienNghiKhac;
   private String soTang ;

    public House(String id, String tenDichVu, String dienTichUse, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNghiKhac, String soTang) {
        super(id, tenDichVu, dienTichUse, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString() +
                ","+ tieuChuanPhong +
                "," + tienNghiKhac +
                "," + soTang;
    }
    public String showInfor(){
       return "House{" +
               "tieuChuanPhong='" + tieuChuanPhong + '\'' +
               ", tienNghiKhac='" + tienNghiKhac + '\'' +
               ", soTang='" + soTang + '\'' +
               ", id='" + id + '\'' +
               ", tenDichVu='" + tenDichVu + '\'' +
               ", dienTichUse='" + dienTichUse + '\'' +
               ", chiPhiThue='" + chiPhiThue + '\'' +
               ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
               ", kieuThue='" + kieuThue + '\'' +
               '}';
    }

}
