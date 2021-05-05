package commons;

public class DichVuException extends Exception {

    public  DichVuException(String message){
        super(message);
    }

    public static void kiemTraTenDichVu(String tenDichVu) throws DichVuException{
        String regex ="^[A-Z][a-z]+$";
        if (!tenDichVu.matches(regex)){
            throw new DichVuException("Nhap dung dinh dang");
        }
    }

    public static void kiemTraDienTich(String dienTich) throws DichVuException{
        String regex = "^([3-9][0-9].[0-9]{0,}|[1-9]{3,}+)$";
        if (!dienTich.matches(regex)){
            throw new DichVuException("Nhap dung dinh dang");
        }
    }

    public static void kiemTraCiPhiThue(String chiPhiThue) throws DichVuException{
        String regex = "^[1-9][0-9]{0,}$";
        if (!chiPhiThue.matches(regex)){
            throw new DichVuException("Nhap dung dinh dang");
        }
    }

    public static void kiemTraSoNguoiToiDa(String soNguoi) throws DichVuException{
        String regex = "^[1-20]$";
        if (!soNguoi.matches(regex)){
            throw new DichVuException("Nhap dung dinh dang");
        }
    }

    public static void kiemTraDichVuDiKem(String dichVuDikem) throws DichVuException{
        String regex = "(massage|karaoke|food|drink|car)";
        if (!dichVuDikem.matches(regex)){
            throw new DichVuException("Nhap dung dinh dang");
        }
    }

    public static void kiemTraSoTang(String soTang) throws DichVuException{
        String regex = "^[1-9][0-9]*$";
        if (!soTang.matches(regex)){
            throw new DichVuException("Nhap dung dinh dang");
        }
    }
    public static void kiemTraNgaySinh(String ngaySinh)throws DichVuException{
        String regex = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.]" +
                "(0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}" +
                "|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][04s8]|[1359][26])00))$";
        if (!ngaySinh.matches(regex)){
            throw new DichVuException("Nhap Lai");
        }
    }
}
