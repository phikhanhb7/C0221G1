package controllers;

import commons.RegexValidate;
import service.AddCar;
import service.DeleteCar;
import service.ShowCar;

import java.util.Scanner;

public class MainControllers {
     static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Chọn chức năng:\n" +
                "1. Thêm mới phương tiện.\n" +
                "2. Hiện thị phương tiện\n" +
                "3. Xóa phương tiện\n" +
                "4. Thoát\n");
        String choose;
        System.out.println("Nhập lựa chọn của bạn");
        choose = input.nextLine();
        while (!RegexValidate.checkNumberCase(choose)) {
            System.out.println("Vui long nhap lai");
            choose = input.nextLine();
        }
        int number = Integer.parseInt(choose);

        switch (number) {
            case 1:
                themPhuongTien();
                break;
            case 2:
                hienThiPhuongTien();
                break;
            case 3:
                xoaPhuongTien();
                break;
            case 4:
                System.out.println("Tam biet");
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại ");
        }


    }

    public static void themPhuongTien() {
        System.out.println("1. Thêm xe tải,\n" +
                "2. Thêm ôtô, \n" +
                "3. Thêm  xe máy.\n" +
                "4. BackMenu ");
        int choose;
        System.out.println("Nhập lựa chọn của bạn ");
        choose = Integer.parseInt(input.nextLine());

        switch (choose) {
            case 1:
                AddCar.addXeTai();
                break;
            case 2:
                AddCar.addOTo();
                break;
            case 3:
                AddCar.addXeMay();
                break;
            case 4:
                menu();
            default:
                System.out.println("Nhập sai");
        }
    }



    public static void xoaPhuongTien() {
        System.out.println("Bạn Muốn Xóa Phương Tiện Nào : ");
        System.out.println("1. Xoa Oto");
        System.out.println("2. Xoa Xe May");
        System.out.println("3. Xoa Xe Tai");
        System.out.println("4. BacktoMenu");
        while (true) {
            String choose = input.nextLine();
            while (!RegexValidate.checkNumberCase(choose)) {
                System.out.println("Vui long nhap lai");
                choose = input.nextLine();
            }
            int number = Integer.parseInt(choose);
            switch (number) {
                case 1:
                    DeleteCar.deleteOto();
                    break;
                case 2:
                    DeleteCar.deleteXeMay();
                    break;
                case 3:
                    DeleteCar.deleteXeTai();
                    break;
                case 4:
                    menu();
                default:
                    System.out.println("Vui long nhap lai ");

            }
        }


    }


    private static void hienThiPhuongTien() {
        System.out.println("Chon phuong tien can hien thi \n" + "1. Hiện thị xe tải.\n" +
                "2. Hiện thị ôtô. \n" +
                "3. Hiện  xe máy.\n"
                + "4. backMenu");

        while (true) {
            String choose = input.nextLine();
            while (!RegexValidate.checkNumberCase(choose)) {
                System.out.println("Vui long nhap lai");
                choose = input.nextLine();
            }
            int number = Integer.parseInt(choose);

            switch (number) {
                case 1:
                    ShowCar.showXeTai();
                    break;
                case 2:
                    ShowCar.showOTo();
                    break;
                case 3:
                    ShowCar.showXeMay();
                    break;
                case 4:
                    menu();
                default:
                    System.out.println("Vui long nhap lai ");
            }
        }
    }
}
