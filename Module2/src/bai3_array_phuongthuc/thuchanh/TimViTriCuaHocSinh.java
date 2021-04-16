package bai3_array_phuongthuc.thuchanh;

import java.util.Scanner;

public class TimViTriCuaHocSinh {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter name want look");
        String inputname = input.nextLine();
        boolean check = false ;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputname)) {
                System.out.println("Position of the students in the list " + inputname + " is: " + (i + 1));
                check = true ;
                break;
            }
            }
        if (check==false){
            System.out.println("Not found" + inputname + " in the list.");
        }


    }
}
