package common;

import model.TaiKhoanNganHang;
import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "D:\\Module2\\Bai_Thi\\src\\data\\";

    public static List<TaiKhoanNganHang> docFile(String fileName){
        File file = null ;
        FileReader fileReader = null ;
        BufferedReader bufferedReader = null ;
        String line = null ;
        String[] strings = null ;
        List<TaiKhoanNganHang> taiKhoanNganHangList = new ArrayList<>();

        try{
            file = new File(PATH+ fileName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine()) != null){
                strings = line.split(",");
                if (strings.length == 6 ){
                    TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(strings[0],strings[1],strings[2],
                            strings[3],strings[4],strings[5]);
                    taiKhoanNganHangList.add(taiKhoanThanhToan);
                }else {
                    TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(strings[0],strings[1],strings[2],
                            strings[3],strings[4],strings[5],strings[6],strings[7]);
                    taiKhoanNganHangList.add(taiKhoanTietKiem);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return taiKhoanNganHangList;
    }

    public static void ghiFile(String fileName , List<TaiKhoanNganHang> taiKhoanNganHangList, boolean trangThai ){
        File file = null ;
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null ;
        try{
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoanNganHang taiKhoan : taiKhoanNganHangList ){
                bufferedWriter.write(taiKhoan.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
