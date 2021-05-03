package service;

import models.HoaDon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Edit {
   public static Scanner scanner = new Scanner(System.in);
    public static void editBill(){
        List<HoaDon> hoaDons = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader("D:\\Module2\\Tien_Dien\\src\\data\\HoaDon.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while (true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String[] st = line.split(",");
                HoaDon hoaDon = new HoaDon(Integer.parseInt(st[0]),st[1],st[2],Float.parseFloat(st[3]),Float.parseFloat(st[4]),Double.parseDouble(st[5]));
                hoaDons.add(hoaDon);
            }
            for(HoaDon hoaDon : hoaDons){
                System.out.println(hoaDon.toString());
            }
        }catch (Exception e){
            System.out.println("Không tìm thấy file ! ! !");
        }
        System.out.println("Mời Bạn Chọn Mã Khách Hàng :  ");
        String strCode = scanner.nextLine();
        for(int i = 0; i < hoaDons.size() ; i++){
            if(hoaDons.get(i).getMaKhachHang().equalsIgnoreCase(strCode)){
                System.out.println("Nhập Mã Khách Hàng Cần Sửa ");
                String checkCode = scanner.nextLine();
                hoaDons.get(i).setMaKhachHang(checkCode);
                break;
            }
        }
        try {
            FileWriter file = new FileWriter("D:\\Module2\\Tien_Dien\\src\\data\\HoaDon.csv");
            BufferedWriter bre = new BufferedWriter(file);
            for(HoaDon hoaDon2 : hoaDons){
                bre.write(hoaDon2.toString());
                bre.append("\n");
            }
            bre.close();
            file.close();
        }catch (Exception e){
            System.out.println("Không tìm thấy file : ");
        }
        hoaDons.clear();

    }
}
