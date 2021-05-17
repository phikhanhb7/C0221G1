package models;

public class Villa extends Service {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private String dienTichHoBoi;
    private String soTang ;

    public Villa(String id, String tenDichVu, String dienTichUse, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNghiKhac, String dienTichHoBoi, String soTang) {
        super(id, tenDichVu, dienTichUse, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
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

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
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
                "," + soTang +
                "," + dienTichHoBoi ;
    }
    public String showInfor(){
      return "Villa{" +
              "tieuChuanPhong='" + tieuChuanPhong + '\'' +
              ", tienNghiKhac='" +tienNghiKhac + '\'' +
              ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
              ", soTang='" + soTang + '\'' +
              ", id='" + id + '\'' +
              ", tenDichVu='" +tenDichVu + '\'' +
              ", dienTichUse='" + dienTichUse + '\'' +
              ", chiPhiThue='" +chiPhiThue + '\'' +
              ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
              ", kieuThue='" + kieuThue + '\'' +
              '}';

    }

}
