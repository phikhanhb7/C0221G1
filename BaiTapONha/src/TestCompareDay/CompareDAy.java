//package TestCompareDay;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class CompareDAy {
//    public static void main(String[] args) {
//        List<String> datestring = new ArrayList<>();
//        String s1 = "12/13/1990";
//        String s2 = "12/12/1996";
//        datestring.add(s1);
//        datestring.add(s2);
//        Collections.sort(datestring, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//
//
////                    @Override
////                    public int compare(String o1, String o2) {
////                        return DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
////                        Collections.sort(datestring, (s1, s2) -> LocalDateTime.parse(s1, formatter).
////
////                                compareTo(LocalDateTime.parse(s2, formatter)));
////                    }
////
////                }
////        try {
////            Date date1 =new SimpleDateFormat("dd/MM/yyyy").parse("10/1/1996");
////            System.out.println(date1);
////            Date date2 =new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1996");
//////            System.out.println(date1.compareTo(date2));
////            if (date1.compareTo(date2) == 1 ){
////
////            }
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
//
//        }
//}
