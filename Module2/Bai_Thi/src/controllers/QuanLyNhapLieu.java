package controllers;

import comoms.RegexAll;

import java.util.Scanner;

public class QuanLyNhapLieu {
    static Scanner scanner = new Scanner(System.in);


    public static String nhapSoDienThoai(){
        String hoTen = null;
        while (true){
            try{
                System.out.println("Nhập số điện thoại ");
                hoTen = scanner.nextLine();
                RegexAll.kiemTraSoDienThoai(hoTen);
                return hoTen;
            }catch (RegexAll e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapNhomDanhBa(){
        String nhomDanhBa = null;
        while (true){
            try{
                System.out.println("Nhập nhóm danh bạ ");
                nhomDanhBa = scanner.nextLine();
                RegexAll.kiemTraHoTen(nhomDanhBa);
                return nhomDanhBa;
            }catch (RegexAll e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapHoTen(){
        String hoTen = null;
        while (true){
            try{
                System.out.println("nhap ho ten");
                hoTen = scanner.nextLine();
                RegexAll.kiemTraHoTen(hoTen);
                return hoTen;
            }catch (RegexAll e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapGioiTinh(){
        String gioiTinh = null;
        while (true){
            try{
                System.out.println("Nhập giới tính");
                gioiTinh = scanner.nextLine();
                RegexAll.kiemTraGioiTinh(gioiTinh);
                return gioiTinh;
            }catch (RegexAll e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapDiaChi(){
        String diaChi = null;
        while (true){
            try{
                System.out.println("Nhập địa chỉ");
                diaChi = scanner.nextLine();
                RegexAll.kiemTraHoTen(diaChi);
                return diaChi;
            }catch (RegexAll e){
                System.err.println(e.getMessage());
            }
        }
    }


    public static String nhapEmail(){
        String email = null;
        while (true){
            try{
                System.out.println("Nhập Email ");
                email = scanner.nextLine();
                RegexAll.kiemTraEmail(email);
                return email;
            }catch (RegexAll e){
                System.err.println(e.getMessage());
            }
        }
    }
}
