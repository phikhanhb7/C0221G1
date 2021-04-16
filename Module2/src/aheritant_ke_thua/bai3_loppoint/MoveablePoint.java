package aheritant_ke_thua.bai3_loppoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f ;
    private float ySpeed = 0.0f ;


    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(){
        this.setXY();
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public float[] getSpeed(){
        return new float[]{getX(),getY(),xSpeed,ySpeed};
    }
    public MoveablePoint move(){
        super.setX(super.getX()+getxSpeed());
        super.setY(super.getY()+getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "và mãng đó là " + Arrays.toString(getSpeed()) +
                '}';
    }
}
