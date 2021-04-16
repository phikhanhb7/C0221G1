package bai1_java_introduction.thuchanh.toantu;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight ;
        float height ;
        System.out.println("Nhập vào chiều rộng ");
        weight = scanner.nextFloat();
        System.out.println("Nhập vào chiều cao ");
        height = scanner.nextFloat();
        float area = weight * height ;
        System.out.println("Diện tích là " + area );
    }
}
