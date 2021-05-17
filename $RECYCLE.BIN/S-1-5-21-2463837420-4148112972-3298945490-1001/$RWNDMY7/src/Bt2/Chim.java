package Bt2;

public class Chim extends ConVat implements BayAble ,ChayAble {
    public Chim(String name) {
        super(name);
    }

    @Override
    public void bay() {
        System.out.println("Tôi đang bay");
    }

    @Override
    public void chay() {
        System.out.println("Tôi đang chạy");

    }
}
