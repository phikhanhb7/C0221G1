package com.company.model;

public class HinhTron extends Hinh {

    final float PI = 3.14f;
    private float r;

    public HinhTron(Point point, int r) {
        super(point);
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public float calS() {
        return PI * r * r;
    }

    @Override
    public float calC() {
        return PI * 2 * r;
    }

    @Override
    public void getName() {
        System.out.println("Day la Hinh Tron!!!");
    }

   public int getName(int a , int b ){
        return a+ b ;
   }


}
