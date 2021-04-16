package com.company.model;

public class HinhCN extends Hinh implements CanhAble {

    private float d;
    private float r;

    public HinhCN(Point point, float d, float r) {
        super(point);
        this.d = d;
        this.r = r;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    //difine
    @Override
    public float calS() {
        return d * r;
    }

    @Override
    public float calC() {
        return 2 * (d + r);
    }

    //redifine
    @Override
    public void getName() {
        System.out.println("Day la Hinh Chu nhat!!!");
    }

    @Override
    public int tinhCanh() {
        return 4;
    }
}
