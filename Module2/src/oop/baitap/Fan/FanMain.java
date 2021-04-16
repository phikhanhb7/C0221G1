package oop.baitap.Fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true , 10 , "Blue");
        Fan fan2 = new Fan(2,false , 5 , "Yellow");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
