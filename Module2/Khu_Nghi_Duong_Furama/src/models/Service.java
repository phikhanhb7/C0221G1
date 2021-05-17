package models;

public abstract class Service {
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    String id ;
    String tenDichVu ;
    String dienTichUse ;
    String chiPhiThue ;
    String soNguoiToiDa;
    String kieuThue ;

    public Service(String id ,String tenDichVu, String dienTichUse, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        this.id = id ;
        this.tenDichVu = tenDichVu;
        this.dienTichUse = dienTichUse;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }
    public String getId(){
        return id ;
    }
    public void setId(String id){
        this.id = id ;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichUse() {
        return dienTichUse;
    }

    public void setDienTichUse(String dienTichUse) {
        this.dienTichUse = dienTichUse;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(String soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return id+ "," +
                tenDichVu +
                "," + dienTichUse +
                "," + chiPhiThue +
                "," + soNguoiToiDa +
                ", " + kieuThue;
    }

    public abstract String showInfor();
}
