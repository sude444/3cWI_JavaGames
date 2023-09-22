package at.bsu.games.plane;

public class Hangar {

   private float width;
   private float height;
   private String color;
   private Plane plane;

    public Hangar(float width, float height, String color, Plane plane) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.plane = plane;
    }

    public void removePlane(){
        System.out.println("The plane being removed.");
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
