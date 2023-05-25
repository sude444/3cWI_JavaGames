package at.bsu.games.shapes;

import org.newdawn.slick.*;

public class Shapes extends BasicGame{

    private Rectangle r1 = new Rectangle(150,150,10,100,100);
    private Oval o1 = new Oval(500,0,30,200,100);
    private Circle c1 = new Circle(0,0,25,100,100);

    public Shapes(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        r1.Rectupdate(i);
        o1.Ovupdate(i);
        c1.Ciupdate(i);
        System.out.println(i);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(r1.getX(),r1.getY(),r1.getWidth(),r1.getLength());
        graphics.drawOval(o1.getX(),o1.getY(),o1.getWidth(),o1.getLength());
        graphics.drawOval(c1.getX(),c1.getY(),c1.getWidth(),c1.getLength());
    }
}