package bai16_file.baitap;

import java.io.*;

public class ReadFileIO {
    public static void main(String[] args) {
//        File file = new File("src\\bai16_file\\baitap\\Read.csv");// tạo file trong java
//        if (!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            FileWriter fileWriter = new FileWriter("src\\bai16_file\\baitap\\Read.csv",true);// true là để chèn , mặc đinh fales
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("Good bye");
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("src\\bai16_file\\baitap\\Read.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine())!= null){
                String[] strings = line.split(",");
                System.out.println(strings[strings.length - 1]);
            }
        } catch (IOException e) {
            e.printStackTrace();

    }catch (Exception e){
            e.printStackTrace();
        }
}
}
