package interface_abstracts.thuchanh.bai1;

public class Chickend extends Animal implements Edible {

    @Override
    public String makesound() {
        return " Ò Ó O OOOOOOOOOOOOO";
    }

    @Override
    public String howtoeat() {
        return "ăN THÓC ĂN THÓC ";
    }

    @Override
    public String toString() {
        return "kêu " + makesound()+ " \n" +
                "Ăn " + howtoeat() ;
    }
}
