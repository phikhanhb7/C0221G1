package luyen_tap_oop;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, String description) {
        super(name, age, description);
    }

    @Override
    public void showSound() {
        System.out.println("Meo ...Meo...Meo");
    }
}
