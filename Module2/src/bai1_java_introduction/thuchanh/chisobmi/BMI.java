package bai1_java_introduction.thuchanh.chisobmi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cân nặng của bạn : ");
        float weight = scanner.nextFloat();
        System.out.print("Nhập chiều cao của bạn : ");
        float height = scanner.nextFloat();
        float bmi = weight/(height*height);
        if (bmi<18){
            System.out.print("Chỉ số BMI của bạn là "+bmi + " Và bạn Underweight");
        }else if (bmi<25){
            System.out.print("Chỉ số BMI của bạn là "+bmi + "Và bạn Normal");
        }else if (bmi<30){
            System.out.print("Chỉ số BMI của bạn là "+bmi + "Và bạn Overweight");
        }else {
            System.out.print("Chỉ số BMI của bạn là "+bmi + "Và bạn ObeseObese");
        }
    }
}
