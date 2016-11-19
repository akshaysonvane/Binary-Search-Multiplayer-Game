import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Iterator;

public class EndScreen extends World
{
    IPlayerIterator iterPlayer;
    Iterator iterator;

    public EndScreen()
    {    
        super(1100, 600, 1);

        iterPlayer = DataModel.getInstance().getPlayerModel();
        iterator = iterPlayer.createIterator();
        System.out.println(DataModel.getInstance().getPlayerModel());
    }

    public void showPlayers()
    {
        while(iterator.hasNext())
        {
            Player p = (Player) iterator.next();
            System.out.print(p.getName() + " " + p.getScore());
        }
    }
}
