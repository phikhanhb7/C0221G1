package quan_ly_phuong_tien;

public class Oto extends PhuongTien {
    private int soGhe ;
    private String kieuXe ;

    public Oto() {

    }

    public Oto(String bienKS, String hangSX, int namSX, String chuSH, int soGhe, String kieuXe) {
        super(bienKS, hangSX, namSX, chuSH);
        this.soGhe = soGhe;
        this.kieuXe = kieuXe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" + super.toString()+
                "soGhe=" + soGhe +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
