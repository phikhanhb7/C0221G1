package bai1_java_introduction.baitap.bai1.bai2;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập tiền dolla ban muốn đổi");
        int usa = scanner.nextInt();
        int vnd = usa * rate ;
        System.out.println("Số tiền bạn đổi được là " + vnd + "VND");
    }
}
