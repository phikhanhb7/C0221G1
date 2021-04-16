package aheritant_ke_thua.bai1_hinhtron_hinhtru;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15 , " yellow");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(10,"Blue", 16);
        System.out.println(cylinder.toString());
    }
}
