package Models;

public class Villa extends Services {
    private String standarRoom;
    private String comfortDescription;
    private int numberOfFloor;
    private double areaPool ;

    public Villa(){}

    public Villa(String standarRoom, String comfortDescription, int numberOfFloor, double areaPool) {
        this.standarRoom = standarRoom;
        this.comfortDescription = comfortDescription;
        this.numberOfFloor = numberOfFloor;
        this.areaPool = areaPool;
    }

    public Villa(String nameServices, double areaUsed, double cost, int amountOfPeople, String typeOfRent, String standarRoom, String comfortDescription, int numberOfFloor, double areaPool) {
        super(nameServices, areaUsed, cost, amountOfPeople, typeOfRent);
        this.standarRoom = standarRoom;
        this.comfortDescription = comfortDescription;
        this.numberOfFloor = numberOfFloor;
        this.areaPool = areaPool;
    }

    public String getStandarRoom() {
        return standarRoom;
    }

    public void setStandarRoom(String standarRoom) {
        this.standarRoom = standarRoom;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String showInfor() {
        return "Villa{" +
                "standarRoom='" + standarRoom + '\'' +
                ", comfortDescription='" + comfortDescription + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                ", areaPool=" + areaPool +
                '}';
    }
}
