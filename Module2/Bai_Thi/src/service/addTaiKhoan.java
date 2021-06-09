package service;

import common.DocGhiFile;
import common.TaiKhoanEcxeption;
import model.TaiKhoanNganHang;

import java.util.List;
import java.util.Scanner;

public class addTaiKhoan {

    static Scanner scanner = new Scanner(System.in);
    //id +
    //                "," + maTaiKhoan +
    //                "," + tenChuTaiKhoan +
    //                "," + ngayTaoTaiKhoan +
    //                        "," + soThe +
    //                        "," + soTien
    //                ;

    public static String nhapID(){
        String id = null;
        List<TaiKhoanNganHang> taiKhoanNganHangList = DocGhiFile.docFile("data/bank_accounts.csv");
        if (taiKhoanNganHangList.isEmpty()){
            id = "1";
        }else {
            id = ""+(taiKhoanNganHangList.size()+1);
        }
        return id;
    }
    public static String nhapMaTaiKhoan(){
        System.out.println("Nhập mã tài khoản ");
        String maTaiKhoan = scanner.nextLine();
        return maTaiKhoan ;
    }
    public static String nhapTenChuTaiKhoan(){
        System.out.println("Nhập tên chủ tai khoản  ");
        String tenChuTaiKhoan = scanner.nextLine();
        return tenChuTaiKhoan ;
    }

    public static String nhapNgayTaoTaiKhoan(){
        System.out.println("Nhập ngày tạo tài khoản ");
        String ngayTaoTaiKhoan = scanner.nextLine();
        return ngayTaoTaiKhoan ;
    }


    public static String nhapSoThe(){
        String soThe = null;
        while (true){
            try{
                System.out.println("Nhập số thẻ ");
                soThe = scanner.nextLine();
                TaiKhoanEcxeption.kiemTraSoDuong(soThe);
                return soThe;
            }catch (TaiKhoanEcxeption e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapSoTien(){
        String soTien = null;
        while (true){
            try{
                System.out.println("Nhập Số tiền trong tài khoản thanh toán  ");
                soTien = scanner.nextLine();
                TaiKhoanEcxeption.kiemTraSoDuong(soTien);
                return soTien;
            }catch (TaiKhoanEcxeption e){
                System.err.println(e.getMessage());
            }
        }
    }

    //    soTienTietKiem +
    //                        "," + ngayGui +
    //                        "," + laiSuat +
    //                        "," + kiHan ;

    public static String nhapSoTienTietKiem(){
        String soTienTietKiem = null;
        while (true){
            try{
                System.out.println("Nhập số tiên tiết kiệm ");
                soTienTietKiem = scanner.nextLine();
                TaiKhoanEcxeption.kiemTraSoDuong(soTienTietKiem);
                return soTienTietKiem;
            }catch (TaiKhoanEcxeption e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapNgayGui(){
        System.out.println("Nhập ngày gửi");
        String ngayGui = scanner.nextLine();
        return ngayGui ;
    }

    public static String nhapLaiSuat(){
        System.out.println("Nhập lãi suất ");
        String laiSuat = scanner.nextLine();
        return laiSuat ;
    }
    public static String nhapKiHan(){
        System.out.println("Nhập kì hạn ");
        String kiHan = scanner.nextLine();
        return kiHan ;
    }

}
