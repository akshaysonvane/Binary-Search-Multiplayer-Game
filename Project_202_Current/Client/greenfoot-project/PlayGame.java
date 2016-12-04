import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.google.gson.Gson;

import java.util.Timer;
import java.util.TimerTask;

import org.json.JSONObject ;
import org.restlet.resource.*;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;

public class PlayGame extends Actor
{
    private boolean hover=false;
    private boolean changeWorld = true;

    private Timer timer;
    private TimerTask task;

    private Connection connect;

    MenuScreen screen;

    public PlayGame(MenuScreen screen)
    {
        connect = new Connection();
        timer = new Timer();

        this.screen = screen;
    }

    public void act() 
    {
        // Greenfoot.playSound("Fuzzy_Beep.wav");

        if(Greenfoot.mouseMoved(null))
            hover = Greenfoot.mouseMoved(this);
        if(hover){
            this.setImage("button_play-game-hover.png");
        }
        else
            this.setImage("button_play-game.png");

        if(Greenfoot.mouseClicked(this))
        {
            //Get userId and store in datamodel for suture usge
            String userId = JOptionPane.showInputDialog("Please Enter name");
            DataModel.getInstance().setUserId(userId);

            //TODO Required to smooth out UI/UX ??
            try{
                Thread.sleep(500);
            }
            catch(Exception e){e.printStackTrace();}

            //All calls apart from StartGame are sequiantial as each call is a dependency for the next call.
            if(startServer())
            {
                displayStatus("Starting Server");
                if(joinGame())
                {
                    displayStatus("Joining Game");
                    if(startGame())
                    {
                        displayStatus("Starting Game");

                        task = new TimerTask() {
                            @Override
                            public void run() {
                                getStatus();
                            }
                        };
                        //Timed thread runs every 1 second.
                        timer.schedule(task, 0,1000);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(new JPanel(), "Cannot start game.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(new JPanel(), "Cannot join game.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(new JPanel(), "Cannot connect to server.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Will not be called if game mode is connect game
    public boolean startServer()
    {
        return true;
        // if(Utils.getInstance().getGameHost())
        // {
            // return connect.startServer();
        // }
        // else
        // {
            // return true;
        // }
    }

    public boolean joinGame()
    {
        return connect.joinGame();
    }

    //Will not be called if game mode is connect game
    public boolean startGame()
    {
        if(Utils.getInstance().getGameHost())
        {
            return connect.startGame();
        }
        else
        {
            return true;
        }
    }

    public void getStatus()
    {
        connect.getStatus(timer);
        PlayerModel pm = DataModel.getInstance().getPlayerModel();
        if(pm.getPlayers().get(0).getGameState() == 1)
        {
            NumberModel.getInstance().setNo(pm.getPlayers().get(0).getNumberToSearch());
            NumberModel.getInstance().setNumbers(pm.getPlayers().get(0).getRandomNumber().toArray(new Integer[pm.getPlayers().get(0).getRandomNumber().size()]));

            if(changeWorld)
            {
                Greenfoot.playSound("Fuzzy_Beep.wav");
                Greenfoot.setWorld(new GameScreen());

                changeWorld = false;
            }
        }
        if(pm.getPlayers().get(0).getGameState() == 3)
        {
            timer.cancel();
            Greenfoot.setWorld(new EndScreen());
        }
    }

    public void displayStatus(String text)
    {
        screen.addObject(new StatusDisp() ,533,330);
        screen.addObject(new Label_2(text),533,330);
    }
}
