package bai17_binaryfile.thuchanh;

import java.io.*;
import java.util.List;

public class WriteFile<E> {
    public void writeToFile(String path , List<E> kk){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(kk);
            fos.close();
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  List<E> readFromFile(String path , List<E> bb){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bb = (List<E>) ois.readObject();
            fis.close();
            ois.close();
        }catch ( Exception e){
            e.printStackTrace();
        }
        return bb ;

    }
}
