package bai2_loopiJnava.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static boolean TimSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            for ( i = 2 ; i < number ; i++){
                if (number%i == 0 ){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn nhỏ hơn ");
        int num = Integer.parseInt(input.nextLine());
        int i = 2 ;
        while (i < num){
            if (TimSoNguyenTo(i)){
                System.out.println("Các số nguyên tố là " + i);
            }
            i++ ;
        }
    }
}
