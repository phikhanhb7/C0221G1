package pass2_quan_ly_san_pham;

public class ProductException extends Exception {
    public ProductException(String message) {
        super(message);
    }

    public static void kiemTraId(String string) throws ProductException {
        String regex = "^[0-9]*$";
        if (!string.matches(regex)){
            throw new ProductException("Nhập đúng định dạng ");
        }
    }

    public static void kiemTraName(String string) throws ProductException {
        String regex = "^([A-Z][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*[\\s]?)+$";
        if (!string.matches(regex)){
            throw new ProductException("Nhập đúng định dạng ");
        }
    }

    public static void kiemTraPrice(String string) throws ProductException {
        String regex = "^[0-9]*$";
        if (!string.matches(regex)){
            throw new ProductException("Nhập đúng định dạng ");
        }
    }

}
