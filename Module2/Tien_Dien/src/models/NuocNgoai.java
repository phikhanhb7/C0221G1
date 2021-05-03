package models;

public class NuocNgoai extends KhachHang {
    private String quocTich;

    public NuocNgoai(String maKhachHang, String tenKhachHang, String quocTich) {
        super(maKhachHang, tenKhachHang);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return super.toString() +
                quocTich;
    }
}
