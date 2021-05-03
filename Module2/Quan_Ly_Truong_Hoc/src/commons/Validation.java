package commons;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

public class Validation {
    public static final String CHUOI_VACHAM = "^\\w.*$";
    public static final String SO_NGUYEN_DUONG = "^[\\d]*$";
    public static final String SO_DIEN_THOAI = "^(090|091)[0-9]{7}$";
    public static final String DAY = "^([0][1-9]|[12][0-9]|[3][01])[/]([0][1-9]|[1][012])[/]([1][0-9]{3}|[2][0-9]{3})$";
    public static final String TEN = "^[\\w\\s]{4,50}";


    public static void kiemTraTen(String name) throws PersonException {
        boolean check = name.matches(TEN);
        if (!check) {
            throw new PersonException("Nhập sai mã, từ 4-50 ký tự");
        }
    }

    public static void kiemTraNgaySinh(String name) throws PersonException {
        boolean check = name.matches(DAY);
        if (!check) {
            throw new PersonException("Nhập sai mã, dd/mm/yyyy");
        }
    }


    public static boolean kiemTraLuaChon(String name, String chon) {
        List<String[]> list = ReadAndWrite.readFile(name);
        int kiemTra = Integer.parseInt(chon);
        if (kiemTra <= list.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTonTai(String lop) {
        List<String[]> list = ReadAndWrite.readFile("batchs.csv");
        for (String[] arr : list
        ) {
            if (lop.equals(arr[1])) {
                return true;
            }
        }
        return false;
    }

    public static void kiemTraSoDienThoai(String name) throws PersonException {
        boolean check = name.matches(SO_DIEN_THOAI);
        if (!check) {
            throw new PersonException("Nhập sai chuỏi");
        }
    }

    public static boolean kiemTraSoDienThoaiDuyNhat(String lop) throws PersonException {
        List<String[]> list = ReadAndWrite.readFile("students.csv");
        for (String[] arr : list
        ) {
            if (lop.equals(arr[4])) {
                throw new PersonException("Số điện thoại trùng lặp");
            }
        }
        return true;
    }

    public static boolean kiemTraDauVao(String regex, String string) {
        boolean check = string.matches(regex);
        if (!check) {
            System.out.println("INPUT KHÔNG HỢP LỆ.");
        }
        return check;
    }


    public static String chuanHoaTen(String name) {
        name = name.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] arrayName = name.split("");
        arrayName[0] = arrayName[0].toUpperCase();
        StringBuilder newName = new StringBuilder(arrayName[0]);
        for (int i = 1; i < arrayName.length; i++) {
            if (!arrayName[i].equals(" ") && arrayName[i - 1].equals(" ")) {
                arrayName[i] = arrayName[i].toUpperCase();
            }
            newName.append(arrayName[i]);
        }

        System.out.println(newName);
        return newName.toString();
    }


    public static long tinhSoNgay(String ngayVao, String ngayRa) {
        long millisInOneDay = 86_400_000;

        String[] tokens = ngayVao.split("/");
        LocalDate date1 = LocalDate.of(Integer.parseInt(tokens[2]),
                Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[0]));

        tokens = ngayRa.split("/");
        LocalDate date2 = LocalDate.of(Integer.parseInt(tokens[2]),
                Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[0]));

        // Get the millisecond value of the birthday.
        long date1InMillis = date1.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long date2InMillis = date2.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long difference = date2InMillis - date1InMillis;
        long days = (difference / millisInOneDay);
        return days;
    }
}
