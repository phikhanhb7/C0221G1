package interface_abstracts.baitap.bai1;

public class Circle extends Shape implements ResizeAbble,Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + " diện tích " + getArea()
                +"chu vi" + getPerimeter()
                + super.toString();
    }

    @Override
    public void size(double percent) {
        setRadius(getRadius()*percent/100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
