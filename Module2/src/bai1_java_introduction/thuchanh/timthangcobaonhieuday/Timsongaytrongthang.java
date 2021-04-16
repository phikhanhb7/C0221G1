package bai1_java_introduction.thuchanh.timthangcobaonhieuday;

import java.util.Scanner;

public class Timsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in ) ;
        int month = scanner.nextInt();
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12:
                System.out.print("Tháng " + month + " có 31 ngày");
                break;
            case 2 :
                System.out.print("Tháng " + month + " có 28 or 29 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.print("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.print("Bạn đã nhập sai");

        }
    }
}
