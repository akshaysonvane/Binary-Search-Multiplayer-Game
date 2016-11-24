import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlasticCup extends Actor
{
    Integer[] array= new Integer[12];
    NumberModel nm;

    public PlasticCup()
    {
        GreenfootImage image = getImage();
        image.scale(80, 80);
        //image.mirrorVertically();

        this.nm = NumberModel.getInstance();
    }

    public void act() 
    {  
        int x=0,y=0;
        this.array = nm.getNumber();

        if(Greenfoot.mouseClicked(this))
        {
            RoundModel.getInstance().setClicks(RoundModel.getInstance().getClicks() + 1);

            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                x = mouse.getX();
                y = mouse.getY();
            }
            getWorld().removeObject(this);

            if(x>25 && x<105 && y>207 && y<286)
            {
                System.out.println(array[0]);
                checkNumber(0);
            }

            if(x>115 && x<195 && y>207 && y<286)
            {
                System.out.println(array[1]);
                checkNumber(1);
            }

            if(x>205 && x<285 && y>207 && y<286)
            {
                System.out.println(array[2]);
                checkNumber(2);
            }

            if(x>295 && x<375 && y>207 && y<286)
            {
                System.out.println(array[3]);
                checkNumber(3);
            }

            if(x>385 && x<465 && y>207 && y<286)
            {
                System.out.println(array[4]);
                checkNumber(4);
            }

            if(x>475 && x<555 && y>207 && y<286)
            {
                System.out.println(array[5]);
                checkNumber(5);
            }

            if(x>565 && x<645 && y>207 && y<286)
            {
                System.out.println(array[6]);
                checkNumber(6);
            }

            if(x>655 && x<735 && y>207 && y<286)
            {
                System.out.println(array[7]);
                checkNumber(7);
            }

            if(x>745 && x<825 && y>207 && y<286)
            {
                System.out.println(array[8]);
                checkNumber(8);
            }

            if(x>835 && x<915 && y>207 && y<286)
            {
                System.out.println(array[9]);
                checkNumber(9);
            }

            if(x>925 && x<1005 && y>207 && y<286)
            {
                System.out.println(array[10]);
                checkNumber(10);
            }

            if(x>1015 && x<1095 && y>207 && y<286)
            {
                System.out.println(array[11]);
                checkNumber(11);
            }

        }
    }

    public void checkNumber(int index)
    {
        //compare number to search with number clicked on
        if(array[index] == nm.getNo())
        {
            //Game Finished
            RoundModel.getInstance().setRoundStatus(1);
             Greenfoot.setWorld(new Guessed());
        }
    }
}
