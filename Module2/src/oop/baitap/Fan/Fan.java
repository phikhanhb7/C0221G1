package oop.baitap.Fan;

public class Fan {
    private final int slow = 1 ;
    private final int medium = 2 ;
    private final int fast  = 3 ;
    private int speed = 1 ;
    private boolean on = false ;
    private  double radius = 5 ;
    private String color = " Blue " ;

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        String message = "" ;
        if (isOn()){
            message += " Speed " + this.speed +"\n"+ "Trạng Thái Đang mở  \n"  ;
            message += " Color " + this.color + "\n"+"Bán kính \n" + this.radius ;
        }else {
            message += " Speed " + this.speed +"\n"+ "Trạng Thái Đang Tắt  "  ;
            message += " Color " + this.color + "\n" +"Bán kính \n" + this.radius ;
        }
        return message ;
    }
}
