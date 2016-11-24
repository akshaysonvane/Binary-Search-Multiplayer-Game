import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Label_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label_2 extends Actor
{
    /**
     * Act - do whatever the Label_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public Label_2()
    {
        this("");
    }

    // Add your action code here.
    public Label_2(String txt)
    {
        setImage(new GreenfootImage(txt,20,Color.WHITE,new Color(0, 0, 0, 0)));

    }    
}
