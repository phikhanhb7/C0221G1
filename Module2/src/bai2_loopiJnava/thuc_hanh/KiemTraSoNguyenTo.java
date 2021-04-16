package bai2_loopiJnava.thuc_hanh;

import java.util.Scanner;

import static bai2_loopiJnava.bai_tap.Tim20SoNguyenToDauTien.TimSoNguyenTo;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ssố bạn muốn tìm ");
        int number = Integer.parseInt(scanner.nextLine());
            if (TimSoNguyenTo(number))
                System.out.println(number + " là số nguyên tố ");
            else
                System.out.println(number + " không phải số nguyên tố");
        }
    }
