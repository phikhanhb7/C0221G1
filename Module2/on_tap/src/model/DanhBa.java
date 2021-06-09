package model;

public class DanhBa {
    //- Số điện thoại.
    //- Nhóm của danh bạ.
    //- Họ tên.
    //- Giới tính.
    //- Địa chỉ
    //- Ngày sinh.
    //- Email.
    protected String numberPhone ;
    protected  String groupList ;
    protected String name ;
    protected String gender ;
    protected String adress ;
    protected String birthday ;
    protected String email ;

    public DanhBa(String numberPhone, String groupList, String name, String gender, String adress, String birthday, String email) {
        this.numberPhone = numberPhone;
        this.groupList = groupList;
        this.name = name;
        this.gender = gender;
        this.adress = adress;
        this.birthday = birthday;
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getGroupList() {
        return groupList;
    }

    public void setGroupList(String groupList) {
        this.groupList = groupList;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "numberPhone='" + numberPhone + '\'' +
                ", groupList='" + groupList + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", adress='" + adress + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String styleFile(){
        return  numberPhone +
                "," + groupList +
                "," + name +
                "," + gender +
                "," + adress +
                "," + birthday +
                "," + email;
    }
}
