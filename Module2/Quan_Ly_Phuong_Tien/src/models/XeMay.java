package models;

public class XeMay extends PhuongTien {
    private double congSuat ;

    public XeMay() {
    }

    public XeMay(String bienKS, String hangSX, int namSX, String chuSH , double congSuat) {
        super(bienKS, hangSX, namSX, chuSH);
        this.congSuat = congSuat ;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return  super.toString() +
                congSuat;
    }
}
