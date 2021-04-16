package bai2_loopiJnava.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập giá trị của A");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giá trị của B");
        int b = Integer.parseInt(input.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0 ){
            System.out.println("No greatest common factor ");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Giá trị ước chung là  " + a);
    }
}
