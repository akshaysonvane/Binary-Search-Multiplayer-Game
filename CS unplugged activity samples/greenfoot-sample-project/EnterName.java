import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class EnterName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnterName extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            // String userId = JOptionPane.showInputDialog("Enter name");
            // DataModel.getInstance().setUserId(userId);
            
            if(Utils.getInstance().getGameHost())
            {
                Utils.getInstance().setGameHost(false);
            }
            else
            {
                Utils.getInstance().setGameHost(true);
            }
        }
    }    
}
