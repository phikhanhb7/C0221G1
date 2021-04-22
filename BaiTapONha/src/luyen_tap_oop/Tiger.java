package luyen_tap_oop;

public class Tiger extends Animal {
    public Tiger() {
    }

    public Tiger(String name, int age, String description) {
        super(name, age, description);
    }

    @Override
    public void showSound() {
        System.out.println("Gừ ....Gừ ... Gừ ...");
    }
}
