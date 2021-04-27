package bai18_regex.baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_CLASS_REGEX = "^[CAP]+[0-9]{4}[GHIKLM]+$";
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)\\-\\([0-9]{10}\\)$";

    public static void main(String[] args) {
        System.out.println("Nhập tên lớp bạn want ");
        Scanner input = new Scanner(System.in) ;
        String name  = input.nextLine();
        while (!Pattern.matches(NAME_CLASS_REGEX,name)){
            System.out.println("Nhập lại ");
            name = input.nextLine();
        }

        System.out.println("Tên lớp là  = " + name);

        System.out.println("Nhập số phone bạn muốn ");
        String phone = input.nextLine();
        while (!Pattern.matches(PHONE_REGEX,phone)){
            System.out.println("Vui lòng nhập lại ");
            phone = input.nextLine();
        }

        System.out.println("Số phone bạn vừa nhập là  " + phone);
    }


}
