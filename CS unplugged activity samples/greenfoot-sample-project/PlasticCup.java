import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlasticCup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlasticCup extends Actor
{
    int[] array= new int[12];
    NumberModel nm;
    int flag = 0;

    public PlasticCup(NumberModel nm)
    {
        GreenfootImage image = getImage();
        image.scale(80, 80);
        image.mirrorVertically();

        this.nm=nm;
    }

    /**
     * Act - do whatever the PlasticCup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  int x=0,y=0;
        this.array = nm.get_Number();
        /*
        if(flag ==0)
        {
            this.array = nm.get_Number();
            for(int i=0; i<array.length; i++)
            {  
                //System.out.println("\n In Plastic Cup");
                System.out.println(array[i]);
            }

            flag = 1;

        }*/

        if(Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                x = mouse.getX();
                y = mouse.getY();
               // System.out.println(x + " "  + y);

            }
            getWorld().removeObject(this);

            if(x>25 && x<105 && y>207 && y<286)
            {
                System.out.println(array[0]);
            }
            
                if(x>115 && x<195 && y>207 && y<286)
            {
                System.out.println(array[1]);
            }
            
                if(x>205 && x<285 && y>207 && y<286)
            {
                System.out.println(array[2]);
            }
            
                if(x>295 && x<375 && y>207 && y<286)
            {
                System.out.println(array[3]);
            }
            
                if(x>385 && x<465 && y>207 && y<286)
            {
                System.out.println(array[4]);
            }
            
            
                if(x>475 && x<555 && y>207 && y<286)
            {
                System.out.println(array[5]);
            }
            
                if(x>565 && x<645 && y>207 && y<286)
            {
                System.out.println(array[6]);
            }
            
            
                if(x>655 && x<735 && y>207 && y<286)
            {
                System.out.println(array[7]);
            }
            
            
                if(x>745 && x<825 && y>207 && y<286)
            {
                System.out.println(array[8]);
            }
            
            
                if(x>835 && x<915 && y>207 && y<286)
            {
                System.out.println(array[9]);
            }
            
            
                if(x>925 && x<1005 && y>207 && y<286)
            {
                System.out.println(array[10]);
            }
            
            
                if(x>1015 && x<1095 && y>207 && y<286)
            {
                System.out.println(array[11]);
            }
            
        }
    }    
}
