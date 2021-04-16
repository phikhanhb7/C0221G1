package interface_abstracts.thuchanh.Bai2;

import aheritant_ke_thua.bai1_hinhtron_hinhtru.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double r, String color) {
        super(r, color);
    }

    public ComparableCircle() {
    }

    @Override
    public int compareTo(ComparableCircle o) {
        double v = getR() - o.getR();
        return (int) v;
//        if (getR() > o.getR()) return 1 ;
//        if (getR() < o.getR()) return  -1 ;
//        else return 1 ;
    }
}
