package luyen_tap_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {
    private int roomNumber;
    private String roomName ;

    public Room() {
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    List<Animal> animalList = new ArrayList<>();

    public void add(Animal animal) {
        animalList.add(animal);

    }

    public void remove(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap  ten dong vat can xoa : ");
        name = scanner.nextLine();
        for (Animal item : animalList) {

            if (name.equals(item.getName())) {
                animalList.remove(item);
            } else {
                System.out.println("Xin lổi không có động vật đó ");
            }

        }
    }

    public void display() {
        System.out.println( "Room{" +
                "roomNumber=" + roomNumber +
                ", animalList=" + animalList +
                '}');
    }

    public void inPut() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên chuồng");
        roomName = input.nextLine();
        System.out.println("Nhập mã chuồng muốn ");
        roomNumber = Integer.parseInt(input.nextLine());
    }

    public static Animal addAnimal() {
        System.out.println("Chọn động vật muốn khởi tạo");
        System.out.println("1. Tiger " + " \n" + "2. Dog" + "\n" + "3.Cat" + "\n " + "4. Exit");
        int choose = 0;
        Animal animal = null;
        do {
            switch (choose) {
                case 1:
                    animal = new Tiger();
                    break;
                case 2:
                    animal = new Dog();
                    break;
                case 3:
                    animal = new Cat();
                    break;
                case 4 :
                    System.out.println("Thoát");
                default:
                    System.out.println("Nhập lại nhé ");
            }

        } while (choose != 4);
         animal.inPut();
        return animal;
    }
}
