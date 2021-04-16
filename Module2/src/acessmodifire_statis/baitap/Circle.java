package acessmodifire_statis.baitap;

public class Circle {
    public static void main(String[] args) {
        TestCircle testCircle = new TestCircle(10,"yellow");

        System.out.println(testCircle.toString());

        testCircle.setColor("Blue");
        System.out.println(testCircle.toString());
    }
}
