package manage;

import comoms.DocGhiFile;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewBooking {
    static Scanner scanner = new Scanner(System.in);
    static List<Customers> customersList = new ArrayList<>();
    static List<Service> serviceList = new ArrayList<>();

    public static void addBooking() {
        customersList = DocGhiFile.docFileCustomers("Customers.csv");
        String choose;
        String choose1 ;
        String id ;
        String elementLine = null;
        boolean check = false;
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println((i + 1) + " : " + customersList.get(i).showInfor());
        }

        try{
            System.out.println(" Chon Customers muốn Addbooking");
            choose = scanner.nextLine();
            for (int i = 0; i < customersList.size(); i++) {
                if (i == Integer.parseInt(choose) - 1) {
                    check = true ;
                    elementLine = customersList.get(i).toString();

                    break;
                }else {
                    System.out.println("Nhập đúng số  thứ tự ");
                }
            }
        }catch (NumberFormatException e){
            System.err.println("Vui lòng nhập số");
        }
        if (check){
            System.out.println("1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n");
            System.out.println(" Nhập lựa chọn của bạn ");
            choose1 = scanner.nextLine();
            switch (choose1){
                case "1":
                    serviceList = DocGhiFile.docFile("Services.csv");
                    for (Service service : serviceList){
                        if (service instanceof Villa){
                            System.out.println(service.showInfor());
                        }
                        System.out.println("Nhập ID Villa muốn add");
                        id = scanner.nextLine();
                        if (id.equals(service.getId())){
                            elementLine = elementLine + "," + service ;
                            DocGhiFile.ghiFileString("Booking.csv",elementLine,true);
                            break;
                        }

                    }
                     break;
                case "2":
                    serviceList = DocGhiFile.docFile("Services.csv");
                    for (Service service : serviceList){
                        if (service instanceof House){
                            System.out.println(service.showInfor());
                        }
                        System.out.println("Nhập ID House muốn add");
                        id = scanner.nextLine();
                        if (id.equals(service.getId())){
                            elementLine = elementLine + "," + service ;
                            DocGhiFile.ghiFileString("Booking.csv",elementLine,true);
                        }

                    }
                    break;

                case "3":
                    serviceList = DocGhiFile.docFile("Services.csv");
                    for (Service service : serviceList){
                        if (service instanceof Room){
                            System.out.println(service.showInfor());
                        }
                        System.out.println("Nhập ID Room muốn add");
                        id = scanner.nextLine();
                        if (id.equals(service.getId())){
                            elementLine = elementLine + "," + service ;
                            DocGhiFile.ghiFileString("Booking.csv",elementLine,true);
                        }

                    }
                    break;

            }
        }
    }

}
