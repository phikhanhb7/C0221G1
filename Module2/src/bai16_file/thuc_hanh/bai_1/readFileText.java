package bai16_file.thuc_hanh.bai_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFileText  {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src\\bai16_file\\thuchanh\\Number.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        int sum =0 ;
        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
            sum += Integer.parseInt(line);

        }
        bufferedReader.close();
        System.out.println("Tổng  =" + sum);
    }

}
