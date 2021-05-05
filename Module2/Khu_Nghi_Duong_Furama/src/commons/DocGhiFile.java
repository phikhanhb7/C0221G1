package commons;

import models.BietThu;
import models.DichVu;
import models.Nha;
import models.Phong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {

    public static final String PATH = "D:\\Module2\\Khu_Nghi_Duong_Furama\\src\\data\\";

    public static void ghiFile(String fileName, List<DichVu> dichVuList, boolean trangThai){
        File file = new File(PATH+fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DichVu dichVu : dichVuList){
                bufferedWriter.write(dichVu.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }



    public static List<DichVu> docFile(String fileName){
        File file = new File(PATH+fileName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<DichVu> dichVuList = new ArrayList<>();
        String[] strings = null;
        String line = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                strings = line.split(",");
                if (strings.length == 9){
                    DichVu bietThu = new BietThu(strings[0],Double.parseDouble(strings[1]),Double.parseDouble(strings[2]),Integer.parseInt(strings[3]),strings[4],strings[5],strings[6],Double.parseDouble(strings[7]),Integer.parseInt(strings[8]));
                    dichVuList.add(bietThu);
                }else if(strings.length == 8 ){
                    DichVu nha = new Nha(strings[0],Double.parseDouble(strings[1]),Double.parseDouble(strings[2]),Integer.parseInt(strings[3]),(strings[4]),strings[5],strings[6],Integer.parseInt(strings[7]));
                    dichVuList.add(nha);
                }else {
                    DichVu phong = new Phong(strings[0],Double.parseDouble(strings[1]),Double.parseDouble(strings[2]),Integer.parseInt(strings[3]),(strings[4]),strings[5]);
                    dichVuList.add(phong);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return dichVuList;
    }
}
