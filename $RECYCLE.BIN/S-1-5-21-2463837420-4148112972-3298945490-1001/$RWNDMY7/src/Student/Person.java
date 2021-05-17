package Student;

import java.util.Scanner;

public class Person {
        private int id ;
        private String name ;
        private String gender ;
        private String birthday ;
        private String adresss ;
        public Person(){

        }

        public Person(int id, String name, String gender, String birthday, String adresss) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.birthday = birthday;
            this.adresss = adresss;
        }
        public void inPut(){
            Scanner input = new Scanner(System.in) ;

            System.out.println("Nhập vào id");
            id = Integer.parseInt(input.nextLine());
            System.out.println("Nhập vào tên");
            name = input.nextLine() ;

            System.out.println("Nhập vào giới tính ");
            gender = input.nextLine();

            System.out.println("Nhập vào ngày sinh ");
            birthday = input.nextLine();

            System.out.println("Nhập vào địa chỉ");
            adresss = input.nextLine();

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

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getAdresss() {
            return adresss;
        }

        public void setAdresss(String adresss) {
            this.adresss = adresss;
        }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", adresss='" + adresss + '\'' +
                '}';
    }
}


