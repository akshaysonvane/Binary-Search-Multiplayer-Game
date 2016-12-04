import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Guessed extends World
{
    IPlayerIterator iterPlayer;
    Iterator iterator;

    public Guessed()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        GreenfootImage image = getBackground();
        image.scale(1100, 600);

        showScore();
    }

    public void showScore()
    {
        iterPlayer = DataModel.getInstance().getPlayerModel();
        iterator = iterPlayer.createIterator();

        while(iterator.hasNext())
        {
            Player p = (Player) iterator.next();
            if(DataModel.getInstance().getUserId().equals(p.getName()))
            {
                addObject(new Lbl(" Round "+p.getRound() + " \n Score: " + (p.getScore() + 1) + " ", 30), 550, 380);
                break;
            }
        }
    }
}
