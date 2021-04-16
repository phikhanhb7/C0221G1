package oop.baitap.QuadraticEquation;

public class MethodQuadraticEquation {
    public static void getDiscriminant(QuadraticEquation quadraticEquation){
        double x1 ;
        double x2 ;
        double x ;
        double delta = quadraticEquation.getB()*quadraticEquation.getB() -(4* (quadraticEquation.getA()* quadraticEquation.getC()));

        if (delta > 0 ){
            x1 = (-quadraticEquation.getB() + Math.sqrt(delta)/(2*quadraticEquation.getA())) ;
            x2 = (-quadraticEquation.getB() - Math.sqrt(delta)/(2*quadraticEquation.getA())) ;
            System.out.println("Phương trình có 2 nghiệm là : x1 = "+ x1 + " và x2 = " + x2 );

        }else if (delta == 0 ) {
            x = -quadraticEquation.getB() / (2*quadraticEquation.getA());
            System.out.println("Phương trình có nghiệm kép  x1 =x2 = " + x );

        }else {
            System.out.println("Phương trình vô nghiệm ");
        }
    }
}
