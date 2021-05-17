package models;

public class Room extends Service {
    //Dịch vụ miễn phí đi kèm.
    private String dichVuDiKem;

    public Room(String id, String tenDichVu, String dienTichUse, String chiPhiThue, String soNguoiToiDa, String kieuThue, String dichVuDiKem) {
        super(id, tenDichVu, dienTichUse, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + dichVuDiKem ;
    }
    public String showInfor(){
       return "Room{" +
               "dichVuDiKem='" + dichVuDiKem + '\'' +
               ", id='" + id + '\'' +
               ", tenDichVu='" + tenDichVu + '\'' +
               ", dienTichUse='" + dienTichUse + '\'' +
               ", chiPhiThue='" + chiPhiThue + '\'' +
               ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
               ", kieuThue='" + kieuThue + '\'' +
               '}';
    }

}
