//package Quan_Ly_Truong_Hoc.src.controllers;
//
//import commons.ReadAndWrite;
//import commons.Validation;
//import models.ConNguoi;
//import models.SinhVien;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    static Scanner scanner = new Scanner(System.in);
//    static boolean check = false;
//
//
//    public static void main(String[] args) {
//        hienThiMenuChinh();
//    }
//
//    public static void hienThiMenuChinh() {
//        while (true) {
//            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN\n" +
//                    "Chọn chức năng:\n" +
//                    "1. Thêm mới sinh viên .\n" +
//                    "2. Xóa sinh viên\n" +
//                    "3.Xem danh sách sinh viên\n" +
//                    "4. Xem thông tin giáo viên\n" +
//                    "5. Tìm kiếm sinh viên \n" +
//                    "6. Thoát\n");
//            System.out.println("Chọn chức năng :");
//            String choice = scanner.nextLine();
//            switch (choice) {
//                case "1":
//                    themMoiHocSinh();
//                    break;
//                case "2":
//                    xoaChiTiec("students.csv");
//                    break;
//                case "3":
//                    hienThiChiTiec("students.csv");
//                    break;
//                case "4":
//                    hienThiChiTiec("teacher.csv");
//                    break;
//                case "5":
//                    tiemKiemChiTiec("students.csv");
//                    break;
//                case "6":
//                    System.out.println("SEE YOU AGAIN");
//                    System.exit(0);
//                default:
//                    System.err.println("Chọn lại");
//            }
//        }
//    }
//    public static void themMoiHocSinh() {
//        int maHocinh= CRUDController.themMaHS();
//        String hoTen= CRUDController.themHoTen();
//        String ngaySinh=CRUDController.themNgaySinh();
//
//        System.out.println("Nhập giới tính");
//        String gioiTinh=scanner.nextLine();
//
//        String soDienThoai = CRUDController.themSoDienThoai();
//
//        hienThiChiTiec("batchs.csv");
//        String lopHoc=CRUDController.themLop();
//
//        ConNguoi conNguoi=new SinhVien(maHocinh,hoTen,ngaySinh,gioiTinh,soDienThoai,lopHoc);
//        ReadAndWrite.writeFileString("students.csv",conNguoi.toString(),true);
//    }
//
//    public static void xoaChiTiec(String name) {
//        String chon;
//
//        do {
//            hienThiChiTiec(name);
//            System.out.println("chọn cần xóa:");
//            chon = scanner.nextLine();
//        } while (!(Validation.kiemTraDauVao(Validation.SO_NGUYEN_DUONG, chon) && Validation.kiemTraLuaChon(name,chon)));
//        List<String> list = ReadAndWrite.readFileString(name);
//        System.out.println("bạn muốn xóa hay không?");
//        System.out.println("1. Xóa");
//        System.out.println("2. Không");
//        System.out.println("chọn chức năng");
//        String choice = scanner.nextLine();
//        switch (choice) {
//            case "1":
//                list.remove(Integer.parseInt(chon) - 1);
//                break;
//            case "2":
//                hienThiMenuChinh();
//                break;
//            default:
//                System.err.println("SELECT FUNCTION AGAIN");
//        }
//
//        ReadAndWrite.writeFileList(name, list, false);
//    }
//
//
//    public static void hienThiChiTiec(String name) {
//        List<String> list = ReadAndWrite.readFileString(name);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println((i + 1) + ". " + list.get(i));
//        }
//    }
//
//    public static void tiemKiemChiTiec(String name) {
//        String tenTimKiem;
//        check = false;
//        do {
//            System.out.println("nhập tên cần tìm kiếm");
//            tenTimKiem = scanner.nextLine();
//        } while (!Validation.kiemTraDauVao(Validation.CHUOI_VACHAM, tenTimKiem));
//
//        List<String> list = ReadAndWrite.readFileString(name);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).contains(tenTimKiem)) {
//                System.out.println(list.get(i));
//                check = true;
//            }
//        }
//        if (!check) {
//            System.out.println("Không tìm thấy tên trong danh sách");
//        }
//    }
//}
