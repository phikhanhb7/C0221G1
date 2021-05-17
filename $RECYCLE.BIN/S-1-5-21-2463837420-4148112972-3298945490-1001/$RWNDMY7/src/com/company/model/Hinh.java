package com.company.model;

public abstract class Hinh {

    private Point point;

    public Hinh(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void getName() {
        System.out.println("Day la Hinh!!!");
    }

    public abstract float calS();

    public abstract float calC();


}
