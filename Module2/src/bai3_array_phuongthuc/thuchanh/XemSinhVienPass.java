package bai3_array_phuongthuc.thuchanh;

import java.util.Scanner;

public class XemSinhVienPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử bạn muốn nhập ");
        int num = Integer.parseInt(input.nextLine());
        while (num < 30) {
            int[] arr1 = new int[num];
            int i;
            for (i = 0; i < arr1.length; i++) {
                System.out.print("arr1[" + i + "]=");
                arr1[i] = input.nextInt();
            }

            for (int j = 0 ; j < arr1.length ; j ++ ){
                if (arr1[j] > 5 && arr1 [j] < 10 ){
                    System.out.println( arr1[j] +"điểm   Bạn đã qua nhé ");
                }
            }
        }

    }
}
