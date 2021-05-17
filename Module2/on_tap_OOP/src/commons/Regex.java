//package commons;
//
//public class Regex {
//    static boolean check = false;
////    public static void checkNameCustomers(String string) throws NameException {
////        String regex = "([A-Z]"+"([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)[ ])+" +
////                "[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ]" +
////                "([a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)";
////        check = string.matches(regex);
////        if(!check) throw new NameException("Mời Người dùng nhập lại");
////    }
////    public static void checkEmail(String string) throws EmailException {
////        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";
////        check = string.matches(regex);
////        if(!check) throw new EmailException("Mời Người Dùng Nhập Lại");
////    }
////    public static void regexGender(String str) throws GenderException {
////        String regex= "^(Male|Female|Unknow)$";
////        check = str.matches(regex);
////        if(!check) throw new GenderException("Mời Người Dùng nhập lại");
////    }
////    public static void regexId(String str) throws IdCardException {
////        String regex = "^\\d{9}$";
////        check = str.matches(regex);
////        if(!check) throw new IdCardException("Mời Người Dùng Nhập Lại");
////    }
////    public static boolean regexPhone(String str){
////        String regex = "^0[1-9]{1}[0-9]{8}$";
////        return Pattern.matches(regex,str);
////    }
////    public static boolean regexKindOfCus(String str) {
////        String regex = "^(Diamond|Platinium|GoldSilver|Member)$";
////        return Pattern.matches(regex, str);
////    }
//    public static void regexBirth(String str) throws BirthDayException {
//        String regex = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.]" +
//             "(0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}" +
//                "|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][04s8]|[1359][26])00))$";
//        check = str.matches(regex);
////        if(!check) throw new BirthDayException("Mời Người Dùng Nhập Lại");
////    }
////    public static boolean checkIdVilla(String string){
////        String regex = "^(SVVL)-[0-9]{4}$";
////        return Pattern.matches(regex,string);
////    }
////    public static boolean checkIDHouse(String str){
////        String regex = "^(SVHO)-[0-9]{4}$";
////        return Pattern.matches(regex,str);
////    }
////    public static boolean checkIDRoom(String str){
////        String regex = "^(SVRO)-[0-9]{4}$";
////        return Pattern.matches(regex,str);
////    }
////    public static boolean checkNameServices(String string){
////        String regex ="^[A-Z][a-z]+$";
////        return Pattern.matches(regex,string);
////    }
////    public static boolean checkAreaUser(String string){
////        String regex = "^([3-9][0-9].[0-9]{0,}|[1-9]{3,}+)$";
////        return Pattern.matches(regex,string);
////    }
////    public static boolean checkPrices(String string){
////        String regex = "^[1-9][0-9]{0,}$";
////        return Pattern.matches(regex,string);
////    }
////    public static boolean checkNumberPeople(String string){
////        String regex = "^([1-9]{1}|1[0-9]{1}|20)$";
////        return Pattern.matches(regex,string);
////    }
////    public static boolean checkConvenient(String string){
////        String regex = "(massage|karaoke|food|drink|car)";
////        return Pattern.matches(regex,string);
////    }
////    public static boolean checkTypeOfRent(String string){
////        String regex ="^[A-Z][a-z]+$";
////        return Pattern.matches(regex,string);
////    }
////
////    public static boolean checkTypeOfRoom(String string){
////        String regex = "^(Premium|DoubleBed|Standard)$";
////        return Pattern.matches(regex,string);
////    }
//
//}
