import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlasticCup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlasticCup extends Actor
{
    public PlasticCup()
    {
        GreenfootImage image = getImage();
        image.scale(80, 80);
        image.mirrorVertically();
    }
    /**
     * Act - do whatever the PlasticCup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      if(Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                int x = mouse.getX();
                int y = mouse.getY();
                System.out.println(x + " "  + y);

            }
            getWorld().removeObject(this);
        }
    }    
}
