package controller;

import service.DeleteTaiKhoan;
import service.SearchTaiKhoan;
import service.ServiceTaiKhoanNganHang;

import java.util.Scanner;

public class ControllerMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        String choose;
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOAN NGÂN HÀNG ");
            System.out.println("1.\t Thêm tài khoản \n" +
                    "2.\tXóa\n" +
                    "3.\tXem theo danh sách \n" +
                    "4.\tTìm kiếm \n" +
                    "5.\tExit\n");
            System.out.println(" Nhập lựa chọn của bạn ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    themTaiKhoan();
                    break;
                case "2":
                    DeleteTaiKhoan.xoaTaiKhoan();
                    break;
                case "3":
                    xemTaiKhoan();
                    break;
                case "4":
                    SearchTaiKhoan.timKiem();
                    break;
                case "5":
                    System.out.println("GOOD BYE");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1 đến 8 ");
            }
        }
    }



    private static void xemTaiKhoan() {
        String choose;
        while (true) {
            System.out.println("Bạn hiển thị tài khoản nào: ");
            System.out.println("1.\t Tài khoản thanh toán \n" +
                    "2.\tTài khoản tiết kiệm \n" +
                    "3.\t Trở lại menu chính  \n" +
                    "4.\tExit\n");
            System.out.println(" Nhập lựa chọn của bạn ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    ServiceTaiKhoanNganHang.hienThiTaiKhoanThanhToan();
                    break;
                case "2":
                    ServiceTaiKhoanNganHang.hienThiTaiKhoanTietKiem();
                    break;
                case "3":
                    displayMenu();
                    break;
                case "4":
                    System.out.println("GOOD BYE");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1 đến 4 ");

            }

        }
    }



    private static void themTaiKhoan() {
        String choose;
        while (true) {
            System.out.println("Bạn muốn thêm tài khoản nào :  ");
            System.out.println("1.\t Tài khoản thanh toán \n" +
                    "2.\tTài khoản tiết kiệm \n" +
                    "3.\t Trở lại menu chính  \n" +
                    "4.\tExit\n");
            System.out.println(" Nhập lựa chọn của bạn ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    ServiceTaiKhoanNganHang.themTaiKhoanThanhToan();
                    break;
                case "2":
                    ServiceTaiKhoanNganHang.themTaiKhoanTietKiem();
                    break;
                case "3":
                    displayMenu();
                    break;
                case "4":
                    System.out.println("GOOD BYE");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1 đến 4 ");

            }

        }
    }


}