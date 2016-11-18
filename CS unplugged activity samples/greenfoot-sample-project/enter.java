import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enter extends Actor
{
    /**
     * Act - do whatever the enter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean hover =false;
    
    public void act() 
    {
       
        if(Greenfoot.mouseMoved(null))
        hover = Greenfoot.mouseMoved(this);
        if(hover)
        {
            setImage("button_entername-hover.png"); 
           // Greenfoot.playSound("Tiny_Button.wav");
        }
        else
        setImage("button_entername.png");
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Fuzzy_Beep.wav");
            
        }
    }    
}
