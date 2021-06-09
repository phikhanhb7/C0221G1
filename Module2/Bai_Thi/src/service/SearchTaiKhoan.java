package service;

import common.DocGhiFile;
import model.TaiKhoanNganHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchTaiKhoan {
    static List<TaiKhoanNganHang> taiKhoanNganHangList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void timKiem() {
        taiKhoanNganHangList = DocGhiFile.docFile("data/bank_accounts.csv");
        String number;
        boolean check = false;
        while (true) {
            System.out.println("Nhập số mã tài khoản or tên bạn muốn tìm ");
            number = scanner.nextLine();
            for (TaiKhoanNganHang item : taiKhoanNganHangList) {
                if ((number.equals(item.getMaTaiKhoan())) || (number.equalsIgnoreCase(item.getTenChuTaiKhoan()))) {
                    System.out.println(item.showInfor());
                    check = true;
                    break;
                }
            }
            if (check) {
                break;
            } else {
                System.err.println("Không tìm thấy bạn ơi ");
            }
        }

    }
}
