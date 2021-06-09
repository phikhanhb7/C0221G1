package manage;

import comoms.DocGhiFile;
import controllers.MainController;
import models.CinemaTicket;
import models.Customers;

import java.util.*;

public class Cinema4D {
    static Scanner scanner = new Scanner(System.in);
    static List<Customers> listCustomer = new ArrayList();
    static Queue<String> queue = new ArrayDeque<>();
    static List<CinemaTicket> cinemaTicketList = new ArrayList();

    public static void addCinemaTicket() {
        CinemaTicket cinemaTicket1 = new CinemaTicket("1", "Lật mặt");
        cinemaTicketList.add(cinemaTicket1);
        CinemaTicket cinemaTicket2 = new CinemaTicket("2", "Game Of Thron");
        cinemaTicketList.add(cinemaTicket2);
        CinemaTicket cinemaTicket3 = new CinemaTicket("3", "Kẻ Cắp Mặt Trăng");
        cinemaTicketList.add(cinemaTicket3);
        CinemaTicket cinemaTicket4 = new CinemaTicket("4", "Trường Học Bá Vương");
        cinemaTicketList.add(cinemaTicket4);
        CinemaTicket cinemaTicket5 = new CinemaTicket("5", "Phim vạn giới tiên tung");
        cinemaTicketList.add(cinemaTicket5);
        CinemaTicket cinemaTicket6 = new CinemaTicket("6", "BA chú heo con ");
        cinemaTicketList.add(cinemaTicket6);
        CinemaTicket cinemaTicket7 = new CinemaTicket("7", "Đấu la đại lục");
        cinemaTicketList.add(cinemaTicket7);
        CinemaTicket cinemaTicket8 = new CinemaTicket("8", "Đấu phá thương Khung");
        cinemaTicketList.add(cinemaTicket8);
        CinemaTicket cinemaTicket9 = new CinemaTicket("9", "Vũ Canh kỹ");
        cinemaTicketList.add(cinemaTicket9);
        CinemaTicket cinemaTicket10 = new CinemaTicket("10", "Snows Flower");
        cinemaTicketList.add(cinemaTicket10);
        DocGhiFile.ghiFileCinema("cinema.csv", cinemaTicketList, true);
        cinema4D();
    }

    public static void cinema4D() {
        System.out.println("Chào mừng quý khách đã đến rạp chiều phim của Furama!!! \n" +
                "Số vé xem phim hôm nay là 10 vé!");
        int number = 10;
        String line = null;
        boolean check = true;
        for (int i = 0; i < cinemaTicketList.size(); i++) {
            line = cinemaTicketList.get(i).toString();
            check = true;
            if (check) {
                if (queue.size() != number) {
                    System.out.println("Bạn là khách hàng nào: \n" +
                            "1. Khách hàng đang thuê dịch vụ trong Furama \n" +
                            "2. Khách hàng bên ngoài");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            listCustomer = DocGhiFile.docFileCustomers("Customers.csv");
                            System.out.println("Tên của quý khách là gì?");
                            String nameCustomer = scanner.nextLine();
                            for (Customers customer : listCustomer) {
                                if (nameCustomer.equals(customer.getHoTen())) {
                                    line = customer.getHoTen() + "," + line;
                                    queue.add(line);
                                    System.out.println("Bạn đã mua được vé xem phim! Số vé còn lại là: " + (number - queue.size()));
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Tên của quý khách là gì?");
                            String nameCustomer1 = scanner.nextLine();
                            line = nameCustomer1 + "," + line;
                            queue.add(line);
                            System.out.println("Bạn đã mua được vé xem phim! Số vé còn lại là: " + (number - queue.size()));
                            break;
                        default:
                            System.out.println("Vui lòng chọn 1 hoặc 2!!!");
                    }
                }
            }
        }
        if ((queue.size() == number)) {
            System.out.println("Vé hôm nay đã được bán hết!!! Cảm ơn quý khách!");
        }
        System.out.println("Danh sách khách hàng đã mua vé hôm nay: ");
        int seats = 1;
        for (String string : queue) {
            System.out.println("Khách hàng " + string + " có số ghế ngồi là " + seats++);
        }
        MainController.displayMenu();
    }
}
