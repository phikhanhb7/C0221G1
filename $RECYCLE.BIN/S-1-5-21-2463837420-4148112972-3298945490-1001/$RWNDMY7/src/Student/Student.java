package Student;

import java.util.Scanner;

public class Student extends Person {
    private String msv ;
    private float pointtb ;
    private String emails ;

    public Student() {
    }
    //lấy kế thừa hàm tostring bên person


    @Override
    public String toString() {
        return "Student{" +
                "msv='" + msv + '\'' +
                ", pointtb=" + pointtb +
                ", emails='" + emails + '\'' +
                super.toString() +
                '}';
    }

    @Override
    public void inPut() {
        super.inPut();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên : ");
        while (true){
            String msvInput = input.nextLine();
            boolean check = setMsv(msvInput);
            if (check){
                break;
            }
        }
// viết gon hơn ; while(!setMsv(input.nextLine()));
        System.out.println("Nhập điểm :  ");
        while (true){
            float pointInput = Float.parseFloat(input.nextLine());
            boolean check = setPointtb(pointInput);
            if (check){
                break;
            }
        }

        System.out.println("Nhập email  :");
        while (true){
            String emailInput = input.nextLine();
            boolean check = setEmails(emailInput);
            if (check){
                break;
            }
        }

    }


    public String getMsv() {
        return msv;
    }
// sữa void = boolean để kiểm tra ở trên
    public boolean setMsv(String msv) {
        if (msv != null && msv.length() == 8  ){
            this.msv = msv;
            return true ;
        }else {
            System.err.println("Nhập lại bạn nhé ! sai rồi ");// err : để hiện đỏ cho đẹp
            return false;
        }

    }

    public float getPointtb() {
        return pointtb;
    }
//sữa lại blooen
    public boolean setPointtb(float pointtb) {
        if (pointtb >= 0 && pointtb <=10){
            this.pointtb = pointtb;
            return true ;
        }else {
            System.err.println("Nhập lại điểm     0 <= point <= 10 ");
            return false ;
        }

    }

    public String getEmails() {
        return emails;
    }

    public boolean setEmails(String emails) {
        if (emails != null && emails.contains("@") && !emails.contains(" ")){
            this.emails = emails;
            return true;
        }else {
            System.err.println("Nhập lại email : ");
            return false ;
        }

    }
    public boolean checkHocBong(){
        if (pointtb >= 8 ) {
            return true ;
        }
        return false ;
    }/// viết ngắn là : return pointtb >= 8 ;
}
