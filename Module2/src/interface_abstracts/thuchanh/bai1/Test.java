package interface_abstracts.thuchanh.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Tiger();
        Animal animal1 = new Chickend();

        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        List<String> strings = new ArrayList<>();
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }


}
