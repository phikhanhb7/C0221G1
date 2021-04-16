package Collection;

import java.util.Comparator;

public class CompareA implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getA().compareTo(o2.getA());
    }

}
