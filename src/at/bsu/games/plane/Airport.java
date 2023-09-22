package at.bsu.games.plane;

public class Airport {
    private float area;
    private String land;
    private String City;


    public Airport(float area, String land, String city) {
        this.area = area;
        this.land = land;
        City = city;
    }

    public void giveSignal(){
        System.out.println("S I G N A L");
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
