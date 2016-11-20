import org.restlet.resource.*;
import org.json.JSONObject ;
import org.restlet.representation.*;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;
import java.util.Timer;
import com.google.gson.Gson;

public class Connection implements IRemoteProxy 
{
    public boolean startServer()
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

    public boolean startGame()
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

    public void getStatus(Timer timer)
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
        } 
        catch (Exception e) 
        {
            timer.cancel();
            e.printStackTrace();
        }
        client.release();

    }
}
