package bai1_java_introduction.thuchanh.phuongtrinhbacnhat;

import java.util.Scanner;

public class Phuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.print("Linear Equation Resolver\n");
        System.out.print("Given a equation as 'a * x + b = 0', please enter constants:\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị của a ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị của b ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị của c ");
        double c = scanner.nextDouble();

        if ( a!= 0 ){
            double aswer = (c-b)/a ;
            System.out.print("Nghiệm của phương trình là " + aswer);
        }else {
            if (b==0){
                System.out.print("Phương trình có vô số nghiệm!");
            }else {
                System.out.print("Phương trình vô nghiệm ");
            }
        }

    }
}
