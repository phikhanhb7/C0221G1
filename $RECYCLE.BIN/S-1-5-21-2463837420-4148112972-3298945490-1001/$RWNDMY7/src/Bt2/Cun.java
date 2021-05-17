package Bt2;

public class Cun extends ConVat implements ChayAble,BoiAble{

    public Cun(String name) {
        super(name);
    }

    @Override
    public void boi() {
        System.out.println("Tôi đang bơi");
    }

    @Override
    public void chay() {
        System.out.println("Tôi đang chạy");
    }
}
