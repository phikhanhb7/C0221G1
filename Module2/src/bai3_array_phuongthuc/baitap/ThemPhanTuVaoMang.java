package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        // khởi tạo arr
        int[] arr = new int[n];
        System.out.print("Property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("Nhập phần tử muốn thêm vào ");
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí muốn thêm phần tử vào ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("Không thể chèn được ");

        } else {
            int arrNew[] = new int[arr.length + 1];
            for (int i = 0; i < arrNew.length; i++) {
                if (i < index - 1) {
                    arrNew[i] = arr[i];
                } else if (i == index - 1) {
                    arrNew[i] = k;
                } else {
                    arrNew[i] = arr[i - 1];
                }
            }
            System.out.println("Mãng mới cảu bạn là ");
            for (int j = 0; j < arr.length + 1; j++) {
                System.out.print(arrNew[j] + "\t");
            }

        }

    }
}

