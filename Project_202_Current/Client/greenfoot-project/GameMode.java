import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameMode extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(Utils.getInstance().getGameHost())
            {
                Utils.getInstance().setGameHost(false);
                this.setImage("button_connect-mode.png");
            }
            else
            {
                Utils.getInstance().setGameHost(true);
                this.setImage("button_host-mode.png");
            }
        }
    }    
}
