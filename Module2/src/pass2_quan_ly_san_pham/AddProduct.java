package pass2_quan_ly_san_pham;

import java.util.Scanner;

public class AddProduct {
    static Scanner scanner = new Scanner(System.in);

    public static String addId(){
        String id ;
        while (true){
            try {
                System.out.println("Nhập id bạn muốn");
                id = scanner.nextLine();
                ProductException.kiemTraId(id);
                return id ;
            }catch (ProductException e){
                System.err.println("Nhập lại đúng định dạng");
            }

        }
    }

    public static String addName(){
        String name ;
        while (true){
            try {
                System.out.println("Nhập tên bạn muốn");
                name = scanner.nextLine();
                ProductException.kiemTraName(name);
                return name;
            }catch (ProductException e){
                System.err.println("Nhập đúng định dạng");
            }
        }
    }

    public static String addPrice(){
        String price ;
        while (true){
            try {
                System.out.println("Nhập giá bạn muốn");
                price = scanner.nextLine();
                ProductException.kiemTraPrice(price);
                return price;
            }catch (ProductException e){
                System.err.println("Nhập đúng định dạng");
            }
        }
    }


}
