package Bt2;

public class Ca extends ConVat implements BoiAble {

    public Ca(String name){
        super(name);
    }

    @Override
    public void boi() {
        System.out.println("Tôi đang bơi");
    }


}
