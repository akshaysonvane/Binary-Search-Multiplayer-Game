import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{ 
    public Label()
    {
        this("");
    }

    // Add your action code here.
    public Label(String txt)
    {
        setImage(new GreenfootImage(txt,20,Color.black,Color.WHITE));
    }    
}
