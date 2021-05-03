package service;

import models.HoaDon;
import models.NuocNgoai;
import models.VietNam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Show {
    public static void showCustomer() {
        List<VietNam> vietNams = new ArrayList<>();
        List<NuocNgoai> nuocNgoais = new ArrayList<>();
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
    }

    public static void showBill() {
        List<HoaDon> hoaDons = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\Module2\\Tien_Dien\\src\\data\\HoaDon.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] st = line.split(",");
                HoaDon hoaDon = new HoaDon(Integer.parseInt(st[0]), st[1], st[2], Float.parseFloat(st[3]), Float.parseFloat(st[4]), Double.parseDouble(st[5]));
                hoaDons.add(hoaDon);
            }
            for (HoaDon hoaDon : hoaDons) {
                System.out.println(hoaDon.toString());
            }
        } catch (Exception e) {
            System.out.println("Không tìm thấy file ! ! !");
        }
    }
}
