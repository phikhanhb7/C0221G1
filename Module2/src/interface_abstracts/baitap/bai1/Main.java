package interface_abstracts.baitap.bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape hinh1 = new Circle(5,"Yellow ", true);
        Shape hinh2 = new Circle(6,"RED ", false);
        Shape hinh3 = new Rectangle(5,6);
        Shape hinh4 = new Rectangle(10,7,"RED",true);
        Shape hinh5 = new Square(6);
        Shape hinh6 = new Square(9);

        ArrayList<Shape> arr = new ArrayList<Shape>();
        arr.add(hinh1);
        arr.add(hinh2);
        arr.add(hinh3);
        arr.add(hinh4);
        arr.add(hinh5);
        arr.add(hinh6);

        for (Shape iteam : arr){
            System.out.println(iteam+ " \n");
        }

        for (Shape iteam : arr){
            iteam.size(200);
            iteam.howToColor();// or iteam.size ( Math.radom()*100) ;
            System.out.println(iteam);
        }


    }
}
