package com.company.model;

public class HinhVuong extends Hinh implements CanhAble {

    private float c;

    public HinhVuong(Point point, float c) {
        super(point);
        this.c = c;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    //difine
    @Override
    public float calS() {
        return c*c;
    }

    @Override
    public float calC() {
        return 4 * c;
    }

    //redifine
    @Override
    public void getName() {
        System.out.println("Day la Hinh Chu nhat!!!");
    }

    @Override
    public int tinhCanh(){
        return 6;
    }
}
