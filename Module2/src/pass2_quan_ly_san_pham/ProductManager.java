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
    public static ArrayList<Products> productsList = new ArrayList<>();
    static String regex= "^[a-zA-Z]*$";// nhập bẳng chử cái
    static String regex1= "^[0-9]*$";//nhập số
    static String regex2="^[aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ\n" +
            "fFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTu\n" +
            "UùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ]*$";// nhập dấu
    public static void addProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm Id Sản Phẩm : ");
        String id1 = scanner.nextLine();
        if (!Pattern.matches(regex1,id1)){
            do {
                System.out.println("Vui lòng nhập lại");
                id1 =scanner.nextLine();
                if (Pattern.matches(regex1,id1)){
                    break;
                }
            }while (true);

        }
        int id = Integer.parseInt(id1);


        System.out.print("Thêm Tên Sản Phẩm : ");
        String name = scanner.nextLine();
//        !Pattern.matches(regex,name) &&//nếu muốn nhập bảng chử cái
        if (!Pattern.matches(regex2,name)){// nhập bảng chử có dấu, khác là false thì vui lòng nhập lại
            do {
                System.out.println("Vui lòng nhập lại ");
                name = scanner.nextLine();
                if (Pattern.matches(regex2,name)){
                    break;
                }
            }while (true);

        }
        System.out.print("Thêm Giá Sản Phẩm : ");
       String  price1 =scanner.nextLine();// tạo biến mới
        if (!Pattern.matches(regex1,price1)){// nhập số
           do {
               System.out.println("Vui lòng nhập lại");
                price1 =scanner.nextLine();
               if (Pattern.matches(regex1,price1)){ // khi đúng thì uot
                   break;
               }


           }while (true);
        }
        long price = Long.parseLong(price1); // nhập là String ép về int do khai báo lúc đầu
        Products products = new Products(id,name,price);
        productsList.add(products);
    }
    public static void editProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID Sản Phẩm Cần Sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for(int i = 0 ; i < productsList.size() ; i++){
            if(id == productsList.get(i).getId()){
                System.out.println("Nhập Tên Sản Phẩm Muốn Sửa : ");
                String name = scanner.nextLine();
                System.out.println("Nhập Giá Muốn Sửa : ");
                int price = Integer.parseInt(scanner.nextLine());
                productsList.get(i).setNameProducts(name);
                productsList.get(i).setPriceProduct(price);
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Không tìm thấy sản phầm cùng ID");
        }
    }
    public static void deleteProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id Sản Phẩm Cần Xóa ");
        int id = Integer.parseInt(scanner.nextLine());
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
        int search = scanner.nextInt();
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
        System.out.println("10. Output Report : ");
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
            case 10: outputReport();
                break;
            case 0 : exitManage();
                break;
        }
    }

    private static void outputReport() throws IOException {
        try {
            FileWriter fw = new FileWriter("src\\pass2_quan_ly_san_pham\\readfile.csv");
            for (Products product : productsList) {
                fw.write(product.toString());
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
