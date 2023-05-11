package at.bsu.games.shapes;

import at.bsu.games.shapes.Rectangle;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends BasicGame{

    public Main(String title)
    {
        super(title);
    }

    private List<Rectangle> rectangleList;

    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        {
            new Rectangle(200, 300, 200, 500, 500);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    graphics.drawRect(200,400,300,200);
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("main"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}