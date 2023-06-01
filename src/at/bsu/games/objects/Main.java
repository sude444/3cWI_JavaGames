package at.bsu.games.objects;

import at.bsu.games.firstgame.Rectangles;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends BasicGame {


    public Main(String title) {
        super(title);
    }

    private List<Rectangle> rectangleList;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.rectangleList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            Rectangle rectangle = new Rectangle(random.nextInt(800), random.nextInt(600), random.nextInt(150), random.nextInt(150), random.nextInt(20));
            rectangleList.add(rectangle);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }
}