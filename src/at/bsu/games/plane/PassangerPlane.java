package at.bsu.games.plane;

public class PassangerPlane extends Plane{


private int passenger;

    public PassangerPlane(String color, float width, float height, int toilet, int windows, int wheels, float weight, int passenger, Engine engine) {
        super(color, width, height, toilet, windows, wheels, weight, engine);
        this.passenger = passenger;
    }


    public void passenger(int person){
        System.out.println("There are this many passangers: " + passenger);
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
}
