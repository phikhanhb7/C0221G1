package pass2_quan_ly_san_pham;

import java.io.IOException;

public class Main extends ProductManager {
    public static void main(String[] args) {
        while (true){
            try {
                menu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
