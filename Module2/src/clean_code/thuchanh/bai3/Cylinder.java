package clean_code.thuchanh.bai3;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double getBaseArea = Math.PI * radius * radius;
        double baseArea = getBaseArea;
        double getPerimeter = 2 * Math.PI * radius;
        double perimeter = getPerimeter;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}
