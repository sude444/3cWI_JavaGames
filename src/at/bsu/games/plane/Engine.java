package at.bsu.games.plane;

public class Engine {
    private String fueltype;
    private float currentFuel;
    private float power;

    //Constructor
    public Engine(String fueltype, float currentFuel, float power) {
        this.fueltype = fueltype;
        this.currentFuel = currentFuel;
        this.power = power;
    }

    //Funktionen
    public void start(){
        System.out.println("The engine is starting.");
    }

    public void stop(){
        System.out.println("The engine is stopping.");
    }


    //Getter and Setter
    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public float getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(float currentFuel) {
        this.currentFuel = currentFuel;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }
}
