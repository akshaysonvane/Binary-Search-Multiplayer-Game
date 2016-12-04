import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Reset extends Actor
{
    GreenfootImage image;
    private boolean hover;

    public Reset()
    {
        hover = false;
        image = getImage();
        image.scale(50, 50);
    }

    public void act() 
    {   
        if(Greenfoot.mouseMoved(null))
        {
            hover = Greenfoot.mouseMoved(this);
        }
        if(hover)
        {
            image.scale(80, 80);
        }
        else
        {
            image.scale(50, 50);
        }

        if(Greenfoot.mouseClicked(this))
        {

            //resetting all previous data
            ResetData.getInstance().reset();
        }
    }
}
