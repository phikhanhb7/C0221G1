package luyen_tap_oop;

import java.util.Scanner;

public abstract class Animal {
    private String name;
    private int age ;
    private String description ;

    public Animal() {
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String display() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
    public void inPut(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên của loài vật ");
        name = input.nextLine();
        System.out.println("Nhập độ tuổi");
        age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập mô tả");
        description = input.nextLine();

    }

    public abstract void showSound();
}
