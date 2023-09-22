package at.bsu.games.plane;

public class CargoPlane extends Plane{

    public CargoPlane(String color, float width, float height, int toilet, int windows, int wheels, float weight, Engine engine) {
        super(color, width, height, toilet, windows, wheels, weight, engine);
    }

    public void land(){
        System.out.println("The Cargoplane is landing.");
    }
}
