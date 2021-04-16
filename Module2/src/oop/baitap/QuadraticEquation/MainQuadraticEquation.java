package oop.baitap.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Nhập giá trị của A");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Nhập giá trị của b");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Nhập giá trị của c");
        double c = Double.parseDouble(input.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c) ;
        MethodQuadraticEquation methodQuadraticEquation = new MethodQuadraticEquation();
        methodQuadraticEquation.getDiscriminant(quadraticEquation) ;
    }
}
