package interface_abstracts.baitap.bai1;

public class Rectangle extends Shape implements ResizeAbble,Colorable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                +" diện tích " + getArea()
                +" chu vi" + getPerimeter()
                + super.toString();
    }

    @Override
    public void size(double percent) {
        setLength(getLength()*percent/100);
        setWidth(getWidth()*percent/100);
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
