package comoms;

public class ServicesException extends Exception{
    public ServicesException(String message) {
        super(message);
    }

    public static void kiemIdVilla(String string) throws ServicesException{
        String regex =  "^(SVVL)-[0-9]{4}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :-\tMã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                    "-\tNếu là Villa thì XX sẽ là VL\n" +
                    "-\tNếu là House thì XX sẽ là HO\n" +
                    "-\tNếu Room thì XX sẽ là RO\n");
        }
    }

    public static void kiemIdHouse(String string) throws ServicesException{
        String regex =  "^(SVHO)-[0-9]{4}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : -\tMã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                    "-\tNếu là Villa thì XX sẽ là VL\n" +
                    "-\tNếu là House thì XX sẽ là HO\n" +
                    "-\tNếu Room thì XX sẽ là RO\n");
        }
    }

    public static void kiemIdRoom(String string) throws ServicesException{
        String regex =  "^(SVRO)-[0-9]{4}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :  -\tMã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                    "-\tNếu là Villa thì XX sẽ là VL\n" +
                    "-\tNếu là House thì XX sẽ là HO\n" +
                    "-\tNếu Room thì XX sẽ là RO\n");
        }
    }

    public static void kiemTenDichVu(String string) throws ServicesException{
        String regex =  "^[A-Z][a-z]+$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : -\t phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
        }
    }

    public static void kiemDienTichSuDung(String string) throws ServicesException{
        String regex =  "^([3-9][0-9].[0-9]{0,}|[1-9]{3,}+)$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : -\tDiện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2");
        }
    }

    public static void kiemChiPhiThue(String string) throws ServicesException{
        String regex =  "^[1-9][0-9]{0,}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :-\tChi phí thuê phải là số dương");
        }
    }

    public static void kiemSoNguoiToiDa(String string) throws ServicesException{
        String regex = "^([1-9]{1}|1[0-9]{1}|20)$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :-\tSố lượng người tối đa phải >0 và nhỏ hơn <20");
        }
    }

    public static void kiemSoTang(String string) throws ServicesException{
        String regex = "^[1-9]+$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : -\tSố tầng phải là số nguyên dương");
        }
    }

    public static void kiemDienTichHoBoi(String string) throws ServicesException{
        String regex = "^([1-9]{1}|1[0-9]{1}|20)$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :\"^([1-9]{1}|1[0-9]{1}|20)$\"; ");
        }
    }

    public static void kiemDichVuDiKem(String string) throws ServicesException{
        String regex = "(massage|karaoke|food|drink|car)";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car");
        }
    }











}
