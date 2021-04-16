package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class KhoiTaoMotMang {
    public static void KhoiTao(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        // khởi tạo arr
        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Nhập  phần tử thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Mãng mới của bạn là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }

}
