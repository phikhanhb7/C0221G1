package service;

import commons.RegexValidate;
import models.HoaDon;
import models.NuocNgoai;
import models.VietNam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add {
    public static Scanner scanner = new Scanner(System.in);
    public static List<VietNam> vietNams = new ArrayList<>();
    public static List<NuocNgoai> nuocNgoais = new ArrayList<>();

    public static void addCustomers() {
        System.out.println("Bạn Muốn Thêm Mới Khách Hàng Nào : ");
        System.out.println("1.Khách Hàng Việt Nam :");
        System.out.println("2.Khách Hàng Nước Ngoài : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                addVietNam();
                break;
            case 2:
                addNuocNgoai();
                break;
            default:
                System.out.println("Sai Số Rồi Bạn Cần Nhập Lại");
        }

    }

    public static void addVietNam() {
        System.out.println("Nhập thông tin");
        System.out.println("Nhập Mã Khách Hàng");
        String maKh = scanner.nextLine();
        while (!RegexValidate.checkVietNam(maKh)) {
            System.out.println("Bạn Đã Nhập Sai : ");
            maKh = scanner.nextLine();
        }
        System.out.println("Nhập Tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập Loại Khách Hàng ");
        String loai = scanner.nextLine();
        System.out.println("Nhập Định Mức");
        float dinhMuc = Float.parseFloat(scanner.nextLine());

        VietNam vietNam = new VietNam(maKh, name, loai, dinhMuc);
        vietNams.add(vietNam);
        try {
            FileWriter fr = new FileWriter("D:\\Module2\\Tien_Dien\\src\\data\\KhachHang.csv", true);
            BufferedWriter bf = new BufferedWriter(fr);
            for (VietNam vietNam1 : vietNams) {
                bf.write(vietNam1.toString());
                bf.append("\n");
            }
            bf.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNuocNgoai() {
        System.out.println("Nhập Thông Tin ");
        System.out.println("Mã Khách Hàng ");
        String mkh = scanner.nextLine();
        System.out.println("Nhập Tên Khách Hàng ");
        String tenKh = scanner.nextLine();
        System.out.println("Nhập Quốc Tịch ");
        String qt = scanner.nextLine();

        NuocNgoai nuocNgoai = new NuocNgoai(mkh, tenKh, qt);

        nuocNgoais.add(nuocNgoai);

        try {
            FileWriter fileWriter = new FileWriter("D:\\Module2\\Tien_Dien\\src\\data\\KhachHang.csv", true);
            BufferedWriter bf = new BufferedWriter(fileWriter);
            for (NuocNgoai nuocNgoai1 : nuocNgoais) {
                bf.write(nuocNgoai1.toString());
                bf.append("\n");
            }
            bf.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Không tìm thấy file");
        }
    }

    public static void addBill() {
        List<HoaDon> hoaDons = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\Module2\\Tien_Dien\\src\\data\\KhachHang.csv");
            BufferedReader bf = new BufferedReader(fileReader);
            String line = null;

            while (true) {
                line = bf.readLine();
                if (line == null) {
                    break;
                }
                String[] st = line.split(",");
                if (st.length == 4) {
                    String ma = st[0];
                    String ten = st[1];
                    String loai = st[2];
                    float dm = Float.parseFloat(st[3]);
                    vietNams.add(new VietNam(ma, ten, loai, dm));
                }
                if (st.length == 3) {
                    String makh = st[0];
                    String tenKh = st[1];
                    String qt = st[2];
                    nuocNgoais.add(new NuocNgoai(makh, tenKh, qt));
                }
            }
            for (VietNam vietNam : vietNams) {
                System.out.println(vietNam.toString());
            }
            for (NuocNgoai nuocNgoai : nuocNgoais) {
                System.out.println(nuocNgoai.toString());
            }
        } catch (Exception e) {
            System.out.println("Không tìm thấy ");
        }


        System.out.println("Khách Hàng Cần Thêm Bill : ");
        System.out.println("1. Khách Hàng Việt Nam");
        System.out.println("2. Khách Hàng Nước Ngoài");

        System.out.println("Mòi bạn Chọn Khách Hàng :");
        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose) {
            case 1:
                int mahoadon = 0;
                System.out.println("Nhập Thông Tin Khách Hàng");
                String ttKhachHang = scanner.nextLine();
                System.out.println("Nhập Thông Tin Hóa Đơn");
                System.out.println("Ngày Ra Hóa Đơn");
                String ngay = scanner.nextLine();
                System.out.println("Số Lượng");
                float soLuong = Float.parseFloat(scanner.nextLine());
                System.out.println("Đơn Giá");
                float donGia = Float.parseFloat(scanner.nextLine());
                double thanhtien = 0;
                for (int i = 0; i < vietNams.size(); i++) {
                    if (vietNams.get(i).getMaKhachHang().equalsIgnoreCase(ttKhachHang)) {
                        if (soLuong <= vietNams.get(i).getDinhMuctieuThu()) {
                            thanhtien = soLuong * donGia;
                            break;
                        } else {
                            thanhtien = ((soLuong * donGia * vietNams.get(i).getDinhMuctieuThu()) + (((vietNams.get(i).getDinhMuctieuThu() - soLuong)) * donGia * 2.5));
                            break;
                        }
                    }
                }
                HoaDon hoaDon = new HoaDon(++mahoadon, ttKhachHang, ngay, soLuong, donGia, thanhtien);
                hoaDons.add(hoaDon);
                try {
                    FileWriter fileWriter = new FileWriter("D:\\Module2\\Tien_Dien\\src\\data\\HoaDon.csv");
                    BufferedWriter bw = new BufferedWriter(fileWriter);
                    for (HoaDon hoaDon1 : hoaDons) {
                        bw.write(hoaDon1.toString());
                        bw.append("\n");
                    }
                    bw.close();
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println("Không tìm thấy file ! ");
                }
                hoaDons.clear();
                break;
            case 2:
                int mahoadon1 = 0;
                System.out.println("Nhập Thông Tin Khách Hàng");
                String ttKhachHang1 = scanner.nextLine();
                System.out.println("Nhập Thông Tin Hóa Đơn");
                System.out.println("Ngày Ra Hóa Đơn");
                String ngay1 = scanner.nextLine();
                System.out.println("Số Lượng");
                float soLuong1 = Float.parseFloat(scanner.nextLine());
                System.out.println("Đơn Giá");
                float donGia1 = Float.parseFloat(scanner.nextLine());
                double thanhtien1 = soLuong1 * donGia1;
                HoaDon hoaDon1 = new HoaDon(++mahoadon1, ttKhachHang1, ngay1, soLuong1, donGia1, thanhtien1);
                hoaDons.add(hoaDon1);
                try {
                    FileWriter file = new FileWriter("D:\\Module2\\Tien_Dien\\src\\data\\HoaDon.csv");
                    BufferedWriter bre = new BufferedWriter(file);
                    for (HoaDon hoaDon2 : hoaDons) {
                        bre.write(hoaDon2.toString());
                        bre.append("\n");
                    }
                    bre.close();
                    file.close();
                } catch (Exception e) {
                    System.out.println("Không tìm thấy file : ");
                }
                hoaDons.clear();
                break;
        }

    }
}
