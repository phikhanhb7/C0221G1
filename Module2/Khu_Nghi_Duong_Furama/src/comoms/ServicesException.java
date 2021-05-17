package comoms;

public class ServicesException extends Exception{
    public ServicesException(String message) {
        super(message);
    }

    public static void kiemIdVilla(String string) throws ServicesException{
        String regex =  "^(SVVL)-[0-9]{4}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : \"^(SVVL)-[0-9]{4}$\"; ");
        }
    }

    public static void kiemIdHouse(String string) throws ServicesException{
        String regex =  "^(SVHO)-[0-9]{4}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : \"^(SVHO)-[0-9]{4}$\";");
        }
    }

    public static void kiemIdRoom(String string) throws ServicesException{
        String regex =  "^(SVRO)-[0-9]{4}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :  \"^(SVRO)-[0-9]{4}$\";");
        }
    }

    public static void kiemTenDichVu(String string) throws ServicesException{
        String regex =  "^[A-Z][a-z]+$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : \"^[A-Z][a-z]+$\";");
        }
    }

    public static void kiemDienTichSuDung(String string) throws ServicesException{
        String regex =  "^([3-9][0-9].[0-9]{0,}|[1-9]{3,}+)$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :  \"^([3-9][0-9].[0-9]{0,}|[1-9]{3,}+)$\";");
        }
    }

    public static void kiemChiPhiThue(String string) throws ServicesException{
        String regex =  "^[1-9][0-9]{0,}$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại :\"^[1-9][0-9]{0,}$\"; ");
        }
    }

    public static void kiemSoNguoiToiDa(String string) throws ServicesException{
        String regex = "^([1-9]{1}|1[0-9]{1}|20)$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : \"^([1-9]{1}|1[0-9]{1}|20)$\";");
        }
    }

    public static void kiemSoTang(String string) throws ServicesException{
        String regex = "^[1-9]+$";
        if (!string.matches(regex)){
            throw new ServicesException("Vui lòng nhập lại : \"^[1-9]+$\";");
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
            throw new ServicesException("Vui lòng nhập lại : \"(massage|karaoke|food|drink|car)\";");
        }
    }











}
