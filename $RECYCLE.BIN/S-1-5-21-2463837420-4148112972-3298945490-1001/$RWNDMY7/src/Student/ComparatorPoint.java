package Student;

import java.util.Comparator;

public class ComparatorPoint implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getPointtb() - o2.getPointtb());
    }
}
