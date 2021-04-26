package bai17_binaryfile.baitap;

import bai17_binaryfile.thuchanh.Student;
import bai17_binaryfile.thuchanh.WriteFile;
import pass2_quan_ly_san_pham.Products;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class QuanLySanPham implements Serializable {
    private static Scanner input = new Scanner(System.in);
    private int id;
    private String nameProducts;
    private double priceProduct;
    public QuanLySanPham() {
    }
    public QuanLySanPham(int id, String nameProducts, double priceProduct) {
        this.id = id;
        this.nameProducts = nameProducts;
        this.priceProduct = priceProduct;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNameProducts() {
        return nameProducts;
    }
    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }
    public double getPriceProduct() {
        return priceProduct;
    }
    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }
    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", nameProducts='" + nameProducts + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

    public static void addProducts(List<QuanLySanPham> lySanPhamList ){

        String regex= "^[a-zA-Z]*$";// nhập bẳng chử cái
        String regex1= "^[0-9]*$";//nhập số
       String regex2="^[aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ\n" +
                "fFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTu\n" +
                "UùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ]*$";// nhập dấu
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
        QuanLySanPham products = new QuanLySanPham(id,name,price);
        lySanPhamList.add(products);
    }

    public static void main(String[] args) {
        List<QuanLySanPham> lySanPhamList = new ArrayList<>();
        System.out.println("Nhập số lượng muốn thêm");
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < number ; i++) {
            QuanLySanPham.addProducts(lySanPhamList);
        }


        WriteFile<QuanLySanPham> writeFile = new WriteFile<>();
        writeFile.   writeToFile("D:\\Module2\\src\\bai17_binaryfile\\baitap\\text.csv" , lySanPhamList);
        System.out.println(writeFile. readFromFile("D:\\Module2\\src\\bai17_binaryfile\\baitap\\text.csv", lySanPhamList));
    }
    //writeFile("E:\\C0221G1-NguyenPhuongNam\\module2\\src\\bai17_\\bai_tap\\quan_ly_file_nhi_phan\\quanLyHangHoa.txt", sanPham);
    //List<QuanLyHangHoa> sanPhams = readFile("E:\\C0221G1-NguyenPhuongNam\\module2\\src\\bai17_\\bai_tap\\quan_ly_file_nhi_phan\\quanLyHangHoa.txt");
    //for (QuanLyHangHoa e : sanPhams) {
    //    System.out.println(e);
    //}
}
