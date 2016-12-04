import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back_to_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackMenu extends Actor
{
    /**
     * Act - do whatever the Back_to_Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private boolean hover=false;
     
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseMoved(null))
            hover = Greenfoot.mouseMoved(this);
        if(hover){
            this.setImage("back1-hover.png");
        }
        else
            this.setImage("back1.png");
        
        if(Greenfoot.mouseClicked(this))
        {
            //Greenfoot.playSound("Fuzzy_Beep.wav");
            Greenfoot.setWorld(new MenuScreen());
        }
    }    
}
