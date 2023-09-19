package at.bsu.games.plane;

public class Plane {

    private String color;
    private float width;
    private float height;
    private int toilet;
    private int windows;
    private int wheels;
    private float weight;

    //Constructor
    public Plane(String color, float width, float height, int toilet, int windows, int wheels, float weight) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.toilet = toilet;
        this.windows = windows;
        this.wheels = wheels;
        this.weight = weight;
    }

    //Funktionen



    //Getter and Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getToilet() {
        return toilet;
    }

    public void setToilet(int toilet) {
        this.toilet = toilet;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
