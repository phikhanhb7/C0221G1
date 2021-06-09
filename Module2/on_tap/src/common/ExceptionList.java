package common;

public class ExceptionList extends Exception {
    public ExceptionList(String message) {
        super(message);
    }

    public static void checkNumberPhone(String string ) throws ExceptionList{
        String regex = "^0[1-9]{1}[0-9]{8}$";
        if ((string.matches(regex))== false){
            throw new ExceptionList("Vui long nhập lại đúng : \"^0[1-9]{1}[0-9]{8}$\"");
        }
    }

    public static void checkEmail(String string) throws ExceptionList {
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";
        if ((string.matches(regex))== false){
            throw new ExceptionList("Vui long nhập lại đúng  : ^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$\" ");
        }
    }
}
