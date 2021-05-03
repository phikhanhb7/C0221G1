package service;

import commons.RegexValidate;
import models.Oto;
import models.XeMay;
import models.XeTai;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddCar {
    public static Scanner input = new Scanner(System.in);
    public static List<Oto> otos = new ArrayList<>();
    public static List<XeTai> xeTais = new ArrayList<>();
    public static List<XeMay> xeMays = new ArrayList<>();

    public static void addXeTai() {
        System.out.println("Thêm Biển Kiểm Xoát : ");
        String bienKiemSoat = input.nextLine();
        while (!RegexValidate.checkBienKiemSoatXeTai(bienKiemSoat)) {
            System.out.println("Mời Bạn Nhập Lại Biển Kiểm Soát :");
            bienKiemSoat = input.nextLine();
        }
        System.out.println("Hãng Sản Xuât : ");
        String hsx = input.nextLine();
        while (!RegexValidate.checkNameProduct(hsx)){
            System.out.println("Vui long Nhap lai");
            hsx = input.nextLine();
        }
        System.out.println("Năm Sản Xuất :");
        String namSX1 = input.nextLine();
        while (!RegexValidate.checkYearProduce(namSX1)){
            System.out.println("Vui long Nhap lai");
            namSX1 = input.nextLine();
        }
        int namSX = Integer.parseInt(namSX1);// dao lai thanh int
        System.out.println("Chủ Sở Hữu : ");
        String chuSoHuu = input.nextLine();
        while (!RegexValidate.checkNameProduct(chuSoHuu)){
            System.out.println("Vui long nhap lai");
            chuSoHuu = input.nextLine();
        }

        System.out.println("Trọng Tải Của Xe : ");
        String trongTai1 = input.nextLine();
        while (!RegexValidate.checkWeight(trongTai1)){
            System.out.println("Nhap lai sai roi");
            trongTai1 = input.nextLine();
        }
        double trongTai = Double.parseDouble(trongTai1);

        XeTai xeTai = new XeTai(bienKiemSoat, hsx, namSX, chuSoHuu, trongTai);
        xeTais.add(xeTai);
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeTai.csv", true));
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


    public static void addXeMay() {
        System.out.println("Thêm biển kiểm soát ");
        String bienKiemSoat = input.nextLine();
        while (!RegexValidate.checkBienKiemSoatXeMay(bienKiemSoat)) {
            System.out.println("Vui lòng Nhập Lại");
            bienKiemSoat = input.nextLine();
        }
        System.out.println("Hãng Sản Xuât : ");
        String hsx = input.nextLine();
        while (!RegexValidate.checkNameProduct(hsx)){
            System.out.println("Vui long Nhap lai");
            hsx = input.nextLine();
        }
        System.out.println("Năm Sản Xuất :");
        String namSX1 = input.nextLine();
        while (!RegexValidate.checkYearProduce(namSX1)){
            System.out.println("Vui long Nhap lai");
            namSX1 = input.nextLine();
        }
        int namSX = Integer.parseInt(namSX1);// dao lai thanh int
        System.out.println("Chủ Sở Hữu : ");
        String chuSoHuu = input.nextLine();
        while (!RegexValidate.checkNameProduct(chuSoHuu)){
            System.out.println("Vui long nhap lai");
            chuSoHuu = input.nextLine();
        }

        System.out.println("Cong Suat Của Xe : ");
        String congSuat1 = input.nextLine();
        while (!RegexValidate.checkWeight(congSuat1)){
            System.out.println("Nhap lai sai roi");
            congSuat1 = input.nextLine();
        }
        double congSuat = Double.parseDouble(congSuat1);

        XeMay xeMay = new XeMay(bienKiemSoat, hsx, namSX, chuSoHuu, congSuat);
        xeMays.add(xeMay);

        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeMay.csv"));
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

    public static void addOTo() {
        System.out.println("Nhập Biển Kiểm Soát ví dụ : 34A-456.76");
        String bienKiemSoat = input.nextLine();
        while (!RegexValidate.checkBienKiemSoatOto(bienKiemSoat)) {
            System.out.println("Nhập Lại Biển Kiểm Soát ví dụ : 34A-456.76");
            bienKiemSoat = input.nextLine();
        }
        System.out.println("Hãng Sản Xuât : Không Nhập số");
        String hsx = input.nextLine();
        while (!RegexValidate.checkTiengViet(hsx)){
            System.out.println("Vui long Nhap lai");
            hsx = input.nextLine();
        }
        System.out.println("Năm Sản Xuất : chỉ số có 4 chử số VD 1990");
        String namSX1 = input.nextLine();
        while (!RegexValidate.checkYearProduce(namSX1)){
            System.out.println("Vui long Nhap lai chỉ số có 4 chử số VD 1990");
            namSX1 = input.nextLine();
        }
        int namSX = Integer.parseInt(namSX1);// dao lai thanh int
        System.out.println("Chủ Sở Hữu : Không nhập số ");
        String chuSoHuu = input.nextLine();
        while (!RegexValidate.checkTiengViet(chuSoHuu)){
            System.out.println("Vui long nhap lai");
            chuSoHuu = input.nextLine();
        }

        System.out.println("Số ghế Của Xe : ( Không nhập chử )");
        String soGhe1 = input.nextLine();
        while (!RegexValidate.checkWeight(soGhe1)){
            System.out.println("Nhap lai sai roi");
            soGhe1 = input.nextLine();
        }
        int soGhe = Integer.parseInt(soGhe1);

        System.out.println("Nhập kiểu xe : Xe Khach or  Xe Du Lich");
        String kieuXe = input.nextLine();
        while (!RegexValidate.checkKieu(kieuXe)) {
            System.out.println("Nhập lại :Xe Khach or Xe Du Lich");
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
            BufferedWriter bf = new BufferedWriter(new FileWriter("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\Oto.csv"));
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

}
