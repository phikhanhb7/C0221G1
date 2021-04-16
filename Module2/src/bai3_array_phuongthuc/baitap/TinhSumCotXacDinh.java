package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class TinhSumCotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int j;
        int m;
        int n;
        System.out.print("Nhap vao kich thuoc mang lon :");
        m = input.nextInt();
        System.out.print("Nhap vao kih thuoc cua mang nho :");
        n = input.nextInt();
        int arr[][] = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Nhập cột bạn muốn tính ");
        int number = input.nextInt();

        int sum = 0 ;
        for ( i = 0 ; i < arr.length ; i ++ ){
            for ( j = 0 ; j < arr[i].length ; j ++ ){
                if ( number == j ) {
                    sum += arr[i][number] ;

                }
            }
        }
        System.out.println(" Tổng của cột đó là " + sum );
    }
}