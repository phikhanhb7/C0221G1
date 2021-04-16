package bai2_loopiJnava.bai_tap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
       int choose = 0 ;
       while (choose != 4){
           System.out.println("Enter your choice: ");
            choose = Integer.parseInt(input.nextLine());
           switch (choose){
               case 1 :
                   for (int i = 1 ; i <= 6 ; i ++ ){
                       for (int j = 1 ; j <= 5 ; j ++ ){
                           System.out.print("*");
                       }
                       System.out.print("\n");
                   }
                   break;
               case 2:
                   System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                   for (int i = 1; i <= 5; i++) {
                       for (int j = 1; j <= i; j++) {
                           System.out.print("*");
                       }
                       System.out.println("\n");
                   }
                   break;
               case 3:
                   System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
                   for (int i = 5; i >= 1;  i--) {
                       for (int j = 1; j <= i; j++) {
                           System.out.print("*");
                       }
                       System.out.println("\n");
                   }
                   break;
               case 4:
                   System.exit(0);
               default:
                   System.out.println("No choice!");
           }
       }
    }
}
