package bai11_stack_queue.baitap.chuye_thap_phan_sang_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MethodChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số bạn muốn chuyển ");
        int number = Integer.parseInt(input.nextLine());

        Stack stack = new Stack() ;

        while (number > 0 ){
            if (number/2 ==0){
                stack.push("0");
                number = number/2 ;
            }
            else {
                stack.push("1");
                number = (number-1)/2 ;
            }
        }
        List<Object> integerList = new ArrayList<>();
        while (stack.size() > 0 ){
            integerList.add(stack.pop());
        }
         for (Object item : integerList){
             System.out.print(item);
         }
    }
}
