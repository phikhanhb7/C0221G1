package aheritant_ke_thua.bai4;

public class Triangle extends Shape {
    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
       double a = side1 + side2 + side3;
       return a;
    }
    public double getArea(){
        double m = Math.sqrt(getPerimeter()* ( getPerimeter() - side1)*(getPerimeter()-side2)*(getPerimeter()-side3));
       return m ;
    }

    @Override
    public String toString() {
        String s = "Triangle{" +
                "side1=" + side1 + "\n" +
                ", side2=" + side2 +"\n" +
                ", side3=" + side3 +"\n" +
                 super.toString() +"\n" +
                "chu vi" + getPerimeter() +"\n" +
                "diện tích " + getArea() +"\n" +
                '}';
        return s;
    }
}
