package interface_abstracts.thuchanh.Bai2;

import aheritant_ke_thua.bai1_hinhtron_hinhtru.Circle;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<ComparableCircle> hinh = new ArrayList<>() ;
        Circle hinh1 = new ComparableCircle();
        hinh.add((ComparableCircle) hinh1);
        hinh.add(new ComparableCircle(10 , "blue"));
        hinh.add(new ComparableCircle(12 , "red"));
        hinh.add(new ComparableCircle(16 , "black"));
        hinh.add(new ComparableCircle(14 , "blue"));
        hinh.add(new ComparableCircle(17 , "red"));
        hinh.add(new ComparableCircle());
        hinh.add(new ComparableCircle());

        Collections.sort(hinh);
       for (ComparableCircle iteam : hinh){
           System.out.println(iteam);
       }
    }
}
