package models;

public class Phong extends DichVu {
    private String dichVuDiKem ;

    public Phong(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Phong(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String showInfor() {
        return "Phong{" +  "tenDichVu='" + super.getTenDichVu() + '\'' +
                ", dienTichSuDung=" + super.getDienTichSuDung()+'\'' +
                ", chiPhiThue=" + super.getChiPhiThue() +'\'' +
                ", soNguoiToiDa=" + super.getSoNguoiToiDa() +'\'' +
                ", kieuThue='" + super.getKieuThue() + '\'' +
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + dichVuDiKem ;
    }
}
