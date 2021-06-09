package controller;

import service.ServiceList;

import java.util.Scanner;

public class ControlerDanhBa {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu(){
        String choose ;
        while (true){
            System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ DNAH BẠ ---");
            System.out.println("Chọn chức năng theo số để tiếp tục ");
            System.out.println("1. Xem dnah sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file ");
            System.out.println("7. Ghi vào file ");

            choose = scanner.nextLine();
            switch (choose){
                case "1" :
                    ServiceList.showList();
                    break;
                case "2" :
                    ServiceList.addList();
                    break;
                case "3" :
                    ServiceList.editList();
                    break;
                case "4" :
                    ServiceList.deleteList();
                    break;
                case "5" :
                    ServiceList.searchList();
                    break;
                case "6" :
                    ServiceList.readtoFile();
                    break;
                case "7" :
                    ServiceList.WriteToFile();
                    break;
                default:
                    System.err.println("VUi lòng nhập đúng từ 1 đến 7 ");
            }
        }


    }


}
