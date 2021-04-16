package aheritant_ke_thua.bai3_loppoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(10, 15 ) ;
        MoveablePoint moveablePoint = new MoveablePoint(14,20,225,30) ;

        System.out.println(point.toString());
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.getX());
        System.out.println(moveablePoint.getY());
        moveablePoint.move();
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint.getX());
        System.out.println(moveablePoint.getY());


    }
}
