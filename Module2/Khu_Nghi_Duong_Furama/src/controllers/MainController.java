package controllers;

import commons.DichVuException;
import commons.DocGhiFile;
import models.BietThu;
import models.DichVu;
import models.Nha;
import models.Phong;

import java.util.*;

public class MainController {

    public static void main(String[] args) {
        while (true){
            displayMainMenu();
        }
    }
    static Scanner scanner = new Scanner(System.in);
    static List<DichVu> dichVuList = new ArrayList<>();

    public static void displayMainMenu(){
        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");

        int choose = 0 ;
        while (true) {
            System.out.println("Nhập lựa chọn của bạn ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1 :
                    addService();
                    break;
                case 2:
                    showService();
                case 3 :
                    addCustomer();
                    break;
                case 4 :
                    showInformationCustomer();
                    break;
                case 5:
                    addBooking();
                    break;
                case 6:
                    showInformationEmployee();
                    break;
                case 7 :
                    System.out.println("GOOD BYE");
                    System.exit(0);
            }
        }
    }

    private static void showInformationEmployee() {
    }

    private static void addBooking() {
    }

    private static void showInformationCustomer() {
    }

    private static void addCustomer() {
    }

    private static void showService() {
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        int choose = 0 ;
        while (true){
            System.out.println("Nhap lua chon cua ban");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    showAllVilla();
                    break;
                case 2 :
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showNameVilla();
                    break;
                case 5:
                    showNameHouse();
                    break;
                case 6:
                    showNameRoom();
                    break;
                case 7 :
                    displayMainMenu();
                    break;
                case 8:
                    System.out.println("GOOD BYE");
                    System.exit(0);
            }
        }
    }

    private static void showNameRoom() {
        Set<String> dichVuSet = new TreeSet<>();
        DocGhiFile.docFile("dichvu.csv");
        for (DichVu dichVu : dichVuList){
            if (dichVu instanceof Phong){
                dichVuSet.add(dichVu.getTenDichVu());
            }
        }
        Iterator itr = dichVuSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void showNameHouse() {
        Set<String> dichVuSet = new TreeSet<>();
        DocGhiFile.docFile("dichvu.csv");
        for (DichVu dichVu : dichVuList){
            if (dichVu instanceof Nha){
                dichVuSet.add(dichVu.getTenDichVu());
            }
        }
        Iterator itr = dichVuSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void showNameVilla() {
        Set<String> dichVuSet = new TreeSet<>();
        DocGhiFile.docFile("dichvu.csv");
        for (DichVu dichVu : dichVuList){
            if (dichVu instanceof BietThu){
                dichVuSet.add(dichVu.getTenDichVu());
            }
        }
        Iterator itr = dichVuSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    private static void showAllRoom() {
        DocGhiFile.docFile("dichvu.csv");
        for (DichVu dichVu : dichVuList){
            if (dichVu instanceof Phong){
                System.out.println(dichVu.showInfor());
            }
        }
    }

    private static void showAllHouse() {
        DocGhiFile.docFile("dichvu.csv");
        for (DichVu dichVu : dichVuList){
            if (dichVu instanceof Nha){
                System.out.println(dichVu.showInfor());
            }
        }
    }

    private static void showAllVilla() {
        DocGhiFile.docFile("dichvu.csv");
        for (DichVu dichVu : dichVuList){
            if (dichVu instanceof BietThu){
                System.out.println(dichVu.showInfor());
            }
        }
    }

    private static void addService() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        int chooose = 0 ;
        while (true){
            System.out.println("Nhap lua chon cua ban");
            chooose = Integer.parseInt(scanner.nextLine());

            switch (chooose){
                case 1 :
                    addnewVilla();
                    break;
                case 2:
                    addnewHouse();
                    break;
                case 3 :
                    addnewRoom();
                    break;
                case 4 :
                    displayMainMenu();
                case 5 :
                    System.out.println("GOOD BYE");
                    System.exit(0);
            }
        }
    }

    private static void addnewRoom() {
        String tenDichVu = "";
        while (true){
            System.out.println("Nhap ten dich vu ");
            tenDichVu = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(tenDichVu);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String dienTichSuDung = "" ;
        while (true){
            System.out.println("Dien tich su dung");
            dienTichSuDung = scanner.nextLine();
            try {
                DichVuException.kiemTraDienTich(dienTichSuDung);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String chiPhiThue = "";
        while (true){
            System.out.println("Chi phi thue");
            chiPhiThue = (scanner.nextLine());
            try {
                DichVuException.kiemTraCiPhiThue(chiPhiThue);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }


        String soNguoiToiDa = "" ;
        while (true){
            System.out.println("so nguoi toi da");
            soNguoiToiDa =(scanner.nextLine());
            try {
                DichVuException.kiemTraSoNguoiToiDa(soNguoiToiDa);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }

        }


        String kieuThue = "";
        while (true){
            System.out.println(" kieu thue");
            kieuThue = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(kieuThue);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String dichVuDiKem = "" ;
        while (true){
            System.out.println("Dich vu di kiem");
             dichVuDiKem = scanner.nextLine();
            try {
                DichVuException.kiemTraDichVuDiKem(dichVuDiKem);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }


        Phong phong = new Phong(tenDichVu,Double.parseDouble(dienTichSuDung),Double.parseDouble(chiPhiThue),Integer.parseInt(soNguoiToiDa),kieuThue,dichVuDiKem);

        dichVuList.add(phong);
        DocGhiFile.ghiFile("dichvu.csv" , dichVuList , true);
    }

    private static void addnewHouse() {
        String tenDichVu = "";
        while (true){
            System.out.println("Nhap ten dich vu ");
            tenDichVu = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(tenDichVu);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String dienTichSuDung = "" ;
        while (true){
            System.out.println("Dien tich su dung");
            dienTichSuDung = scanner.nextLine();
            try {
                DichVuException.kiemTraDienTich(dienTichSuDung);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String chiPhiThue = "";
        while (true){
            System.out.println("Chi phi thue");
            chiPhiThue = (scanner.nextLine());
            try {
                DichVuException.kiemTraCiPhiThue(chiPhiThue);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }


        String soNguoiToiDa = "" ;
        while (true){
            System.out.println("so nguoi toi da");
            soNguoiToiDa =(scanner.nextLine());
            try {
                DichVuException.kiemTraSoNguoiToiDa(soNguoiToiDa);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }

        }


        String kieuThue = "";
        while (true){
            System.out.println(" kieu thue");
            kieuThue = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(kieuThue);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String tieuchuanPhong = "";
        while (true){
            System.out.println("tieu chuan phong");
            tieuchuanPhong = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(tieuchuanPhong);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }
        String tiennghiKhac = "" ;
        while (true){
            System.out.println("tien nghi khac");
            tiennghiKhac = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(tiennghiKhac);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }
        String soTang = "" ;
        while (true){
            System.out.println("so Tang");
            soTang = (scanner.nextLine());
            try {
                DichVuException.kiemTraSoTang(soTang);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        Nha nha = new Nha(tenDichVu,Double.parseDouble(dienTichSuDung),Double.parseDouble(chiPhiThue),Integer.parseInt(soNguoiToiDa),kieuThue,tieuchuanPhong,tiennghiKhac,Integer.parseInt(soTang));
        dichVuList.add(nha);
        DocGhiFile.ghiFile("dichvu.csv",dichVuList,true);
    }

    private static void addnewVilla() {
        String tenDichVu = "";
        while (true){
            System.out.println("Nhap ten dich vu ");
            tenDichVu = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(tenDichVu);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

         String dienTichSuDung = "" ;
        while (true){
            System.out.println("Dien tich su dung");
            dienTichSuDung = scanner.nextLine();
            try {
                DichVuException.kiemTraDienTich(dienTichSuDung);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String chiPhiThue = "";
        while (true){
            System.out.println("Chi phi thue");
           chiPhiThue = (scanner.nextLine());
            try {
                DichVuException.kiemTraCiPhiThue(chiPhiThue);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }


        String soNguoiToiDa = "" ;
        while (true){
            System.out.println("so nguoi toi da");
           soNguoiToiDa =(scanner.nextLine());
            try {
                DichVuException.kiemTraSoNguoiToiDa(soNguoiToiDa);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }

        }


        String kieuThue = "";
        while (true){
            System.out.println(" kieu thue");
            kieuThue = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(kieuThue);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String tieuchuanPhong = "";
        while (true){
            System.out.println("tieu chuan phong");
            tieuchuanPhong = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(tieuchuanPhong);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }

        String tiennghiKhac = "" ;
        while (true){
            System.out.println("tien nghi khac");
             tiennghiKhac = scanner.nextLine();
            try {
                DichVuException.kiemTraTenDichVu(tiennghiKhac);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }


        String dienTichHoBoi = "" ;
        while (true){
            System.out.println(" dien tich ho boi ");
             dienTichHoBoi = (scanner.nextLine());
            try {
                DichVuException.kiemTraDienTich(dienTichHoBoi);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }


       String soTang = "" ;
        while (true){
            System.out.println("so Tang");
            soTang = (scanner.nextLine());
            try {
                DichVuException.kiemTraSoTang(soTang);
                break;
            } catch (DichVuException e) {
                System.err.println(e.getMessage());
            }
        }


        BietThu bietThu = new BietThu(tenDichVu,Double.parseDouble(dienTichSuDung),
                Double.parseDouble(chiPhiThue),Integer.parseInt(soNguoiToiDa),kieuThue,tieuchuanPhong,tiennghiKhac,Double.parseDouble(dienTichHoBoi),Integer.parseInt(soTang));


        dichVuList.add(bietThu);
        DocGhiFile.ghiFile("dichvu.csv" ,dichVuList,true);
    }
}
