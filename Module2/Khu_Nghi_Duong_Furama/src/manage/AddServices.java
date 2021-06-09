package manage;

import comoms.ServicesException;

import java.util.Scanner;

public class AddServices {
     static Scanner scanner = new Scanner(System.in);


    public static String idVilla(){
        String idVilla;
         while (true){
             try {
                 System.out.println("Vui lòng nhập IDVilla");
                 idVilla = scanner.nextLine();
                 ServicesException.kiemIdVilla(idVilla);
                 return idVilla;
             }catch (ServicesException e ){
                 System.err.println(e.getMessage());
             }

         }
    }

    public static String nhapIdHouse(){
        String idHouse;
        while (true){
            try {
                System.out.println("Vui lòng nhập Id House");
                idHouse = scanner.nextLine();
                ServicesException.kiemIdHouse(idHouse);
                return idHouse;
            }catch (ServicesException e ){
                System.err.println(e.getMessage());
            }

        }
    }

    public static String nhapIdRoom(){
        String idRoom;
        while (true){
            try {
                System.out.println("Vui lòng nhập Id House");
                idRoom = scanner.nextLine();
                ServicesException.kiemIdRoom(idRoom);
                return idRoom;
            }catch (ServicesException e ){
                System.err.println(e.getMessage());
            }

        }
    }

    public static String nhapTendichVu(){
        String tenDichVu ;
        while (true){
            try {
                System.out.println("Nhập tên Dịch vụ");
                tenDichVu = scanner.nextLine();
                ServicesException.kiemTenDichVu(tenDichVu);
                return tenDichVu;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapDienTichSuDung(){
        String dienTichSuDung;
        while (true){
            try {
                System.out.println("Nhập diện tích use");
                dienTichSuDung=scanner.nextLine();
                ServicesException.kiemDienTichSuDung(dienTichSuDung);
                return dienTichSuDung;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }

    }

    public static String nhapChiPhiThue(){
        String chiPhiThue ;
        while (true){
            try{
                System.out.println("Nhập chi Phí Thuê");
                chiPhiThue = scanner.nextLine();
                ServicesException.kiemChiPhiThue(chiPhiThue);
                return chiPhiThue;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapSoNguoiToiDa(){
        String soNguoiToiDa ;
        while (true){
            try{
                System.out.println("Nhập chi số người tối đa");
                soNguoiToiDa = scanner.nextLine();
                ServicesException.kiemSoNguoiToiDa(soNguoiToiDa);
                return soNguoiToiDa;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapKieuThue(){
        String kieuThue ;
        while (true){
            try{
                System.out.println("Nhập kiểu thuê");
                kieuThue = scanner.nextLine();
                ServicesException.kiemTenDichVu(kieuThue);
                return kieuThue;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapTieuChuanPhong(){
        String tieuChuanPhong ;
        while (true){
            try{
                System.out.println("Nhập tiêu chuẩn phòng");
                tieuChuanPhong = scanner.nextLine();
                ServicesException.kiemTenDichVu(tieuChuanPhong);
                return tieuChuanPhong;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapTienNghiKhac(){
        String tienNghiKhac ;
        while (true){
            try{
                System.out.println("Nhập tiện nghi khác ");
                tienNghiKhac = scanner.nextLine();
                ServicesException.kiemTenDichVu(tienNghiKhac);
                return tienNghiKhac;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapSoTang(){
        String soTang ;
        while (true){
            try{
                System.out.println("Nhập chi số tầng");
                soTang = scanner.nextLine();
                ServicesException.kiemSoTang(soTang);
                return soTang;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapDienTichHoBoi(){
        String dienTichHoBoi ;
        while (true){
            try{
                System.out.println("Nhập diện tích hồ bơi");
                dienTichHoBoi = scanner.nextLine();
                ServicesException.kiemDienTichHoBoi(dienTichHoBoi);
                return dienTichHoBoi;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapDichvuDiKem(){
        String dichVuDiKem ;
        while (true){
            try{
                System.out.println("Nhập dịch vụ đi kèm");
                dichVuDiKem = scanner.nextLine();
                ServicesException.kiemDichVuDiKem(dichVuDiKem);
                return dichVuDiKem;
            }catch (ServicesException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
