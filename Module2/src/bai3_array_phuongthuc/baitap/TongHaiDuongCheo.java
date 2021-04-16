package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class TongHaiDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int m;
        int n;
        int sum = 0 ;
        int sum1 = 0 ;


        System.out.print("Nhap vao kich thuoc mang lon :");
        m = scanner.nextInt();
        System.out.print("Nhap vao kih thuoc cua mang nho :");
        n = scanner.nextInt();
        int arr[][] = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (i= 0 ; i < arr.length ; i ++ ){
            for ( j = 0 ; j < arr[i].length ; j ++ ){
                if ( i == j ){
                    sum += arr[i][j] ;
                }
                else if ( j == n- i - 1 ){
                    sum1 += arr[i][j];
                }
            }

        } int sum2= sum+ sum1 ;
        System.out.println("Tổng đường hai chéo chính là " + sum2 );
    }
}