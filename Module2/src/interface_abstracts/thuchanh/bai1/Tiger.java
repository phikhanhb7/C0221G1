package interface_abstracts.thuchanh.bai1;

public class Tiger extends Animal implements Edible{

    @Override
    public String makesound() {
        return "Tiger gu ' ' ' ' '' ' ' ";
    }

    @Override
    public String howtoeat() {
        return " Xé Nhai Nhai Nhai";
    }

    @Override
    public String toString() {
        return "kêu " + makesound()+ " \n" +
                "Ăn " + howtoeat() ;
    }
}
