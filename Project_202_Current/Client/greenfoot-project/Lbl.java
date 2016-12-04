import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Lbl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lbl extends Actor
{
    public Lbl(String text, int size)
    {
        setImage(new GreenfootImage(text, size, Color.black, Color.WHITE));
    }
}
