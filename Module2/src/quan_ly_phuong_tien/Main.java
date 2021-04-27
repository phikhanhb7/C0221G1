package quan_ly_phuong_tien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static List<Oto> otos = new ArrayList<>();
    public static List<XeTai> xeTais = new ArrayList<>();
    public static List<XeMay> xeMays = new ArrayList<>();


    public static void menu() {
        System.out.println("Chọn chức năng:\n" +
                "1. Thêm mới phương tiện.\n" +
                "2. Hiện thị phương tiện\n" +
                "3. Xóa phương tiện\n" +
                "4. Thoát\n");

        int choose;
        System.out.println("Nhập lựa chọn của bạn");
        choose = Integer.parseInt(input.nextLine());
        switch (choose) {
            case 1:
                themPhuongTien();
                break;
            case 2:
                hienThiPhuongTien();
                break;
            case 3:
                xoaPhuongTien();
                break;
            case 4:
                thoatChuongTrinh();
            default:
                System.out.println("Vui lòng nhập lại ");
        }

    }

    private static void xoaPhuongTien() {


    }

    private static void thoatChuongTrinh() {
    }

    private static void hienThiPhuongTien() {
        System.out.println("Chon phuong tien can hien thi \n" + "1. Hiện thị xe tải.\n" +
                "2. Hiện thị ôtô. \n" +
                "3. Hiện  xe máy.\n"
                + "4. backMenu");

        while (true) {
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    showXeTai();
                    break;
                case 2:
                    showOTo();
                    break;
                case 3:
                    showXeMay();
                    break;
                case 4:
                    menu();
                default:
                    System.out.println("Vui long nhap lai ");
            }
        }

    }

    private static void showXeMay() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\src\\quan_ly_phuong_tien\\xeMay.csv"));
            String line = null;
            while ((line = br.readLine()) != null) {
//                line = br.readLine();
//                if (line == null) {
//                    break;
//                }
                String list1[] = line.split(",");
                String bienKiemSoat = list1[0];
                String hsx1 = list1[1];
                int nsx1 = Integer.parseInt(list1[2]);
                String csh1 = list1[3];
                double congSuat = Double.parseDouble(list1[4]);
                xeMays.add(new XeMay(bienKiemSoat, hsx1, nsx1, csh1, congSuat));
            }
            for (XeMay xm : xeMays) {
                System.out.println(xm.toString());
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Khoong tim thay file");
        }
    }

    private static void showOTo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\src\\quan_ly_phuong_tien\\Oto.csv"));
            String line = null;
            while ((line = br.readLine()) != null) {
//                line = br.readLine();
//                if (line == null) {
//                    break;
//                }
                String list1[] = line.split(",");
                String bienKiemSoat = list1[0];
                String hsx1 = list1[1];
                int nsx1 = Integer.parseInt(list1[2]);
                String csh1 = list1[3];
                int soGhe = Integer.parseInt(list1[4]);
                String kieuXe = list1[5];
                otos.add(new Oto(bienKiemSoat, hsx1, nsx1, csh1, soGhe, kieuXe));
            }
            for (Oto oto : otos) {
                System.out.println(oto.toString());
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Khoong tim thay file");
        }


    }

    private static void showXeTai() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\src\\quan_ly_phuong_tien\\xeTai.csv"));
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String list1[] = line.split(",");
                String bienKiemSoat = list1[0];
                String hsx1 = list1[1];
                int nsx1 = Integer.parseInt(list1[2].trim());
                String csh1 = list1[3];
                double trongTai = Double.parseDouble(list1[4]);
                xeTais.add(new XeTai(bienKiemSoat, hsx1, nsx1, csh1, trongTai));
            }
            for (XeTai xt : xeTais) {
                System.out.println(xt.toString());
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Khoong tim thay file");
        }
    }


    public static void themPhuongTien() {
        System.out.println("1. Thêm xe tải,\n" +
                "2. Thêm ôtô, \n" +
                "3. Thêm  xe máy.\n" +
                "4. BackMenu ");
        int choose;
        System.out.println("Nhập lựa chọn của bạn ");
        choose = Integer.parseInt(input.nextLine());

        switch (choose) {
            case 1:
                addXeTai();
                break;
            case 2:
                addOTo();
                break;
            case 3:
                addXeMay();
                break;
            case 4:
                menu();
            default:
                System.out.println("Nhập sai");
        }
    }

    private static void addXeTai() {
        System.out.println("Thêm Biển Kiểm Xoát : ");
        String bienKiemSoat = input.nextLine();
        while (!RegexValidate.checkBienKiemSoatXeTai(bienKiemSoat)) {
            System.out.println("Mời Bạn Nhập Lại Biển Kiểm Soát :");
            bienKiemSoat = input.nextLine();
        }
        System.out.println("Hãng Sản Xuât : ");
        String hsx = input.nextLine();
        System.out.println("Năm Sản Xuất :");
        int namSX = Integer.parseInt(input.nextLine());
        System.out.println("Chủ Sở Hữu : ");
        String chuSoHuu = input.nextLine();
        System.out.println("Trọng Tải Của Xe : ");
        double trongTai = Double.parseDouble(input.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, hsx, namSX, chuSoHuu, trongTai);
        xeTais.add(xeTai);
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("D:\\Module2\\src\\quan_ly_phuong_tien\\xeTai.csv", true));
            for (XeTai xeTai1 : xeTais) {
                bf.write(xeTai1.toString());
                bf.append("\n");
            }
            bf.close();
        } catch (Exception e) {
            System.out.println("File Not Fould");
        }
        xeTais.clear();

    }


    private static void addXeMay() {
        System.out.println("Thêm biển kiểm soát ");
        String bienKiemSoat = input.nextLine();
        while (!RegexValidate.checkBienKiemSoatXeMay(bienKiemSoat)) {
            System.out.println("Vui lòng Nhập Lại");
            bienKiemSoat = input.nextLine();
        }
        System.out.println("Hãng Sản Xuât : ");
        String hsx = input.nextLine();
        System.out.println("Năm Sản Xuất :");
        int namSX = Integer.parseInt(input.nextLine());
        System.out.println("Chủ Sở Hữu : ");
        String chuSoHuu = input.nextLine();
        System.out.println("Nhập công suất of xe");
        double congSuat = Double.parseDouble(input.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat, hsx, namSX, chuSoHuu, congSuat);
        xeMays.add(xeMay);

        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter("D:\\Module2\\src\\quan_ly_phuong_tien\\xeMay.csv"));
            for (XeMay xeMay1 : xeMays) {
                bf.write(xeMay1.toString());
                bf.append("\n");
            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        xeMays.clear();


    }

    private static void addOTo() {
        System.out.println("Nhap bien kiem soat");
        String bienKiemSoat = input.nextLine();
        while (!RegexValidate.checkBienKiemSoatOto(bienKiemSoat)) {
            System.out.println("Vui long nhap lai");
            bienKiemSoat = input.nextLine();
        }
        System.out.println("Hãng Sản Xuât : ");
        String hsx = input.nextLine();
        System.out.println("Năm Sản Xuất :");
        int namSX = Integer.parseInt(input.nextLine());
        System.out.println("Chủ Sở Hữu : ");
        String chuSoHuu = input.nextLine();
        System.out.println("Nhap so ghe");
        int soGhe = Integer.parseInt(input.nextLine());
        System.out.println("Nhap kieu xe :1. Xe Khach or 2. Xe Du Lich");
        String kieuXe = input.nextLine();
        while (!RegexValidate.checkKieu(kieuXe)) {
            System.out.println("Nhap lai 1.xe Khach hoac 2.xe du lich");
            kieuXe = input.nextLine();
        }

// c2       if (kieuXe.equals(1)){
//            kieuXe = "xe Khach";
//        } else if (kieuXe.equals(2)){
//            kieuXe = " Xe Du Lich";
//        }else {
//            System.out.println("Ban vui long nhap lai \n" + "Nhap kieu xe :1. Xe Khach or 2. Xe Du Lich");
//            kieuXe = input.nextLine();
//        }

        Oto oto = new Oto(bienKiemSoat, hsx, namSX, chuSoHuu, soGhe, kieuXe);
        otos.add(oto);
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("D:\\Module2\\src\\quan_ly_phuong_tien\\oto.csv"));
            for (Oto oto1 : otos) {
                bf.write(oto1.toString());
                bf.append("\n");
            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        otos.clear();
    }


    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
