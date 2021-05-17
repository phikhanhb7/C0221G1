package controllers;

import comoms.GhiDocFile;
import comoms.RegexAll;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControllers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        danhMuc();
    }

    public static void danhMuc() {
        String chon;
        while (true) {
            System.out.println("CHỨC NĂNG QUẢN LÝ DANH BẠ ");
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Xem danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoa");
            System.out.println("5. Tìm kiếm ");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát ");
            System.out.println("Chọn chức năng");

            chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    xemDanhSach();
                    break;
                case "2":
                    themMoi();
                    break;
                case "3":
                    capNhat();
                    break;
                case "4":
                    xoa();
                    break;
                case "5":
                    timKiem();
                    break;
                case "6":
                    doctuFile();
                    break;
                case "7":
                    ghiVaoFile();
                    break;
                case "8":
                    System.out.println("GOOD BYE");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng định dạng từ 1 -8 ");
            }
        }

    }

    private static void ghiVaoFile() {
        List<DanhBa> danhBaList = new ArrayList<>();
        System.out.println("Ban co muon luu file vao khong:(Y/N)");
        String choose = scanner.nextLine();
        boolean check;
        if (choose.equals("N")) {
            check = false;
            System.out.println("Bạn không muốn lưu file");
        } else {
            check = true;
            GhiDocFile.ghiFile("danhba.csv", danhBaList, true);
            System.out.println("luu file thanh cong");
        }
    }


    private static void doctuFile() {
        List<DanhBa> danhBaList = GhiDocFile.docFile("danhba.csv");
        for (DanhBa danhBa : danhBaList) {
            System.out.println(danhBa.showInfor());
        }


    }

    private static void timKiem() {
        String ten = null;
        List<DanhBa> danhBaList = GhiDocFile.docFile("danhba.csv");

        System.out.println("Nhập tên cần tìm ");
        ten = scanner.nextLine();
        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getHoTen().equals(ten)) {
                System.out.println(danhBa.showInfor());
                break;

            } else {
                System.out.println("Không tìm thấy");
            }
        }
    }


    private static void xoa() {
        List<DanhBa> danhbaList = GhiDocFile.docFile("danhba.csv");
        System.out.println("Nhập số muốn xóa");
        String sdt = scanner.nextLine();
        String chon;
        boolean check = false;
        for (DanhBa danhBa : danhbaList) {
            if (sdt.equals(danhBa.getSoDienThoai())) {
                System.out.println("Bạn có muốn xóa không");
                System.out.println("1 . có");
                System.out.println("2. Không");
                while (true) {
                    chon = scanner.nextLine();
                    switch (chon) {
                        case "1":
                            danhbaList.remove(danhBa);
                            System.out.println("Bạn đã xóa thành công ");
                            GhiDocFile.ghiFile("danhba.csv",danhbaList,false);
                            danhMuc();
                            break;
                        case "2":
                            danhMuc();
                            break;
                        default:
                            System.out.println("Vui lòng chọn theo danh sách ");
                    }
                }

            } else {
                System.out.println("Không có số bạn tìm ");
            }
        }
    }

    private static void capNhat() {
        List<DanhBa> danhBaList = GhiDocFile.docFile("danhba.csv");
        System.out.println("Nhập số điện thoại cần sữa ");
        String chon = scanner.nextLine();
        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getSoDienThoai().equals(chon)) {
                danhBa.setDiaChi(QuanLyNhapLieu.nhapDiaChi());
                danhBa.setHoTen(QuanLyNhapLieu.nhapHoTen());
                System.out.println("Nhập ngày sinh : ");
                danhBa.setNgaySinh(scanner.nextLine());
                GhiDocFile.ghiFile("danhba.csv", danhBaList, false);
                break;

            }
        }
    }


    private static void themMoi() {
        String soDienThoai = QuanLyNhapLieu.nhapSoDienThoai();
        String nhomDanhBa = QuanLyNhapLieu.nhapNhomDanhBa();
        String hoTen = QuanLyNhapLieu.nhapHoTen();
        String gioiTinh = QuanLyNhapLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapLieu.nhapDiaChi();
        System.out.println("Nhập ngày sinh ");
        String ngaySinh = scanner.nextLine();
        String email = QuanLyNhapLieu.nhapEmail();
        List<DanhBa> danhBaList = new ArrayList<>();
        DanhBa danhBa = new DanhBa(soDienThoai, nhomDanhBa, hoTen, gioiTinh, diaChi, ngaySinh, email);
        danhBaList.add(danhBa);
        GhiDocFile.ghiFile("danhba.csv", danhBaList, true);
    }


    private static void xemDanhSach() {
        List<DanhBa> danhBaList = GhiDocFile.docFile("danhba.csv");
        for (DanhBa danhBa : danhBaList) {
            System.out.println(danhBa.showInfor());
        }
    }
}
