package quan_ly_phuong_tien;

public class XeTai extends PhuongTien {
    private double trongTai ;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKS, String hangSX, int namSX, String chuSH, double trongTai) {
        super(bienKS, hangSX, namSX, chuSH);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
               trongTai;
    }
}
