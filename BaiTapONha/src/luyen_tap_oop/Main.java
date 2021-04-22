package luyen_tap_oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zoo zoo =new Zoo();
        Scanner input = new Scanner(System.in);
        int choose  =0 ;
        do {
            menu();
            switch (choose){
                case 1:
                    Room room = new Room();
                    room.inPut();
                    zoo.addRoom(room);
                    break;
                case 2:
                    System.out.println("Nhập số phòng muốn xóa");
                    int number = Integer.parseInt(input.nextLine());
                    zoo.removeRoom(number);
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }

        }while (choose!= 6);

    }

    static void menu(){
        System.out.println("1. Thêm chuồng\n" +
                "2. Xóa chuồng\n" +
                "3. Thêm con vật\n" +
                "4. Xóa con vật\n" +
                "5.Xem tất cả các con vật\n" +
                "6. Thoát");
    }
}
