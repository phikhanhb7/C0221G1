package Controllers;

import Commons.FileUntils;
import Models.*;

import java.util.*;

public class MainController extends Customer {
    static Scanner scanner = new Scanner(System.in);
    private static final String VILLA = "villa";
    private static final String HOUSE = "house";
    private static final String ROOM = "room";

    public static void displayMainMenu() {
        System.out.println("1 . Add New Services");
        System.out.println("2 . Show Services");
        System.out.println("3 . Add New Customer");
        System.out.println("4 . Show Information of Customer");
        System.out.println("5 . Add New Booking");
        System.out.println("6 . Show Information of Employee");
        System.out.println("7 . Exit");

        int choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập lựa chọn của bạn");
        choose = Integer.parseInt(scanner.nextLine());

        do {
            switch (choose) {
                case 1:
                    addNewServies();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomers();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInforEmployee();
                    break;
                case 7:
                    System.out.println(" Goodbye see you again ");
                default:
                    System.out.println("Vui lòng nhập lại ");
            }
        } while (choose != 7);


    }

    public static void addNewServies() {
        int choose = 0;
        while (true) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");

            System.out.println(" Please choose servies to add :");


            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    addNewServie(VILLA);
                    break;
                case 2:
                    addNewServie(HOUSE);
                    break;
                case 3:
                    addNewServie(ROOM);
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.out.println("GOOD BYE");
                    System.exit(0);
                default:
                    System.out.println("Please enter again ");

            }

        }
    }

    private static void addNewServie(String fileName) {
        FileUntils.setFullPathFile(fileName);
        System.out.println(" Enter nameServices");
        String nameServices = scanner.nextLine();
        System.out.println("Enter areaUsed");
        String areaUsed = scanner.nextLine();
        System.out.println(" Enter Cost");
        String cost = (scanner.nextLine());
        System.out.println("Enter AmountOfPeople");
        String amountOfPeople = (scanner.nextLine());
        System.out.println("Enter TypeOfRent");
        String typeOfRent = scanner.nextLine();


        if (fileName.equals(VILLA)) {

            System.out.println("Enter standarRoom");
            String standarRoom = scanner.nextLine();
            System.out.println("Enter comfortDescription");
            String comforDescription = scanner.nextLine();
            System.out.println("Enter numberOfFloor");
            String numberOfFloor = scanner.nextLine();
            System.out.println("Enter areaPool");
            String areaPool = scanner.nextLine();

            FileUntils.writeFile(new String[]{nameServices, areaUsed, cost, amountOfPeople, typeOfRent, standarRoom, comforDescription, numberOfFloor, areaPool});

        } else if (fileName.equals(HOUSE)) {

            System.out.println("Enter standarRoom");
            String standarRoom = scanner.nextLine();
            System.out.println("Enter comfortDescription");
            String comforDescription = scanner.nextLine();
            System.out.println("Enter numberOfFloor");
            String numberOfFloor = (scanner.nextLine());

            FileUntils.writeFile(new String[]{nameServices, areaUsed, cost, amountOfPeople, typeOfRent, standarRoom, comforDescription, numberOfFloor});

        } else if (fileName.equals(ROOM)) {

            System.out.println("Enter freeServices");
            String freeServices = scanner.nextLine();

            FileUntils.writeFile(new String[]{nameServices, areaUsed, cost, amountOfPeople, typeOfRent, freeServices});
        }
    }

    public static void showServices() {
        int choose = 0;
        while (true) {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");

            System.out.println("Enter choose showServices :");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showAllServices(VILLA);
                    break;
                case 2:
                    showAllServices(HOUSE);
                    break;
                case 3:
                    showAllServices(ROOM);
                    break;
                case 4:
                    showAllServicesNotDup(VILLA);
                    break;
                case 5:
                    showAllServicesNotDup(HOUSE);
                    break;
                case 6:
                    showAllServicesNotDup(ROOM);
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.out.println("GOOD BYE");
                    System.exit(0);
                    break;

            }
        }
    }

    private static void showAllServicesNotDup(String fileName) {
        Set<String> setOfServices = new TreeSet<>();
        System.out.println("------------------------------------------------------------");
        for (Services services : readAllFile(fileName)){
            setOfServices.add(services.getNameServices());
        }
        for (String name : setOfServices){
            System.out.println(name);
        }
    }

    private static void showAllServices(String fileName) {
        System.out.println("------------------------------------------------------------");
        for (Services services : readAllFile(fileName)){
            services.showInfor();
        }

    }

    public static List<Services> readAllFile(String fileName) {
        FileUntils.setFullPathFile(fileName);
        List<String> propertiesSevices = FileUntils.readFile();
        List<Services> listOfServices = new ArrayList<>();
        String[] propertiesElement;
        Services services = null;
        for (String properties : propertiesSevices) {
            propertiesElement = properties.split(",");
            if (properties.equals(VILLA)) {
                services = new Villa();
                ((Villa) services).setStandarRoom(propertiesElement[5]);
                ((Villa) services).setComfortDescription(propertiesElement[6]);
                ((Villa) services).setNumberOfFloor(Integer.parseInt(propertiesElement[7]));
                ((Villa) services).setAreaPool(Double.parseDouble(propertiesElement[8]));

            } else if (properties.equals(HOUSE)) {
                ((House) services).setStandarRoom(propertiesElement[5]);
                ((House) services).setComfortDescription(propertiesElement[6]);
                ((House) services).setNumberOfFloor(Integer.parseInt(propertiesElement[7]));
            } else if (properties.equals(ROOM)) {
                ((Room) services).setFreeServices(propertiesElement[5]);
            }
            services.setNameServices(propertiesElement[0]);
            services.setAreaUsed(Double.parseDouble(propertiesElement[1]));
            services.setCost(Double.parseDouble(propertiesElement[2]));
            services.setAmountOfPeople(Integer.parseInt(propertiesElement[3]));
            services.setTypeOfRent(propertiesElement[4]);

            listOfServices.add(services);
        }
        return listOfServices;
    }

    public static void addNewBooking() {
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n");
    }

    public static void showInforEmployee() {

    }


}
