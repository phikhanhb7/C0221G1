package quan_ly_phuong_tien;

import java.util.regex.Pattern;

public class RegexValidate {
    public static boolean checkBienKiemSoatXeTai (String xetai){
        String regex = "^[0-9]{2}C-[0-9]{3}.[0-9]{2}$";
        return Pattern.matches(regex,xetai);
    }
    public static boolean checkBienKiemSoatOto(String Oto){
        String regex = "^[0-9]{2}[AB]{1}-[0-9]{3}.[0-9]{2}$";
        return Pattern.matches(regex,Oto);
    }
    public static boolean checkBienKiemSoatXeMay(String xeMay){
        String regex = "^[0-9]{2}[A-Z]{1}-[0-9]{3}.[0-9]{2}$";
        return Pattern.matches(regex,xeMay);
    }
    public static boolean checkKieu(String string){
        String regex = "(Xe Khach|Xe Du Lich)";
        return Pattern.matches(regex,string);
    }
    public static boolean checkNumberCase(String number) {
        String regex = "^[1-4]$";
        return Pattern.matches(regex, number);
    }
    public static boolean checkNameProduct(String string){
        String regex = "^([A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)|([A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]\" +\n" +
                "            \"[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+\" +\n" +
                "            \"([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]\" +\n" +
                "            \"[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+)$\";";
        return Pattern.matches(regex,string);
    }
    public static boolean checkYearProduce(String number) {
        String regex = "^[0-9]{4}$";
        return Pattern.matches(regex, number);
    }
    public static boolean checkWeight(String number) {
        String regex = "^[0-9]+$";
        return Pattern.matches(regex, number);
    }
}
