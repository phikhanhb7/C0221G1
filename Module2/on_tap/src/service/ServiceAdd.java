package service;

import common.ExceptionList;

import java.util.Scanner;

public class ServiceAdd {
    static Scanner scanner = new Scanner(System.in);
    //- Số điện thoại.
    //- Nhóm của danh bạ.
    //- Họ tên.
    //- Giới tính.
    //- Địa chỉ
    //- Ngày sinh.
    //- Email.

    public static String addNumberPhone(){

        String numberPhone ;
        while (true){
            try{
                System.out.println("Nhập số điện thoại : ");
                numberPhone = scanner.nextLine();
                ExceptionList.checkNumberPhone(numberPhone);
                return numberPhone ;
            }catch (ExceptionList e){
                System.err.println(e.getMessage());
            }

        }
    }
    public static String addGroupList(){
        System.out.println("Nhập nhóm danh bạ :");
        String groupList = scanner.nextLine() ;
        return groupList;
    }

    public static String addName(){
        System.out.println("Nhập họ tên : ");
        String name = scanner.nextLine();
        return name ;
    }

    public static String addGender(){
        System.out.println("Nhập giới tính :");
        String gender = scanner.nextLine();
        return gender;
    }

    public static String addAddress(){
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        return address ;
    }

    public static String addBirthDay(){
        System.out.println("Nhập ngày sinh");
        String birthday = scanner.nextLine();
        return birthday;
    }

    public static String addEmail(){
        String email ;
        while (true){
            try{
                System.out.println("Nhập Email :");
                email = scanner.nextLine();
                ExceptionList.checkEmail(email);
                return email ;
            }catch (ExceptionList e){
                System.err.println(e.getMessage());
            }
        }

    }
}
