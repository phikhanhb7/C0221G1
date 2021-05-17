package bai11_stack_queue.baitap.bai2_chuoipalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("nhập của bạn");
        String inPut = input.nextLine();

        Queue<Character> queue = new LinkedList<>();
        for (int i = inPut.length() -1 ; i >= 0 ; i-- ) {
            queue.add(inPut.charAt(i));
        }

        String stringchange = "" ;
        while (!queue.isEmpty()){
            stringchange += queue.remove();

        }
        if (inPut.equals(stringchange)){
            System.out.println("đây là chuổi đối xứng");
        }
        else {
            System.err.println("Không phải bạn nhé");
        }

    }
}
