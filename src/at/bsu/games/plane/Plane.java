package at.bsu.games.plane;

import org.newdawn.slick.tests.SoundTest;

public class Plane {

    private String color;
    private float width;
    private float height;
    private int toilet;
    private int windows;
    private int wheels;
    private float weight;

    private Engine engine;




    //Constructor
    public Plane(String color, float width, float height, int toilet, int windows, int wheels, float weight, Engine engine) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.toilet = toilet;
        this.windows = windows;
        this.wheels = wheels;
        this.weight = weight;
        this.engine = engine;
    }



    //Funktionen

    public void drive(){
        System.out.println("The plane is driving.");
    }

    public void takeOff(){
        System.out.println("The plane is taking off.");
    }

    public void land(){
        System.out.println("The plane is landing.");
    }


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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
