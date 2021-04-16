package aheritant_ke_thua.bai1_hinhtron_hinhtru;

public class Cylinder extends Circle {
    private  int h ;


    public Cylinder(){

    }

    public Cylinder(int h) {
        this.h = h;
    }

    public Cylinder(double r, String color , int h) {
        super(r, color);
        this.h = h ;

    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double getArea(){
        return super.getArea()*h ;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                 + super.getR()+
                "Chiều cao=" + h +
                "Và diện tích " + getArea() +
                '}';
    }
}
