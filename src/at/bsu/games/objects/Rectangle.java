package at.bsu.games.objects;

public class Rectangle {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private float x;
    private float y;
    private float speed;

    public Rectangle(int x, int y, float speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    
}
