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
        addObject(credits,535,570);
        GameMode gameMode = new GameMode();
        addObject(gameMode,539,337);
        playgame.setLocation(537,399);
        instructions.setLocation(538,510);
        playgame.setLocation(536,450);
        gameMode.setLocation(533,390);

        StatusDisp status= new StatusDisp();
        addObject(status,533,330);
        status.setLocation(533,330);
        String text="To display status";
        addObject(new Label_2(text),533,330);
    }
}
