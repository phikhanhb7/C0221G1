package Collection;

import java.util.Comparator;

public class Student {
   public String a  ;
    public Integer b;
    public String d;

    public Student(String a, Integer b, String d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Student{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", d='" + d + '\'' +
                '}';
    }
}
