package manage;

import comoms.CustomerException;

import java.util.Scanner;

public class AddCustomers {
    static Scanner scanner = new Scanner(System.in);

    public static String nhapHoTen() {
        String hoTen;
        while (true) {
            try {
                System.out.println("Nhập họ tên Customer");
                hoTen = scanner.nextLine();
                CustomerException.kiemTraHoTen(hoTen);
                return hoTen;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapNgaySinh() {
        String ngaySinh;
        int year = 0 ;
        while (true) {
            try {
                System.out.println("Nhập Ngày Sinh");
                ngaySinh = scanner.nextLine();
                CustomerException.kiemTraNgaySinh(ngaySinh);
                year=2021-Integer.parseInt(ngaySinh.substring(6));
                while (true){
                    if(year<18){
                        System.err.println("Less than the current year 18 years");
                        System.out.println("Enter Customer Birthday");
                        ngaySinh = scanner.nextLine();
                        CustomerException.kiemTraNgaySinh(ngaySinh);
                        year=2021-Integer.parseInt(ngaySinh.substring(6));
                    }else {
                        break;
                    }
                }
                return ngaySinh;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapGioiTinh() {
        String gioiTinh;
        while (true) {
            try {
                System.out.println("Nhập giới tính");
                gioiTinh = scanner.nextLine();
                CustomerException.kiemTraGioiTinh(gioiTinh);
                gioiTinh = gioiTinh.toLowerCase();
                if(gioiTinh.equals("male")){
                    gioiTinh = "Male";
                }else if(gioiTinh.equals("female")){
                    gioiTinh = "Female";
                }else {
                    gioiTinh ="Unknow";
                }
                return gioiTinh;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapSoChungMinh() {
        String soChungMinh;
        while (true) {
            try {
                System.out.println("Nhập Số Chứng Minh");
                soChungMinh = scanner.nextLine();
                CustomerException.kiemTraChungMinh(soChungMinh);
                return soChungMinh;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapSoDienThoai() {
        String soDienThoai;
        while (true) {
            try {
                System.out.println("Nhập Số Điện thoại");
                soDienThoai = scanner.nextLine();
                CustomerException.kiemTraSoDienThoai(soDienThoai);
                return soDienThoai;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapEmail() {
        String emai;
        while (true) {
            try {
                System.out.println("Nhập Số Email");
                emai = scanner.nextLine();
                CustomerException.kiemTraEmail(emai);
                return emai;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapLoaiKhach() {
        String loaiKhach;
        while (true) {
            try {
                System.out.println("Nhập Loại Khach");
                loaiKhach = scanner.nextLine();
                CustomerException.kiemTraLoaiKhach(loaiKhach);
                return loaiKhach;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String nhapDiaChi() {
        String diaChi;
        while (true) {
            try {
                System.out.println("Nhập địa chỉ ");
                diaChi = scanner.nextLine();
                CustomerException.kiemTraHoTen(diaChi);
                return diaChi;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
