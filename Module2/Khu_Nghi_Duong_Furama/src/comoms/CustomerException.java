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
        String regex =  "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng fomat :^Email phải nhập đúng kiểu dữ liệu của email ở mức độ tương đối. Email bao gồm duy nhất chữ @ và tối thiểu 1 dấu .  ");
        }
    }

    public static void kiemTraGioiTinh(String gender) throws CustomerException{
        gender = gender.toLowerCase();
        if(gender.equals("male")||gender.equals("female")||gender.equals("unknow")){
            return;
        }else {
            throw new CustomerException("The gender must be Male, Female or Unknow");
        }
    }

    public static void kiemTraChungMinh(String string) throws CustomerException{
        String regex= "[0-9]{10}$";
        if (string.matches(regex) == false){
            throw new CustomerException("Nhập lại đúng fomat :Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX”.");
        }
    }

    public static void kiemTraNgaySinh(String string) throws CustomerException{
        String regex = "^([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])[\\\\/]([0][1-9]|[1][0-2])[\\\\/]([1][9][0][1-9]|[1][9][1-9][0-9]|[2][0-9][0-9][0-9])$";
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
