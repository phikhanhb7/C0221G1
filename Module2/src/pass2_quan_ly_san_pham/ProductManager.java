package pass2_quan_ly_san_pham;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class ProductManager extends Products {
    public static List<Products> productsList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void addProducts() {
        String id = AddProduct.addId();
        String name = AddProduct.addName();
        String price = AddProduct.addPrice();
        Products products = new Products(id, name, price);
        productsList.add(products);
        DocGhiFile.GhiFile("Produc.csv", productsList, true);
    }

    public static void editProducts() {
        productsList = DocGhiFile.docFile("Produc.csv");
        System.out.print("Nhập ID Sản Phẩm Cần Sửa: ");
        String id = (scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < productsList.size(); i++) {
            if (id.equals(productsList.get(i).getId()))
                System.out.println("Nhập Tên Sản Phẩm Muốn Sửa : ");
            String name = scanner.nextLine();
            System.out.println("Nhập Giá Muốn Sửa : ");
            String price =scanner.nextLine();
            productsList.get(i).setNameProducts(name);
            productsList.get(i).setPriceProduct(price);
            check = true;
            break;
        }
        if (!check){
            System.out.println("Không tìm thấy Id bạn tìm ");
        }
    }


    public static void deleteProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id Sản Phẩm Cần Xóa ");
        String id = (scanner.nextLine());
        int index = -1;
        boolean check = false;
        for(int i = 0 ; i< productsList.size(); i++){
            if(id == productsList.get(i).getId()){
                check = true;
                index = i;
                break;
            }
        }
        if(check == false){
            System.out.println("Không tìm thấy sản phẩm nào : ");
        }else {
            System.out.println("Bạn có muốn xóa Không (Y/N) ");
            String delete = scanner.nextLine();
            if(delete.equalsIgnoreCase("Y")){
                productsList.remove(index);
                displayProducts();
            }else {
                System.out.println("Bạn Đã Quyết Định Không Xóa Sản Phẩm Này"+productsList.get(index));
                System.out.println("Sản Phẩm Sau Khi Quyết Định Không Xóa Là :");
                displayProducts();
            }
        }
    }
    public static void searchName(){
        System.out.println("Bạn Muốn Tìm Kiếm Sản Phẩm : ");
        System.out.println("Nhập Tên Sản Phẩm Bạn Muốn Tìm Kiếm : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean check = false;
        int index = -1;
        for(int i = 0 ; i < productsList.size(); i++){
            if(productsList.get(i).getNameProducts().equalsIgnoreCase(name)){
                check = true;
                index = i;
                break;
            }
        }
        if(check == false){
            System.out.println("Sản Phẩm Của Bạn Không Tìm Thấy");
        }else {
            System.out.println("============================================");
            System.out.println("Sản Phẩm Của Bạn Đã Tìn Thấy "+productsList.get(index));
//            System.out.println("ID sản Phẩm :"+productsList.get(index).getId());
//            System.out.println("Giá Tiền Sản Phẩm :"+productsList.get(index).getPriceProduct());
//            System.out.println("============================================= ");
        }
    }
    public static void searchProducts(){
        System.out.println("Bạn Muốn Tìm Kiếm Sản Phẩm : ");
        System.out.println("Nhập ID Sản Phẩm Bạn Muốn Tìm Kiếm : ");
        Scanner scanner= new Scanner(System.in);
        String search = scanner.nextLine();
        boolean check = false;
        int index = -1;
        for(int i = 0 ; i < productsList.size() ; i++){
            if(search == productsList.get(i).getId()){
                check = true;
                index = i;
                break;
            }
        }
        if(check == false){
            System.out.println("Sản Phẩm Của Bạn Không Tìm Thấy");
        }else {
            System.out.println("Sản Phẩm Của Bạn Tìm Có Trong List");
            System.out.println("ID Của Sản Phẩm Là :" +productsList.get(index).getId());
            System.out.println("Tên Sản Phẩm Là : " + productsList.get(index).getNameProducts());
            System.out.println("Giá tiền sản phẩm là :" + productsList.get(index).getPriceProduct());
        }
    }
    public static void sortProductsId(){
        productsList.sort(Comparator.comparing(Products::getId));
        displayProducts();
    }
    public static void sortProductsName(){
        productsList.sort(Comparator.comparing(Products::getNameProducts));
        displayProducts();
    }
    public static void sortProductsPrices(){
        productsList.sort(Comparator.comparing(Products::getPriceProduct));
        displayProducts();
    }
    public static void displayProducts(){
        for(Products products : productsList){
            System.out.println(products.toString());
        }
    }
    public static void exitManage(){
        System.out.println("Tạm Biệt");
        System.exit(0);
    }
    public static void menu() throws IOException {
        System.out.println("1. Add Products : ");
        System.out.println("2. Edits Products : ");
        System.out.println("3. Delete Products : ");
        System.out.println("4. Sort Products ID : ");
        System.out.println("5. Sort Products Name : ");
        System.out.println("6. Sort Products Prices : ");
        System.out.println("7. Display Products : ");
        System.out.println("8. Search ID Products : ");
        System.out.println("9. Search Name Products : ");
        System.out.println("0. Exit: ");
        int choose ;
        System.out.println("Nhập Lựa chọn");
        Scanner scanner = new Scanner(System.in);
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1 : addProducts();
                break;
            case 2 : editProducts();
                break;
            case 3: deleteProducts();
                break;
            case 4: sortProductsId();
                break;
            case 5: sortProductsName();
                break;
            case 6: sortProductsPrices();
                break;
            case 7 : displayProducts();
                break;
            case 8 : searchProducts();
                break;
            case 9: searchName();
                break;
            case 0 : exitManage();
                break;
        }
    }



}
