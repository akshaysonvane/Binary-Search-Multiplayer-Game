import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World
{

    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //   super(600, 400, 1); 

        super(1100, 600, 1);
        GreenfootImage pic = new GreenfootImage(600, 400);
        pic.setColor(new Color(124,54,87));
        pic.fill();
        setBackground(pic);

    }
}
