package controllers;

import service.Add;
import service.Edit;
import service.Search;
import service.Show;

import java.util.Scanner;

public class MainControllers {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    public static void menu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN\n" +
                "Chọn chức năng:\n" +
                "1. Thêm mới khách hàng.\n" +
                "2. Hiện thị thông tin khách hàng\n" +
                "3. Tìm kiếm khách hàng\n" +
                "4. Thêm mới hóa đơn\n" +
                "5. Chỉnh sửa hóa đơn\n" +
                "6. Hiện thị thông  tin chi tiết hóa đơn\n" +
                "7. Thoát\n" +
                "\n");
        System.out.println("Chọn Chức Năng : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                Add.addCustomers();
                break;
            case 2:
                Show.showCustomer();
                break;
            case 3:
                Search.searchCustomer();
                break;
            case 4:
                Add.addBill();
                break;
            case 5:
                Edit.editBill();
                break;
            case 6:
                Show.showBill();
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("Sai Số Rồi Bạn !!!");
        }
    }


}


