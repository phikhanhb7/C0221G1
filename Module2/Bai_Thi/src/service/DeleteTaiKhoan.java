package service;

import common.DocGhiFile;
import controller.ControllerMenu;
import model.TaiKhoanNganHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteTaiKhoan {
    static List<TaiKhoanNganHang> taiKhoanNganHangList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void xoaTaiKhoan() {
        taiKhoanNganHangList = DocGhiFile.docFile("data/bank_accounts.csv");
        String number;
        boolean check = false;
        String choose;
        while (true) {
            System.out.println("Nhập mã tài khoản bạn muốn xóa ");
            number = scanner.nextLine();
            for (int i = 0; i < taiKhoanNganHangList.size(); i++) {
                if (number.equals(taiKhoanNganHangList.get(i).getMaTaiKhoan())) {
                    System.out.println("Đã tìm thấy , Bạn cóm muốn xóa không " +
                            "1. Có " +
                            "2. Không ");
                    choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            taiKhoanNganHangList.remove(taiKhoanNganHangList.get(i));
                            DocGhiFile.ghiFile("data/bank_accounts.csv",taiKhoanNganHangList,false);
                            System.out.println("Đã xóa thành công");
                            check = true;
                            break;
                        case "2":
                            ControllerMenu.displayMenu();
                    }
                }
            }


            if (check) {
                break;
            } else {
                System.err.println("Không tìm thấy mã tài khoản này ");
            }
        }
    }
}
