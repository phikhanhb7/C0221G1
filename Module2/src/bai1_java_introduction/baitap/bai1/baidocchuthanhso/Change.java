package bai1_java_introduction.baitap.bai1.baidocchuthanhso;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc : ");
        int number = Integer.parseInt(scanner.nextLine());
        int numberInput = number;
        String[] arrayLessNum20 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arrayMoreNum20 = {"twenty", "thirty", "forty", "fifty", "sixties", "seventies", "eighty", "ninety"};
        String strNum = "";
        if (number < 20) {
            strNum = arrayLessNum20[number];
        } else {
            if (number < 100) {
                strNum += arrayMoreNum20[number / 10 - 2];
                strNum += " " + arrayLessNum20[number % 10];
            } else {
                strNum += arrayLessNum20[number / 100] + " hundred ";
                if (number % 100  > 20) {
                    strNum += arrayMoreNum20[(number % 100) / 10 - 2];
                    strNum += " " + arrayLessNum20[number % 10];
                } else {
                    strNum += arrayLessNum20[number % 100];
                }
            }
        }
        System.out.println(numberInput + " read : " + strNum);
    }
}