package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class MinTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Nhập vào số lương phần tử của mãng");
        int number = Integer.parseInt(input.nextLine());

        int[] arr1 = new int[number] ;
        int i ;
        for (i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "]=");
            arr1[i] = input.nextInt();
        }
        int min = arr1[0] ;
        for (i = 1 ; i < arr1.length ; i ++  ){
            if ( arr1[i] < min) {
                 min =  arr1[i] ;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mãng là " + min);
    }
}
