package comoms;

import models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiDocFile {
    public static final String PATH = "D:\\Module2\\Bai_Thi\\src\\data\\";

    public static void ghiFile(String fileName, List<DanhBa> danhBaList, boolean trangThai) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhBa danhBa : danhBaList) {
                bufferedWriter.write(danhBa.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<DanhBa> docFile(String fileName) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<DanhBa> canBoList = new ArrayList<>();
        String line = null;
        String[] strings = null;
        try {
            file = new File(PATH + fileName);
            if(!file.exists()){
                file.createNewFile();
            }else {

                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null) {
                    strings = line.split(",");
                    DanhBa danhBa = new DanhBa(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6]);
                    canBoList.add(danhBa);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return canBoList;
    }
}
