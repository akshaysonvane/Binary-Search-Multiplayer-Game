import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{

    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        GreenfootImage pic = new GreenfootImage(600, 400);
        pic.setColor(new Color(130, 54, 64));
        pic.fill();
        setBackground(pic);
     
        
    }
}
