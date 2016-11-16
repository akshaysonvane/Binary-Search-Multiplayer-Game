import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import javax.swing.JOptionPane;
import java.util.TimerTask;
import java.util.Timer;

import org.json.JSONObject ;
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
    Timer timer = new Timer();

    TimerTask delayedThreadStartTask;

    private boolean hover=false;

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
            if(DataModel.getInstance().getUserId() == null)
            {
                String userId = JOptionPane.showInputDialog("Please Enter name");
                DataModel.getInstance().setUserId(userId);
            }
            else
            {
                Greenfoot.playSound("Fuzzy_Beep.wav");
                Greenfoot.setWorld(new GameScreen());

                String url = Utils.BASE_URL + "StartServer";
                ClientResource client = new ClientResource(url); 
                JSONObject json = null;
                Representation result_string = client.post(MediaType.APPLICATION_JSON);
                try {
                    json = new JSONObject(result_string.getText());
                    System.out.println(json.get("Result"));
                }
                catch (Exception e) {
                }
                client.release();

                url = Utils.BASE_URL + "JoinGame";
                client = new ClientResource(url); 
                JSONObject json2 = new JSONObject();
                json2.put("userId", DataModel.getInstance().getUserId());
                result_string = client.post(new JsonRepresentation(json2), MediaType.APPLICATION_JSON);
                try {
                    json = new JSONObject(result_string.getText());
                    System.out.println(json.get("Result"));
                }
                catch (Exception e) {
                }
                client.release();

                url = Utils.BASE_URL + "StartGame";
                client = new ClientResource(url); 
                JSONObject json1 = new JSONObject();
                json1.put("round", 5);
                result_string = client.post(new JsonRepresentation(json1), MediaType.APPLICATION_JSON);
                try {
                    json = new JSONObject(result_string.getText());
                    System.out.println(json.get("Result"));
                }
                catch (Exception e) {
                }
                client.release();

                for(int i=0; i<20; i++)
                {
                    url = Utils.BASE_URL + "SetGetPlayerStatus";
                    client = new ClientResource(url); 
                    JSONObject json3 = new JSONObject();
                    json3.put("userId", "Akshay");
                    json3.put("roundStatus", 0);
                    result_string = client.post(new JsonRepresentation(json3), MediaType.APPLICATION_JSON);
                    try {
                        json = new JSONObject(result_string.getText());
                        System.out.println(json);
                    }
                    catch (Exception e) {
                    }
                    client.release();
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){e.printStackTrace();}
                }

                // //Timer timer = new Timer();
                // TimerTask delayedThreadStartTask = new TimerTask() {
                // @Override
                // public void run() {
                // new Thread(new Runnable() {
                // @Override
                // public void run() {
                // getStatus();
                // }
                // }).start();
                // }
                // };

                // timer.schedule(delayedThreadStartTask, 1000);

                // url = Utils.BASE_URL + "SetGetPlayerStatus";
                // client = new ClientResource(url); 
                // JSONObject json3 = new JSONObject();
                // json3.put("userId", "Akshay");
                // json3.put("roundStatus", 0);
                // result_string = client.post(new JsonRepresentation(json3), MediaType.APPLICATION_JSON);
                // try {
                // json = new JSONObject(result_string.getText());
                // System.out.println(json);
                // }
                // catch (Exception e) {
                // }
                // client.release();
            }
        }
    }

    public void getStatus()
    {
        String url = Utils.BASE_URL + "SetGetPlayerStatus";
        ClientResource client = new ClientResource(url); 
        JSONObject json = null;
        JSONObject json3 = new JSONObject();
        json3.put("userId", "Akshay");
        json3.put("roundStatus", 0);
        Representation result_string = client.post(new JsonRepresentation(json3), MediaType.APPLICATION_JSON);
        try {
            json = new JSONObject(result_string.getText());
            System.out.println(json.get("Result"));
        }
        catch (Exception e) {
        }
        client.release();
        //timer.cancel();
    }
}
