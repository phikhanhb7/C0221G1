package bai3_array_phuongthuc.baitap;

import java.util.Scanner;

public class DemSoKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int count = 0 ;

        System.out.println("Nhập chuổi bạn muốn ");
        String str = input.nextLine() ;

        System.out.println("Nhập ký tự bạn muốn tìm trong chuổi ");
        char characters = input.next().charAt(0) ;

        for (int i = 0 ; i < str.length() ; i ++ ) {
            if (str.charAt(i) == characters){
                count ++ ;
            }
        }
        System.out.println(" Số lần ký tự đó xuất hiện là " + count );
    }
}
