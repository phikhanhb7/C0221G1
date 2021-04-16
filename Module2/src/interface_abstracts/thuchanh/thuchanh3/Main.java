package interface_abstracts.thuchanh.thuchanh3;

import aheritant_ke_thua.bai1_hinhtron_hinhtru.Cylinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Cylinder h1 = new Cylinder(5,"Yelow",7);
        Cylinder h2 = new Cylinder();
        Cylinder h3 = new Cylinder(3,"blue",7);
        Cylinder h4 = new Cylinder(6,"Black",7);
        Cylinder h5 = new Cylinder(2,"red",7);
        Cylinder h6 = new Cylinder(8,"red",7);

        ArrayList<Cylinder> arr = new ArrayList<>();
        arr.add(h1);
        arr.add(h2);
        arr.add(h3);
        arr.add(h4);
        arr.add(h5);
        arr.add(h6);


          Collections.sort(arr , new ComparatorCylinder());
          for (Cylinder item : arr){
              System.out.println(item);
          }
    }
}
