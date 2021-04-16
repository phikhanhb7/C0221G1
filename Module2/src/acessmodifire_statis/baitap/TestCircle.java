package acessmodifire_statis.baitap;

public class TestCircle {
    private double radius = 1 ;
    private String color = "red" ;
    final double PI = 3.14 ;

    public TestCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(double radius){
        return PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "TestCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                ", Có diện tích bằng " + getArea(radius) +
                '}';
    }
}
