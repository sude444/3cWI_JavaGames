package at.bsu.games.plane;

public class Main {
    public static void main(String[] args){
        Engine e1 = new Engine("Disel", 50,50);
        Engine e2 = new Engine("JetFuel", 100, 100);
        Plane p1 = new Plane("White",80, 50, 3, 40, 3, 3000,e1);
        CargoPlane c1 = new CargoPlane("Pink", 2000,4000,2,50,4,12345,e2);
        Hangar h1 = new Hangar(123,123,"Purple",p1);
        Airport a1 = new Airport(12345678,"Türkiye", "Antalya");
        PassangerPlane pp1 = new PassangerPlane("green",12345,12345,4,1234,3,1234,5000,e1);
    }
}
