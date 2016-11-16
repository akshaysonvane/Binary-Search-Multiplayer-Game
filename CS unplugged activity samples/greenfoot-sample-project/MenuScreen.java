import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{

    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {    
        super(1100, 600, 1);
        
        GreenfootImage image = getBackground();
        image.scale(1100, 600);
        
        prepare();
    }
    
    void prepare()
    {

        PlayGame playgame = new PlayGame();
        addObject(playgame,532,379);
        Instructions instructions = new Instructions();
        addObject(instructions,537,457);
        Credits credits = new Credits();
        addObject(credits,535,531);
        EnterName entername = new EnterName();
        addObject(entername,539,337);
        playgame.setLocation(537,399);
        instructions.setLocation(538,469);
        playgame.setLocation(536,403);
        entername.setLocation(532,337);
        entername.setLocation(533,337);
    }
}
