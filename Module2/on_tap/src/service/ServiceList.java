package service;

import common.WriteAndReadToFile;
import controller.ControlerDanhBa;
import model.DanhBa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceList {
    static List<DanhBa> danhBaList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void WriteToFile() {
        WriteAndReadToFile.ghiFile("danhba.csv", danhBaList, false);
        System.out.println("Đã ghi file thanh công");
    }

    public static void readtoFile() {
        danhBaList = WriteAndReadToFile.readFile("danhba.csv");
        for (DanhBa item : danhBaList) {
            System.out.println(item.toString());
        }

    }

    public static void searchList() {
        String number;
        boolean check = false;
        while (true) {
            System.out.println("Nhập số điện thoại muốn tìm ");
            number = scanner.nextLine();
            for (DanhBa item : danhBaList) {
                if (number.equals(item.getNumberPhone())) {
                    System.out.println(item.toString());
                    check = true;
                    break;
                }
            }
            if (check) {
                break;
            } else {
                System.err.println("Không tìm thấy bạn ơi ");
            }
        }
    }

    public static void deleteList() {
        String number;
        boolean check = false;
        String choose;
        while (true) {
            System.out.println("Nhập số điện thoại muốn xóa ");
            number = scanner.nextLine();
            for (int i = 0; i < danhBaList.size(); i++) {
                if (number.equals(danhBaList.get(i).getNumberPhone())) {
                    System.out.println("Đã tìm thấy , Bạn cóm uốn xóa không " +
                            "1. Có " +
                            "2. Không ");
                    choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            danhBaList.remove(danhBaList.get(i));
                            System.out.println("Đã xóa thành công");
                            check = true;
                            break;
                        case "2":
                            ControlerDanhBa.displayMenu();
                    }
                }
            }


            if (check) {
                break;
            } else {
                System.err.println("Không tìm thấy số điệnt hoại này");
            }
        }
    }

    public static void editList() {
        String number;
        boolean check = false;
        while (true) {
            System.out.println("Nhập số điên thoại muốn sữa :");
            number = scanner.nextLine();
            for (int i = 0; i < danhBaList.size(); i++) {
                if (number.equals(danhBaList.get(i).getNumberPhone())) {
                    danhBaList.get(i).setGroupList(ServiceAdd.addGroupList());
                    danhBaList.get(i).setName(ServiceAdd.addName());
                    danhBaList.get(i).setGender(ServiceAdd.addGender());
                    danhBaList.get(i).setAdress(ServiceAdd.addAddress());
                    danhBaList.get(i).setBirthday(ServiceAdd.addBirthDay());
                    danhBaList.get(i).setEmail(ServiceAdd.addEmail());
                    System.out.println("Cập nhật thành công");
                    check = true;
                    break;
                }
            }
            if (check) {
                break;
            } else {
                System.err.println("Không tìm thấy");
            }
        }
    }

    public static void addList() {
        // numberPhone +
        //                "," + groupList +
        //                "," + name +
        //                "," + gender +
        //                "," + adress +
        //                "," + birthday +
        //                "," + email;

        String numberPhone = ServiceAdd.addNumberPhone();
        String groupList = ServiceAdd.addGroupList();
        String name = ServiceAdd.addName();
        String gender = ServiceAdd.addGender();
        String adress = ServiceAdd.addAddress();
        String birthday = ServiceAdd.addBirthDay();
        String email = ServiceAdd.addEmail();

        DanhBa danhBa = new DanhBa(numberPhone, groupList, name, gender, adress, birthday, email);
        danhBaList.add(danhBa);
    }

    public static void showList() {
        for (DanhBa item : danhBaList) {
            System.out.println(item.toString());
        }
    }
}
