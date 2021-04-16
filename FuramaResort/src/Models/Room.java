package Models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String nameServices, double areaUsed, double cost, int amountOfPeople, String typeOfRent, String preeServices) {
        super(nameServices, areaUsed, cost, amountOfPeople, typeOfRent);
        this.freeServices = preeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String showInfor() {
        return "Room{ nameServices " + super.getNameServices() +
                "areaUsed" + super.getAreaUsed() +
                "cost" + super.getCost() +
                "amountOfPeople" + super.getAmountOfPeople() +
                "typeOfRent" + super.getTypeOfRent() +
                "preeServices='" + freeServices + '\'' +
                '}';
    }
}
