package Models;

public class Villa extends House {
    private double areaPool ;

    public Villa(String standarRoom, String comfortDescription, int numberOfFloor) {
        super(standarRoom, comfortDescription, numberOfFloor);
    }

    public Villa(String nameServices, double areaUsed, double cost, int amountOfPeople, String typeOfRent, String standarRoom, String comfortDescription, int numberOfFloor) {
        super(nameServices, areaUsed, cost, amountOfPeople, typeOfRent, standarRoom, comfortDescription, numberOfFloor);
        this.areaPool = areaPool ;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String toString() {
        return "Villa{" + super.showInfor() +
                "areaPool=" + areaPool +
                '}';
    }
}
