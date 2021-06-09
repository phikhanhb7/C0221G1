package bai15_exception.bai_tap;

import java.util.Scanner;

public class Test {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        while (true){
            try {
                System.out.println(" Nhập cạnh a");
                int a = Integer.parseInt(scanner.nextLine()) ;
                System.out.println(" Nhập cạnh b");
                int b = Integer.parseInt(scanner.nextLine()) ;
                System.out.println(" Nhập cạnh c");
                int c = Integer.parseInt(scanner.nextLine()) ;
                IsATriangle isATriangle = new IsATriangle(a,b,c);
                break;
            }
            catch (IllegalTriangleException ex){
                System.out.println(ex.getMessage());
            }
        }

    }
}
