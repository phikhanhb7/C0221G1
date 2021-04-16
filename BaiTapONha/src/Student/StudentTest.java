package Student;

import java.util.*;

public class StudentTest  {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            ShowMenu();
            System.out.println("Chọn");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    int n;
                    System.out.println("Nhập số sinh viên cần thêm");
                    n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inPut();

                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (Student iteam : studentList) {
                        System.out.println(iteam + ",");
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex = 0;
                    float minDtb = studentList.get(0).getPointtb();
                    float maxDtb = studentList.get(0).getPointtb();

                    for (int i = 1; i < studentList.size(); i++) {
                        if (studentList.get(i).getPointtb() < minDtb) {
                            minDtb = studentList.get(i).getPointtb();
                            minIndex = i;
                        }
                        if (studentList.get(i).getPointtb() > maxDtb) {
                            maxDtb = studentList.get(i).getPointtb();
                            maxIndex = i;
                        }
                        System.out.println("Sinh viên có điểm trung bình cao nhất ");
                        studentList.get(maxIndex).toString();
                        System.out.println("Sinh viên có điểm trung bình thấp nhất ");
                        studentList.get(minIndex).toString();

//                        System.out.println("Giá trị lớn nhất là " + maxDtb + " vị trí thứ " + maxIndex);
//                        System.out.println("Giá trị nhỏ nhất là " + minDtb + " vị trí thứ " + minDtb);

                    }
                    break;
                case 4:
                    String timKiem = scanner.nextLine();
                    int count = 0 ;
                    for ( Student item : studentList){
                        if (item.equals(timKiem)){
                            item.toString();
                            count++ ;
                        }
                        // nếu count không có tức tìm không thấy , con in ra có item.inPut
                    }if (count == 0 ){
                    System.out.println("Không tìm thấy ");
                }


                    break;
                case 5:
                 Collections.sort(studentList , new ComparatorName());
                 for (int i =0 ; i < studentList.size();i++){
                     studentList.get(i).toString();
                 }
                    break;
                case 6:
                    Collections.sort(studentList , new ComparatorPoint());
                    for (int i =0 ; i < studentList.size() ; i ++){
                       if (studentList.get(i).checkHocBong()){
                           studentList.get(i).toString();
                           //check học bổng
                       }

                    }
                    break;
                case 7:
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("Nhập sai rồi :)) ");
            }

        } while (choose != 7);
    }

    static void ShowMenu() {
        System.out.println("1. Nhập vào N sinh viên");
        System.out.println("2. Hiển thị thông tin sinh viên");
        System.out.println("3. Hiển thị min max theo điểm trung bình");
        System.out.println("4. Tìm kiếm theo mã sinh viên");
        System.out.println("5. Sắp xếp theo Tên và hiển thị");
        System.out.println("6. Hiển thị sinh viên được học bổng và sort theo tứ tự");
        System.out.println("7. Thoát ");
    }
}
