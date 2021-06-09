package service;

import common.DocGhiFile;
import model.TaiKhoanNganHang;
import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;

import java.util.ArrayList;
import java.util.List;

public class ServiceTaiKhoanNganHang {


    public static void themTaiKhoanTietKiem() {
        List<TaiKhoanNganHang> taiKhoanNganHangList = new ArrayList<>();
        // id +
        //                "," + maTaiKhoan +
        //                "," + tenChuTaiKhoan +
        //                "," + ngayTaoTaiKhoan+ "," +
        //                        soTienTietKiem +
        //                        "," + ngayGui +
        //                        "," + laiSuat +
        //                        "," + kiHan ;

        String id = addTaiKhoan.nhapID();
        String maTaiKhoan = addTaiKhoan.nhapMaTaiKhoan();
        String tenChuTaiKhoan = addTaiKhoan.nhapTenChuTaiKhoan();
        String ngayTaoTaiKhoan = addTaiKhoan.nhapNgayTaoTaiKhoan();
        String soTienTietKiem = addTaiKhoan.nhapSoTienTietKiem();
        String ngauGui = addTaiKhoan.nhapNgayGui();
        String laiSuat = addTaiKhoan.nhapLaiSuat();
        String kiHan = addTaiKhoan.nhapKiHan();
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(id,maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,
                soTienTietKiem,ngauGui,laiSuat,kiHan);
        taiKhoanNganHangList.add(taiKhoanTietKiem);
        DocGhiFile.ghiFile("data/bank_accounts.csv", taiKhoanNganHangList,true);
    }

    public static void themTaiKhoanThanhToan() {
        List<TaiKhoanNganHang> taiKhoanNganHangList = new ArrayList<>();
        // id +
        //                "," + maTaiKhoan +
        //                "," + tenChuTaiKhoan +
        //                "," + ngayTaoTaiKhoan +
        //                        "," + soThe +
        //                        "," + soTien
        //                ;

        String id = addTaiKhoan.nhapID();
        String maTaiKhoan = addTaiKhoan.nhapMaTaiKhoan();
        String tenChuTaiKhoan = addTaiKhoan.nhapTenChuTaiKhoan();
        String ngayTapTaiKhoan = addTaiKhoan.nhapNgayTaoTaiKhoan();
        String soThe = addTaiKhoan.nhapSoThe();
        String soTien = addTaiKhoan.nhapSoTien();

        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(id , maTaiKhoan , tenChuTaiKhoan, ngayTapTaiKhoan,
                soThe,soTien);
        taiKhoanNganHangList.add(taiKhoanThanhToan);
        DocGhiFile.ghiFile("data/bank_accounts.csv",taiKhoanNganHangList,true);

    }

    public static void hienThiTaiKhoanThanhToan() {
        List<TaiKhoanNganHang> taiKhoanNganHangList = new ArrayList<>();
        taiKhoanNganHangList = DocGhiFile.docFile("data/bank_accounts.csv");
        for (TaiKhoanNganHang taiKhoan : taiKhoanNganHangList ){
            if (taiKhoan instanceof TaiKhoanThanhToan ){
                System.out.println(taiKhoan.showInfor());
            }
        }
    }

    public static void hienThiTaiKhoanTietKiem() {
        List<TaiKhoanNganHang> taiKhoanNganHangList = new ArrayList<>();
        taiKhoanNganHangList = DocGhiFile.docFile("data/bank_accounts.csv");
        for (TaiKhoanNganHang taiKhoan : taiKhoanNganHangList ){
            if (taiKhoan instanceof TaiKhoanTietKiem ){
                System.out.println(taiKhoan.showInfor());
            }
        }
    }
}
