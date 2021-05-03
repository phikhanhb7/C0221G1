package service;

import models.Oto;
import models.XeMay;
import models.XeTai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.AddCar.*;

public class ShowCar {
    public static Scanner input = new Scanner(System.in);

    public static void showXeMay() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeMay.csv"));
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
            xeMays.clear();
        } catch (Exception e) {
            System.out.println("Khoong tim thay file");
        }
    }

    public static void showOTo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\Oto.csv"));
            String line ;
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
            otos.clear();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Khoong tim thay file");
        }


    }

    public static void showXeTai() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeTai.csv"));
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String list1[] = line.split(",");
                String bienKiemSoat = list1[0];
                String hsx1 = list1[1];
                int nsx1 = Integer.parseInt(list1[2]);
                String csh1 = list1[3];
                double trongTai = Double.parseDouble(list1[4]);
                xeTais.add(new XeTai(bienKiemSoat, hsx1, nsx1, csh1, trongTai));
            }
            for (XeTai xt : xeTais) {
                System.out.println(xt.toString());
            }
            br.close();
            xeTais.clear();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Khoong tim thay file");
        }
    }

}
