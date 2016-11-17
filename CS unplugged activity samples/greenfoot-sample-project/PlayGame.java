import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.google.gson.Gson;

import java.util.Timer;
import java.util.TimerTask;

import org.json.JSONObject ;
import org.json.JSONArray ;
import org.restlet.resource.*;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;

/**
 * Write a description of class PlayGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGame extends Actor
{
    private boolean hover=false;
    private boolean changeWorld = true;

    Timer timer = new Timer();
    TimerTask task;

    public void act() 
    {
        // Greenfoot.playSound("Fuzzy_Beep.wav");

        if(Greenfoot.mouseMoved(null))
            hover = Greenfoot.mouseMoved(this);
        if(hover){
            setImage("button_play-game-hover.png");
        }
        else
            setImage("button_play-game.png");

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
                if(joinGame())
                {
                    if(startGame())
                    {
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
        if(Utils.getInstance().getGameHost())
        {
            boolean hasStarted = false;
            String url = Utils.BASE_URL + "StartServer";
            ClientResource client = new ClientResource(url); 
            JSONObject json = null;

            try 
            {
                Representation result_string = client.post(MediaType.APPLICATION_JSON);
                json = new JSONObject(result_string.getText());
                System.out.println(json.get("Result"));
                if(json.get("Result").toString().equalsIgnoreCase("true"))
                {
                    hasStarted = true;
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
            client.release();

            return hasStarted;
        }
        else
        {
            return true;
        }
    }

    public boolean joinGame()
    {
        boolean hasJoined = false;
        String url = Utils.BASE_URL + "JoinGame";
        ClientResource client = new ClientResource(url); 
        JSONObject json2 = new JSONObject();
        JSONObject json = null;
        json2.put("userId", DataModel.getInstance().getUserId());

        try 
        {
            Representation result_string = client.post(new JsonRepresentation(json2), MediaType.APPLICATION_JSON);
            json = new JSONObject(result_string.getText());
            System.out.println(json.get("Result"));
            if(json.get("Result").toString().equalsIgnoreCase("true"))
            {
                hasJoined = true;
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        client.release();

        return hasJoined;
    }

    //Will not be called if game mode is connect game
    public boolean startGame()
    {
        if(Utils.getInstance().getGameHost())
        {
            boolean hasStarted = false;
            String url = Utils.BASE_URL + "StartGame";
            ClientResource client = new ClientResource(url); 
            JSONObject json = null;
            JSONObject json1 = new JSONObject();
            json1.put("round", 1);

            try 
            {
                Representation result_string = client.post(new JsonRepresentation(json1), MediaType.APPLICATION_JSON);
                json = new JSONObject(result_string.getText());
                System.out.println(json.get("Result"));
                if(json.get("Result").toString().equalsIgnoreCase("true"))
                {
                    hasStarted = true;
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
            client.release();

            return hasStarted;
        }
        else
        {
            return true;
        }
    }

    public void getStatus()
    {
        String url = Utils.BASE_URL + "SetGetPlayerStatus";
        ClientResource client = new ClientResource(url); 
        JSONObject json = null;
        JSONObject json3 = new JSONObject();
        json3.put("userId", DataModel.getInstance().getUserId());
        json3.put("roundStatus", RoundModel.getInstance().getRoundStatus());
        json3.put("score", RoundModel.getInstance().getClicks());

        try 
        {
            Representation result_string = client.post(new JsonRepresentation(json3), MediaType.APPLICATION_JSON);
            json = new JSONObject(result_string.getText());
            System.out.println(json);
            Gson gson = new Gson();
            PlayerModel pm = gson.fromJson(json.toString(), PlayerModel.class);
            DataModel.getInstance().setPlayerModel(pm);
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
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        client.release();
    }
}
