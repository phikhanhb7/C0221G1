package service;

import models.Oto;
import models.XeMay;
import models.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.AddCar.*;

public class DeleteCar {
    public static Scanner input = new Scanner(System.in);

    public static void deleteXeTai() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeTai.csv"));
            String line = null;
            while (((line = br.readLine()) != null)) {
                String[] list = line.split(",");
                String bienKiemSoat = list[0];
                String hangSX = list[1];
                int namSX = Integer.parseInt(list[2]);
                String chuSH = list[3];
                double taiTrong = Double.parseDouble(list[4]);
                xeTais.add(new XeTai(bienKiemSoat, hangSX, namSX, chuSH, taiTrong));

            }
            boolean check = false;
            System.out.println("Nhập Biển Kiểm Xoát Bạn Muốn Xóa : ");
            String bks = input.nextLine();
            for (int i = 0; i < xeTais.size(); i++) {
                if (xeTais.get(i).getBienKS().equals(bks)) {
                    check = true;
                    System.out.println("Bạn Có Muốn Xóa Không : ");
                    System.out.println("1. Xóa");
                    System.out.println("2. Không");
                    int isNumberDelete = Integer.parseInt(input.nextLine());
                    switch (isNumberDelete) {
                        case 1:
                            xeTais.remove(xeTais.get(i));
                            System.out.println("Bạn Đã Xóa Thành Công");
                            break;
                        case 2:
                            System.out.println("Bạn Không Muốn Xóa :");
                            break;
                    }

                }
            }
            if (!check) {
                System.out.println("Không Tìm Thấy Biển Kiểm Xoát Cần Xóa");

            }
            br.close();
        } catch (Exception e) {
            System.out.println("Không tìm thấy file");
        }
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeTai.csv"));
            for (XeTai xt : xeTais) {
                buf.write(xt.toString());
                buf.append("\n");
            }
            buf.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không Tìm Thấy File :");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void deleteXeMay() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeMay.csv"));
            String line = null;
            while (((line = br.readLine()) != null)) {
                String[] list = line.split(",");
                String bienKiemSoat = list[0];
                String hangSX = list[1];
                int namSX = Integer.parseInt(list[2]);
                String chuSH = list[3];
                double congSuat = Double.parseDouble(list[4]);
                xeMays.add(new XeMay(bienKiemSoat, hangSX, namSX, chuSH, congSuat));

            }
            boolean check = false;
            System.out.println("Nhập Biển Kiểm Xoát Bạn Muốn Xóa : ");
            String bks = input.nextLine();
            for (int i = 0; i < xeMays.size(); i++) {
                if (xeMays.get(i).getBienKS().equals(bks)) {
                    check = true;
                    System.out.println("Bạn Có Muốn Xóa Không : ");
                    System.out.println("1. Xóa");
                    System.out.println("2. Không");
                    int isNumberDelete = Integer.parseInt(input.nextLine());
                    switch (isNumberDelete) {
                        case 1:
                            xeMays.remove(xeMays.get(i));
                            System.out.println("Bạn Đã Xóa Thành Công");
                            break;
                        case 2:
                            System.out.println("Bạn Không Muốn Xóa :");
                            break;
                    }

                }
            }
            if (!check) {
                System.out.println("Không Tìm Thấy Biển Kiểm Xoát Cần Xóa");
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Không tìm thấy file");
        }
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\XeMay.csv"));
            for (XeMay xm : xeMays) {
                buf.write(xm.toString());
                buf.append("\n");
            }
            buf.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không Tìm Thấy File :");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteOto() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\Oto.csv"));
            String line = null;
            while (((line = br.readLine()) != null)) {
                String[] list = line.split(",");
                String bienKiemSoat = list[0];
                String hangSX = list[1];
                int namSX = Integer.parseInt(list[2]);
                String chuSH = list[3];
                int soGhe = Integer.parseInt(list[4]);
                String kieuXe = list[5];
                otos.add(new Oto(bienKiemSoat, hangSX, namSX, chuSH, soGhe,kieuXe));

            }
            boolean check = false;
            System.out.println("Nhập Biển Kiểm Xoát Bạn Muốn Xóa : ");
            String bks = input.nextLine();
            for (int i = 0; i < otos.size(); i++) {
                if (otos.get(i).getBienKS().equals(bks)) {
                    check = true;
                    System.out.println("Bạn Có Muốn Xóa Không : ");
                    System.out.println("1. Xóa");
                    System.out.println("2. Không");
                    int isNumberDelete = Integer.parseInt(input.nextLine());
                    switch (isNumberDelete) {
                        case 1:
                            otos.remove(otos.get(i));
                            System.out.println("Bạn Đã Xóa Thành Công");
                            break;
                        case 2:
                            System.out.println("Bạn Không Muốn Xóa :");
                            break;
                    }

                }
            }
            if (check) {
                System.out.println("Không Tìm Thấy Biển Kiểm Xoát Cần Xóa");
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Không tìm thấy file");
        }
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter("D:\\Module2\\Quan_Ly_Phuong_Tien\\src\\data\\Oto.csv"));
            for (Oto ot : otos) {
                buf.write(ot.toString());
                buf.append("\n");
            }
            buf.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không Tìm Thấy File :");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
