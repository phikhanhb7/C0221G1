package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetBt {
    public static void main(String[] args) {

        Student student = new Student("hello" , 10 , "hi");
        Student student1 = new Student("hellog" , 103 , "higg");
        Student student2 = new Student("hellog" , 104 , "higg");
        Student student3 = new Student("hellog" , 104 , "higg");

        Set<Student> strings = new HashSet<>();
        strings.add(student);
        strings.add(student2);
        strings.add(student1);

        System.out.println(strings.size());
        System.out.println(strings.contains(student1));
        System.out.println(strings);
        strings.remove(student2);
        System.out.println(strings);
        System.out.println(strings.contains(student3));

    }

}
