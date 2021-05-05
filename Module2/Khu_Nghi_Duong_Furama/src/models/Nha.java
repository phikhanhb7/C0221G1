package models;

public class Nha extends DichVu{
    private String tieuChuanPhong ;
    private String tienNghiKhac;
    private int soTang ;

    public Nha(String tieuChuanPhong, String tienNghiKhac, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
    }

    public Nha(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNghiKhac, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "Nha{" + "tenDichVu='" + super.getTenDichVu() + '\'' +
                ", dienTichSuDung=" + super.getDienTichSuDung()+'\'' +
                ", chiPhiThue=" + super.getChiPhiThue() +'\'' +
                ", soNguoiToiDa=" + super.getSoNguoiToiDa() +'\'' +
                ", kieuThue='" + super.getKieuThue() + '\'' +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public String toString() {
        return super.toString()+tieuChuanPhong +","+ tienNghiKhac +"," + soTang ;
    }
}
