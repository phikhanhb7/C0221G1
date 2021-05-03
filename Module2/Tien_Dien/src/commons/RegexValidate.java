package commons;

import java.util.regex.Pattern;

public class RegexValidate {
    public static boolean checkVietNam(String st){
        String regexVietNam = "^(KHVN)-[0-9]{5}$";
        return Pattern.matches(regexVietNam,st);
    }
    public static boolean checkNuocNgoai(String string){
        String regexNuocNgoai = "^(KHNN)-[0-9]{5}$";
        return Pattern.matches(regexNuocNgoai,string);
    }
}
