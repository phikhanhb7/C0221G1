package controllers;

import comoms.DocGhiFile;
import manage.*;
import models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    static List<Customers> customersList = new ArrayList<>();

    public static void main(String[] args) {
        displayMenu();
    }


    public static void displayMenu() {
        String choose;
        while (true) {
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tBuff Cinema4D :)) \n" +
                    "8.\tExit\n");
            System.out.println(" Nhập lựa chọn của bạn ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addServices();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    addCustomers();
                    break;
                case "4":
                    showCustomers();
                    break;
                case "5":
                    NewBooking.addBooking();
                    break;
                case "6":
                    ShowEmployee.menuEmployee();
                    break;
                case "7":
                    Cinema4D.addCinemaTicket();
                case "8":
                    System.out.println("GOOD BYE");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1 đến 8 ");
            }
        }
    }



    private static void showCustomers() {
        customersList = DocGhiFile.docFileCustomers("Customers.csv");
        customersList.sort(Comparator.comparing(Customers::getHoTen).thenComparing(Customers::getNgaySinh));
        for (Customers customer : customersList) {
            System.out.println(customer.showInfor());
        }

    }

    private static void addCustomers() {
        String hoTen = AddCustomers.nhapHoTen();
        String ngaySinh = AddCustomers.nhapNgaySinh();
        String gioiTinh = AddCustomers.nhapGioiTinh();
        String soChungMinh = AddCustomers.nhapSoChungMinh();
        String soDienThoai = AddCustomers.nhapSoDienThoai();
        String email = AddCustomers.nhapEmail();
        String loaiKhach = AddCustomers.nhapLoaiKhach();
        String diaChi = AddCustomers.nhapDiaChi();

        Customers customer = new Customers(hoTen, ngaySinh, gioiTinh, soChungMinh, soDienThoai, email, loaiKhach, diaChi);
        customersList.add(customer);
        DocGhiFile.ghiFileCustomer("Customers.csv", customersList, true);
    }

    private static void showServices() {
        String choose;
        while (true) {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("Nhập lựa chọn :");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    ManageServices.showVilla();
                    break;
                case "2":
                    ManageServices.showHouse();
                    break;
                case "3":
                    ManageServices.showRoom();
                    break;
                case "4":
                    ManageServices.showNameVillaDuplicate();
                    break;
                case "5":
                    ManageServices.showNameHouseDuplicate();
                    break;
                case "6":
                    ManageServices.showNameRoomDuplicate();
                    break;
                case "7":
                    displayMenu();
                case "8":
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng từ 1 đến 8");
            }
        }


    }


    private static void addServices() {

        String choose;
        while (true) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Nhập lựa chọn ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    ManageServices.addVilla();
                    break;
                case "2":
                    ManageServices.addHouse();
                    break;
                case "3":
                    ManageServices.addRoom();
                    break;
                case "4":
                    displayMenu();
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng từ 1 đến 5");
            }
        }
    }


}
