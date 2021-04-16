package Models;

public class House extends Services {
    private String standarRoom;
    private String comfortDescription;
    private int numberOfFloor;

    public House(String standarRoom, String comfortDescription, int numberOfFloor) {
        this.standarRoom = standarRoom;
        this.comfortDescription = comfortDescription;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String nameServices, double areaUsed, double cost, int amountOfPeople, String typeOfRent, String standarRoom, String comfortDescription, int numberOfFloor) {
        super(nameServices, areaUsed, cost, amountOfPeople, typeOfRent);
        this.standarRoom = standarRoom;
        this.comfortDescription = comfortDescription;
        this.numberOfFloor = numberOfFloor;
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


    @Override
    public String showInfor() {
        return "House{ nameServices " + super.getNameServices() +
                "areaUsed" + super.getAreaUsed() +
                "cost" + super.getCost() +
                "amountOfPeople" + super.getAmountOfPeople() +
                "typeOfRent" + super.getTypeOfRent() +
                "standarRoom='" + standarRoom + '\'' +
                ", comfortDescription='" + comfortDescription + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}

