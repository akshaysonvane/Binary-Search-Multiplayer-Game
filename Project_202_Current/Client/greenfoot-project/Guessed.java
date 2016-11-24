import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guessed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guessed extends World
{

    /**
     * Constructor for objects of class Guessed.
     * 
     */
    public Guessed()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        GreenfootImage image = getBackground();
        image.scale(1100, 600);
    }
}
