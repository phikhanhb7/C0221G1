package bai15_exception.bai_tap;

public class IsATriangle {

    int a;
    int b;
    int c;

    public IsATriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Lổi nhé");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("%d, %d, %d is three sides of a triangle", a, b, c);
        } else {
            throw new IllegalTriangleException("Lổi rồi bạn gì đó ơi");
        }
    }

}


