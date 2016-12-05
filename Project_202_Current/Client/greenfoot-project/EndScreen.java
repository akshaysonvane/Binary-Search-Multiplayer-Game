import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Iterator;
import java.util.ArrayList;
public class EndScreen extends World
{
    IPlayerIterator iterPlayer;
    Iterator iterator;

    public EndScreen()
    {    
        
        super(1100, 600, 1);
        GreenfootImage image = getBackground();
        image.scale(1100, 600);  
        
        iterPlayer = DataModel.getInstance().getPlayerModel();
        iterator = iterPlayer.createIterator();
        System.out.println(DataModel.getInstance().getPlayerModel());

        prepare();
    }

    public void showPlayers()
    {
        while(iterator.hasNext())
        {
            Player p = (Player) iterator.next();
            System.out.print(p.getName() + " " + p.getScore()+"\n");
        }
    }

    public void prepare(){
        int x=550;
        int y=30;

        while(iterator.hasNext())
        {
            
            Player p = (Player) iterator.next();
            addObject(new Final_Score(),x,y);
            addObject(new Label("   "+p.getName()+"  :  "+p.getScore()+"   "),x, y);
            y=y+60;
        }
    }
}
