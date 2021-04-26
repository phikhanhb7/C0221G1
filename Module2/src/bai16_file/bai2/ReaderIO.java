package bai16_file.bai2;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class ReaderIO {
    public static void main(String[] args) throws IOException{

        String string1 = "src\\bai16_file\\bai2\\ReadFile.csv";// tạo nhé kẻo nó không pt đọc chổ mô
        String string2 = "src\\bai16_file\\bai2\\WriteFile.csv"; // cứ viết chạy nó tự tạo chổ để truyền vào

        BufferedReader bufferedReader = new BufferedReader(new FileReader(string1));// đọc file có gì
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(string2));// file viết đang trống

        String line ;
        // tạo thử Set cho khỏi trùng lặp
        Set<String> str = new TreeSet<>();
        while ((line = bufferedReader.readLine() )!= null){// đọc cho đến khi line = null
            System.out.println(line);// đọc xem trong file read có gì
            bufferedWriter.write(line);// viết vào file2
            bufferedWriter.newLine();//xuống dòng giống với \n
            String[] strings = line.split(",");
            str.add(strings[strings.length -1 ]);

        }
        str.forEach(e -> {
            System.out.println(e);
        });
        bufferedReader.close();// đóng đọc khi while kết thúc
        bufferedWriter.flush();//
        bufferedWriter.close();// đóng viết sau khi đọc xong
    }

}
