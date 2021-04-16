package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class NoiHaiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr = new int[10];
        int i;
        System.out.println("Nhập các phần tử của mảng 1");
        for (i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "]=");
            arr1[i] = input.nextInt();
        }
        System.out.println("Nhập các phần tử của mảng 2");
        for (i = 0; i < arr2.length; i++) {
            System.out.print("arr2[" + i + "]=");
            arr2[i] = input.nextInt();
        }
        for (i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
