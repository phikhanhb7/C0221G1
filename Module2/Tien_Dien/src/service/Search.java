package service;

import models.NuocNgoai;
import models.VietNam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static Scanner scanner = new Scanner(System.in);

    public static void searchCustomer() {
        List<VietNam> vietNams = new ArrayList<>();
        List<NuocNgoai> nuocNgoais = new ArrayList<>();
        System.out.println("Nhập Thông Tin Khách Hàng Cần Tìm Kiếm ");
        String tenKh = scanner.nextLine();
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
                    String tenKh1 = st[1];
                    String qt = st[2];
                    nuocNgoais.add(new NuocNgoai(makh, tenKh1, qt));
                }
            }
        } catch (Exception e) {
            System.out.println("Không tìm thấy ");
        }
        boolean check = false;
        for (int i = 0; i < vietNams.size() && i < nuocNgoais.size(); i++) {
            if (vietNams.get(i).getTenKhachHang().equalsIgnoreCase(tenKh)) {
                System.out.println(vietNams.get(i).toString());
                check = true;
                break;
            }
            if (nuocNgoais.get(i).getTenKhachHang().equalsIgnoreCase(tenKh)) {
                System.out.println(nuocNgoais.get(i).toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy tên trong danh sách");
        }
    }
}
