package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử bạn muốn xóa");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 0 ; i < arr.length ; i ++ ){
            if (arr[i] == n ){
                for(int j = i ; j<arr.length -1 ; j++){
                    arr[j] = arr[j +1 ];
                }
            }
        }
        System.out.println("Mãng mới của chúng ta là : ");
        for (int j = 0 ; j < arr.length - 1; j ++){
            System.out.print(arr[j] + "\t");
        }
    }
}
