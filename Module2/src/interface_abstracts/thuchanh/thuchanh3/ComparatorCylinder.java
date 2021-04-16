package interface_abstracts.thuchanh.thuchanh3;

import aheritant_ke_thua.bai1_hinhtron_hinhtru.Cylinder;

import java.util.Comparator;

public class ComparatorCylinder extends Cylinder implements Comparator<Cylinder> {

    @Override
    public int compare(Cylinder o1, Cylinder o2) {
        return (int) (o1.getR() - o2.getR());
    }
}
