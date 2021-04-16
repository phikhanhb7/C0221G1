package aheritant_ke_thua.bai2_hinh2d_3d;

import java.util.Arrays;

public class Point3D extends Point2D {
   private  float z ;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z ;

    }
//    public void getXYZ(){
//        setXY();
//        this.z = z ;
//    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x, y);
        this.z = z ;
    }
    public float[] getXYZ(){
       return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                "và " + Arrays.toString(getXYZ()) +
                '}';
    }
}
