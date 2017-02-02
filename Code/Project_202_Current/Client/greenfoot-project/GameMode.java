import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameMode extends Actor
{
    private boolean hover=false;
    private String current="button_connect-mode";
    
    public void act() 
    {
        
         if(Greenfoot.mouseMoved(null))
            hover = Greenfoot.mouseMoved(this);
        if(hover){
            this.setImage(""+current+"-hover.png");
        }
        else
            this.setImage(""+current+".png");
            
        if(Greenfoot.mouseClicked(this))
        {
            if(Utils.getInstance().getGameHost())
            {
                Utils.getInstance().setGameHost(false);
                this.setImage("button_connect-mode.png");
                this.current="button_connect-mode";
            }
            else
            {
                Utils.getInstance().setGameHost(true);
                this.setImage("button_host-mode.png");
                this.current="button_host-mode";
            }
        }
    }    
}
