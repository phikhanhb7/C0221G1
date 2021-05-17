package Models;

public abstract class Services {
    private String nameServices ;
    private double areaUsed;
    private double cost ;
    private int amountOfPeople ;
    private String typeOfRent;

    public Services() {
    }

    public Services(String nameServices, double areaUsed, double cost, int amountOfPeople, String typeOfRent) {
        this.nameServices = nameServices;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.amountOfPeople = amountOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public abstract String showInfor();
}
