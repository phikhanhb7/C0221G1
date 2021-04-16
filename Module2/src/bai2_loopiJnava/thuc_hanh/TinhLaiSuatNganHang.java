package bai2_loopiJnava.thuc_hanh;

import java.util.Scanner;

public class TinhLaiSuatNganHang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn vay");
        double money = Double.parseDouble(input.nextLine());
        System.out.println("Nhập số tháng vay ");
        int month = Integer.parseInt(input.nextLine());
        System.out.println("Nhập lãi suất");
        double rate = Double.parseDouble(input.nextLine());
        double total = 0;
        for(int i = 0; i < month; i++){
            total += money * (rate/100)/12 * month;

        }
        System.out.println("Tổng tiên bạn phải đóng là " + total);
    }
}
