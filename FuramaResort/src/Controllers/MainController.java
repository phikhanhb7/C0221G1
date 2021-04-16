package Controllers;

import Models.Services;

import java.util.Scanner;

public class MainController {

    public static void displayMainMenu(){
        System.out.println("1 . Add New Services");
        System.out.println("2 . Show Services");
        System.out.println("3 . Add New Customer");
        System.out.println("4 . Show Information of Customer");
        System.out.println("5 . Add New Booking");
        System.out.println("6 . Show Information of Employee");
        System.out.println("7 . Exit");

        int choose ;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập lựa chọn của bạn");
        choose =Integer.parseInt(scanner.nextLine());

        do {
            switch (choose) {
                case 1 :
                    addNewServies();
                    break;
                case 2 :
                    showServices();
                    break;
                case 3 :
                    addNewCustomer();
                    break;
                case 4 :
                    showInformationCustomers();
                    break;
                case 5 :
                    addNewBooking();
                    break;
                case 6 :
                    showInforEmployee();
                    break;
                case 7 :
                    System.out.println(" Goodbye see you again ");
                default:
                    System.out.println("Vui lòng nhập lại ");
            }
        }while (choose != 7) ;




    }
    public static void addNewServies(){
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
    }
    public static void showServices(){
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
    }
    public static void addNewBooking(){
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n");
    }

    public static void showInforEmployee(){

    }


}
