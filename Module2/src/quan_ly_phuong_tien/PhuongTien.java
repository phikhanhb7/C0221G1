package quan_ly_phuong_tien;

public abstract class PhuongTien {
    private String bienKS ;
    private String hangSX;
    private int namSX ;
    private String chuSH ;

    public PhuongTien() {
    }

    public PhuongTien(String bienKS, String hangSX, int namSX, String chuSH) {
        this.bienKS = bienKS;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.chuSH = chuSH;
    }

    public String getBienKS() {
        return bienKS;
    }

    public void setBienKS(String bienKS) {
        this.bienKS = bienKS;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSH() {
        return chuSH;
    }

    public void setChuSH(String chuSH) {
        this.chuSH = chuSH;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienKS='" + bienKS + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chuSH='" + chuSH + '\'' +
                '}';
    }
}
