import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

public class playername extends World
{

    public playername()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        
        TextField  PlayerName = new TextField(150,40, "",true);
        addObject(PlayerName, 533,337);
        
    }
}
