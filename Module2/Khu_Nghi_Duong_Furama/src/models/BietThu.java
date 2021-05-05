package models;

public class BietThu extends DichVu {
       private String tieuChuanPhong ;
       private String tienNghiKhac ;
       private  double dienTichHoBoi;
       private int soTang;

    public BietThu(String tieuChuanPhong, String tienNghiKhac, double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public BietThu(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNghiKhac, double dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
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

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "BietThu{ " +
                "tenDichVu='" + super.getTenDichVu() + '\'' +
                ", dienTichSuDung=" + super.getDienTichSuDung()+'\'' +
                ", chiPhiThue=" + super.getChiPhiThue() +'\'' +
                ", soNguoiToiDa=" + super.getSoNguoiToiDa() +'\'' +
                ", kieuThue='" + super.getKieuThue() + '\'' +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +'\'' +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public String toString() {
        return super.toString()+tieuChuanPhong +","+ tienNghiKhac +"," + dienTichHoBoi +","+ soTang;
    }
}
