package bai17_binaryfile.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student<E> implements Serializable {
    private int id ;
    private String name ;
    private String adress ;

    public Student(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }



    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Nam", " Đà Nẵng"));
        studentList.add(new Student(2,"Nam2", " Sài gòn"));
        studentList.add(new Student(3,"Nam2", " Mỹ tho "));
        studentList.add(new Student(4,"Nam3", " Hà Lội"));
        WriteFile<Student> writeFile = new WriteFile<>();
     writeFile.   writeToFile("D:\\Module2\\src\\bai17_binaryfile\\thuchanh\\test.csv" , studentList);
        System.out.println(writeFile. readFromFile("D:\\Module2\\src\\bai17_binaryfile\\thuchanh\\test.csv", studentList));

    }



}
