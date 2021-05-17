package comoms;

public class CustomerException extends Exception {
    public CustomerException(String message) {
        super(message);
    }

    public static void kiemTraHoTen(String string) throws CustomerException{
      String regex = "^([A-Z][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*[\\s]?)+$";
      if (string.matches(regex) == false){
          throw new CustomerException("Nhập lại tiếng việt bắt đầu là chử hoa :v");
      }
    }


    public static void kiemTraEmail(String string) throws CustomerException{
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng fomat :^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$ ");
        }
    }

    public static void kiemTraGioiTinh(String string) throws CustomerException{
        String regex= "^(Nam|Nữ|Khác)$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng fomat :^(Nam|Nữ|Khác)");
        }
    }

    public static void kiemTraChungMinh(String string) throws CustomerException{
        String regex= "[0-9]{10}$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng fomat :\"[0-9]{9}$\";");
        }
    }

    public static void kiemTraNgaySinh(String string) throws CustomerException{
        String regex = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.]" +
                "(0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}" +
                "|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][04s8]|[1359][26])00))$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng >18 tuổi ");
        }
    }

    public static void kiemTraSoDienThoai(String string) throws CustomerException{
       String regex = "^0[1-9]{1}[0-9]{8}$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng \"^0[1-9]{1}[0-9]{8}$\"; ");
        }
    }

    public static void kiemTraLoaiKhach(String string) throws CustomerException{
        String regex = "^(Diamond|Platinium|GoldSilver|Member)$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng \"^(Diamond|Platinium|GoldSilver|Member) ");
        }
    }
}
