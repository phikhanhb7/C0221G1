package common;

public class TaiKhoanEcxeption extends Exception {
    public TaiKhoanEcxeption(String message) {
        super(message);
    }

    public static void kiemTraSoDuong(String string) throws TaiKhoanEcxeption{
        String regex = "^[0-9]+$";
        if (!string.matches(regex)){
            throw new TaiKhoanEcxeption("Vui lòng nhập lại :-\t phải là số dương");
        }
    }
}
