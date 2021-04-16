package arraylist_linkedlist.baitap.bai2;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFist(7);
        list.addFist(5);
        list.addFist(6);
        list.add(7,9);
        list.addLast(8);
        list.printList();

    }
}
