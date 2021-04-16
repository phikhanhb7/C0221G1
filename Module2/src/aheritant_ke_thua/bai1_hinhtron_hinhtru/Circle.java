package aheritant_ke_thua.bai1_hinhtron_hinhtru;

public class Circle  {
    private double r ;
    private String color;
    final double PI = Math.PI ;

    public Circle() {
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return PI * (r*r) ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                "Và diện tích " + getArea() +
                '}';
    }

}
