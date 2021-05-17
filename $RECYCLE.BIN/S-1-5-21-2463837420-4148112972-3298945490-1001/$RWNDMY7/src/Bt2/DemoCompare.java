//package Bt2;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class DemoCompare implements Comparable<DemoCompare> {
//
//    int age;
//    String name;
//    private DemoCompare city;
//
//    public DemoCompare(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    @Override
//    public int compareTo(DemoCompare o) {
//
//        if (this.age > o.age) {
//            return 1;
//        } else if (this.age < o.age) {
//            return -1;
//        }
//        this.city.compareTo(o.city)!=0 {
//        return this.city.compareTo(o.city);
//    }
//        return this.name.compareTo(o.name);
//}
//
//    public static void main(String [] agrs ){
//
//        DemoCompare demoCompare1 = new DemoCompare(23,"A");
//        DemoCompare demoCompare2 = new DemoCompare(21,"B");
//        DemoCompare demoCompare3= new DemoCompare(20,"A");
//        DemoCompare demoCompare4 = new DemoCompare(21,"A");
//        DemoCompare demoCompare5 = new DemoCompare(22,"B");
//        List<DemoCompare> demoCompares = new ArrayList<>();
//        demoCompares.add(demoCompare1);
//        demoCompares.add(demoCompare2);
//        demoCompares.add(demoCompare3);
//        demoCompares.add(demoCompare4);
//        demoCompares.add(demoCompare5);
//        Collections.sort(demoCompares);
//        demoCompares.stream().forEach(ele -> System.out.println(ele.age + " : "+ele.name));
//        //for( DemôCmpare item : demôcmpảe){
//
//    }
//}
