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


        Ball2 first = new Ball2();
        addObject(first,128,245);
        first.setLocation(58,255);
        
        
        Ball3 second = new Ball3();
        addObject(second,287,252);
        second.setLocation(131,254);
        
        Ball5 third = new Ball5();
        addObject(third,349,247);
        third.setLocation(205,256);
        
        
        
        Ball10 fourth = new Ball10();
        addObject(fourth,256,253);
        fourth.setLocation(285,257);
        
        
        
        Ball12 fifth = new Ball12();
        addObject(fifth,379,253);
        fifth.setLocation(368,257);
        
        
        Ball17 sixth = new Ball17();
        addObject(sixth,520,248);
        sixth.setLocation(458,260);
        
        
        Ball19 seventh = new Ball19();
        addObject(seventh,593,256);
        seventh.setLocation(555,261);
        
        
        Ball21 eight = new Ball21();
        addObject(eight,655,260);
        eight.setLocation(653,263);
        
        Ball4 ninth = new Ball4();
        addObject(ninth, 755, 260);
        ninth.setLocation(755, 263);
        
        
        Ball6 tenth = new Ball6();
        addObject(tenth, 855, 260);
        tenth.setLocation(855, 263);

        Ball15 eleventh = new Ball15();
        addObject(eleventh, 955, 260);
        eleventh.setLocation(955, 263);

        Ball7 twelth = new Ball7();
        addObject(twelth, 1055, 260);
        twelth.setLocation(1055, 263);

        
        Ball19 to_search = new Ball19();
        addObject(to_search,550,54);
        
        PlasticCup plasticcup = new PlasticCup();
        addObject(plasticcup,47,199);
        plasticcup.setLocation(54,254);
        
        PlasticCup plasticcup2 = new PlasticCup();
        addObject(plasticcup2,41,257);
        plasticcup2.setLocation(135,245);
        
        plasticcup.setLocation(52,247);
        
        PlasticCup plasticcup3 = new PlasticCup();
        addObject(plasticcup3,209,257);
        plasticcup3.setLocation(211,243);
        
        PlasticCup plasticcup4 = new PlasticCup();
        addObject(plasticcup4,283,264);
        plasticcup4.setLocation(286,247);
        
        PlasticCup plasticcup5 = new PlasticCup();
        addObject(plasticcup5,339,254);
        plasticcup5.setLocation(371,323);
        plasticcup5.setLocation(362,250);
        
        PlasticCup plasticcup6 = new PlasticCup();
        addObject(plasticcup6,413,267);
        plasticcup6.setLocation(472,339);
        plasticcup6.setLocation(647,254);
        
        PlasticCup plasticcup7 = new PlasticCup();
        addObject(plasticcup7,471,260);
        plasticcup7.setLocation(456,250);
        
        
        PlasticCup plasticcup8 = new PlasticCup();
        addObject(plasticcup8,547,260);
        plasticcup8.setLocation(557,252);
        
        PlasticCup plasticcup9 = new PlasticCup();
        addObject(plasticcup9,623,260);
        plasticcup9.setLocation(657,252);
        
        PlasticCup plasticcup10 = new PlasticCup();
        addObject(plasticcup10,694,260);
        plasticcup10.setLocation(757,252);
        
        PlasticCup plasticcup11 = new PlasticCup();
        addObject(plasticcup11,765,260);
        plasticcup11.setLocation(857,252);
        
        PlasticCup plasticcup12 = new PlasticCup();
        addObject(plasticcup12,836,260);
        plasticcup12.setLocation(957,252);
        
        PlasticCup plasticcup13 = new PlasticCup();
        addObject(plasticcup13,1055,260);
        plasticcup13.setLocation(1055, 255);
            
        
        Message message = new Message();
        addObject(message,361,431);
    }
}
