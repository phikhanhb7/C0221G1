package bai11_stack_queue.baitap.bai_1_daonguocphantutrongmang;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ChangeString {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);

        Stack<Integer> stack = new Stack<>();

        for (int i = list.size(); i > 0; i--) {
            stack.push(list.remove(0));
        }
        for (int i = stack.size(); i >0 ; i--) {
            list.add(stack.pop());

        }
        System.out.println(list);

    }
}
