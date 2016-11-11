import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{
        GreenfootSound backgroundMusic = new GreenfootSound("bgm game.wav");
        
    public GameScreen()
    {    
       super(1100, 600, 1); 
       GreenfootImage image = getBackground();
        image.scale(1100, 600);
       backgroundMusic.playLoop();
       prepare();
    }
    
    public void prepare()
    {

        Ball2 ball2 = new Ball2();
        addObject(ball2,128,245);
        ball2.setLocation(58,255);
        Ball3 ball3 = new Ball3();
        addObject(ball3,287,252);
        ball3.setLocation(131,254);
        Ball5 ball5 = new Ball5();
        addObject(ball5,349,247);
        ball5.setLocation(205,256);
        Ball10 ball10 = new Ball10();
        addObject(ball10,256,253);
        ball10.setLocation(285,257);
        Ball12 ball12 = new Ball12();
        addObject(ball12,379,253);
        ball12.setLocation(368,257);
        Ball17 ball17 = new Ball17();
        addObject(ball17,520,248);
        ball17.setLocation(458,260);
        Ball19 ball19 = new Ball19();
        addObject(ball19,593,256);
        ball19.setLocation(555,261);
        Ball21 ball21 = new Ball21();
        addObject(ball21,655,260);
        ball21.setLocation(653,263);
        Ball19 ball192 = new Ball19();
        addObject(ball192,350,54);
        PlasticCup plasticcup = new PlasticCup();
        addObject(plasticcup,47,199);
        PlasticCup plasticcup2 = new PlasticCup();
        addObject(plasticcup2,41,257);
        plasticcup2.setLocation(135,245);
        plasticcup.setLocation(54,254);
        plasticcup.setLocation(52,247);
        PlasticCup plasticcup3 = new PlasticCup();
        addObject(plasticcup3,209,257);
        PlasticCup plasticcup4 = new PlasticCup();
        addObject(plasticcup4,283,264);
        PlasticCup plasticcup5 = new PlasticCup();
        addObject(plasticcup5,339,254);
        PlasticCup plasticcup6 = new PlasticCup();
        addObject(plasticcup6,413,267);
        PlasticCup plasticcup7 = new PlasticCup();
        addObject(plasticcup7,471,260);
        PlasticCup plasticcup8 = new PlasticCup();
        addObject(plasticcup8,547,260);
        plasticcup5.setLocation(371,323);
        plasticcup3.setLocation(211,243);
        plasticcup4.setLocation(286,247);
        plasticcup6.setLocation(472,339);
        plasticcup5.setLocation(362,250);
        plasticcup7.setLocation(456,250);
        plasticcup8.setLocation(557,252);
        plasticcup6.setLocation(647,254);
        Message message = new Message();
        addObject(message,361,431);
    }
}
