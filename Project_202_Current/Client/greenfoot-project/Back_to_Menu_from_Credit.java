import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back_to_Menu_from_Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back_to_Menu_from_Credit extends Actor
{
    /**
     * Act - do whatever the Back_to_Menu_from_Credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            //Greenfoot.playSound("Fuzzy_Beep.wav");
            Greenfoot.setWorld(new MenuScreen());
        }
    }    
}
