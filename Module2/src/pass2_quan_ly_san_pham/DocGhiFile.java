package pass2_quan_ly_san_pham;

import java.io.*;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "src/pass2_quan_ly_san_pham/";
   public static void GhiFile(String fileName, List<Products> productsList , boolean trangThai){
       File file = null ;
       FileWriter fileWriter = null ;
       BufferedWriter bufferedWriter = null ;
       try{
           file = new File(PATH + fileName);
           fileWriter = new FileWriter(file);
           bufferedWriter = new BufferedWriter(fileWriter);
           for (Products products : productsList){
               bufferedWriter.write(products.toString());
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

   public static List<Products> docFile(String fileName){
       File file = null ;
       FileReader fileReader = null ;
       BufferedReader bufferedReader = null ;
       String line = null ;
       String[] strings = null ;
       List<Products> productsList = null ;
       try{
           if (!file.exists()){
               file.createNewFile();
           }
           while ((line = bufferedReader.readLine() ) != null ){
               strings = line.split(",");
               Products products = new Products(strings[1],strings[2],strings[3]);
               productsList.add(products);
           }
       }catch (IOException e){
           e.printStackTrace();
       }
      return productsList ;
   }
}
