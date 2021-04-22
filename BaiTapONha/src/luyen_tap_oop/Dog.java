package luyen_tap_oop;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age, String description) {
        super(name, age, description);
    }

    @Override
    public void showSound() {
        System.out.println("Gâu ....Gâu ...Gâu ..");
    }
}
