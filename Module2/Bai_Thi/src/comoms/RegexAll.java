package comoms;

public class RegexAll extends Exception {


    public RegexAll(String message) {
        super(message);
    }

    public static void kiemTraHoTen(String input) throws RegexAll {
        String regex = "^([A-Z][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*[\\s]?)+$";
        if (input.matches(regex) == false) {
            throw new RegexAll("Vui lòng nhấm chử tiếng việt có dấu");
        }
    }
    public static void kiemTraEmail(String string) throws RegexAll {
      String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";
      if ((string.matches(regex))== false){
          throw new RegexAll("Vui long nhập lại đúng  : ^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$\" ");
      }
  }

    public static void kiemTraSoDienThoai(String string) throws RegexAll {
        String regex = "^0[1-9]{1}[0-9]{8}$";
        if ((string.matches(regex))== false){
            throw new RegexAll("Vui long nhập lại đúng : \"^0[1-9]{1}[0-9]{8}$\"");
        }
    }

    public static void kiemTraGioiTinh(String string) throws RegexAll {
        String regex= "^(Nam|Nữ|Khác)$";
        if ((string.matches(regex))== false){
            throw new RegexAll("Vui long nhập lại : Nam \\ Nữ \\ Khác ");
        }
    }

//    public static void kiemTraNgaySinh(String string) throws RegexAll {
//        String regex= "^  String regex = \"^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.]\" +\n" +
//                "             \"(0[469]|11)|(0[1-9]|1\\\\d|2[0-8])[- /.]02)[- /.]\\\\d{4}\" +\n" +
//                "                \"|29[- /.]02[- /.](\\\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][04s8]|[1359][26])00))$\";$";
//        if ((string.matches(regex))== false){
//            throw new RegexAll("Vui long nhập lại : Nam \\ Nữ \\ Khác ");
//        }
//    }




}
