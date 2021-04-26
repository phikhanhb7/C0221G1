package bai_quan_ly_san_pham;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.*;

public class ProductManager extends Product {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product sp1 = new Product(1,"Iphone 5",5000);
        Product sp2 = new Product(2,"Iphone 6",6000);
        Product sp3 = new Product(3,"Iphone 7",7000);
        Product sp4 = new Product(4,"Iphone 8",8000);

        productList.add(sp1);
        productList.add(sp2);
        productList.add(sp3);
        productList.add(sp4);
        productList.size();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("Chọn việc bạn muốn");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addProduct(productList, scanner);
                    break;
                case 2:
                    displayProduct(productList);
                    break;
                case 3 :
                    EditProduct(productList, scanner);
                    break;

                case 4:
                    deleteProduct(productList, scanner);

                    break;
                case 5:
                    searchProduct(productList, scanner);
                    break;
                case 6 :
                    sortPriceUp(productList);
                    break;
                case 7 :
                    sortPriceDown(productList);
                    break;
                case 8:
                    System.out.println("Good bye");
                    break;
                default:
                    System.err.println("Nhập lại nhé ! Sai rồi");


            }

        } while (choose != 8);

    }

    private static void sortPriceDown(List<Product> productList) {
        System.out.println("Sắp xếp Giam dần ");
        Collections.reverse(productList);
    }

    private static void sortPriceUp(List<Product> productList) {
        System.out.println("Sắp xếp theo giá tăng dần");
        productList.sort(Comparator.comparing(Product::getPrice));
    }

    private static void searchProduct(List<Product> productList, Scanner scanner) {
        System.out.println("Nhập tên sản phẩm ");
        String name = scanner.nextLine();

        for (Product item : productList){
            if (name.equals(item.getName())){
                System.out.println(item.toString());
            }
        }
    }

    private static void deleteProduct(List<Product> productList, Scanner scanner) {
        System.out.println("Chọn ID sản phẩm cần sữa");
        int number = Integer.parseInt(scanner.nextLine());
        boolean check = true ;
        for (Product item : productList){
            if (number == item.getId()){
                productList.remove(item);
                check = false;
                break;
            }
        }
        if (check){
        System.out.println("Bạn nhập sai ");
    }
    }

    private static void EditProduct(List<Product> productList, Scanner scanner) {
        System.out.println("Nhập Id sản phẩm bạn muốn sữa ");
        int num = Integer.parseInt(scanner.nextLine());
        Product productEdit = null;
        for (Product product: productList) {
            if (num == product.getId()) {
                productEdit = product;
            }
        }
        // System.out.println("Nhập Id mới "+ productEdit.setName(""););
        if (productEdit == null ) {
            System.out.println("Không có sản phẩm bạn tìm");
        }else {
            System.out.println("Nhập ID mới");
            int newId = Integer.parseInt(scanner.nextLine());
            productEdit.setId(newId);

            System.out.println("Nhập tên sản phẩm mới");
            String newName = scanner.nextLine();
            productEdit.setName(newName);

            System.out.println("Nhập Giá sản phẩm :");
            int newPrice = Integer.parseInt(scanner.nextLine());
            productEdit.setPrice(newPrice);

            System.out.println("đã update thành công");
        }
    }

    private static void displayProduct(List<Product> productList) {
        System.out.println("DANH SÁCH SẢN PHẨM HIỆN CÓ ");
        for (Product item : productList){
            System.out.println(item + " ,");
//                      System.out.println("Id " + item.getId() + " Tên Sản phẩm " + item.getName() + " Giá " + item.getPrice());
        }
    }

    private static void addProduct(List<Product> productList, Scanner scanner) {
        int n;
        System.out.println("Nhập số sản phẩm cần thêm");
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Product newsp = new Product();
            newsp.inPut();
            productList.add(newsp);
        }
    }

    static void showMenu() {
        System.out.println("1. Thêm SẢM PHẨM");
        System.out.println("2. HIỂN THỊ DANH SÁCH SẢN PHẨM");
        System.out.println("3. SỮA THÔNG TIN SẢN PHẨM ");
        System.out.println("4. XÓA SẢN PHẨM  ");
        System.out.println("5. TÌM KIẾM SẢN PHẨM THEO TÊN  ");
        System.out.println("6. Sắp xếp SẢN PHẨm theo gái tăng dần  ");
        System.out.println("7. Sắp xếp SẢN PHẨM theo giá giảm dần  ");
        System.out.println("8. THoát");
    }


}
