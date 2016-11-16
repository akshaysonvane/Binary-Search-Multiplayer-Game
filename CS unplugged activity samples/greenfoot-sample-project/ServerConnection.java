import org.json.JSONObject ;
import org.restlet.resource.*;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;

public class ServerConnection
{
    private static ServerConnection serverConnection = null;

    public static ServerConnection getInstance()
    {
        if(serverConnection == null)
        {
            serverConnection = new ServerConnection();
        }

        return serverConnection;
    }

    public static JSONObject connect(String path, JSONObject obj)
    {
        String url = Utils.BASE_URL + path;

        ClientResource client = new ClientResource(url); 

        JSONObject json = null;
        Representation result_string = client.post(new JsonRepresentation(obj), MediaType.APPLICATION_JSON);
        try {
            json = new JSONObject( result_string.getText() ) ;
        }
        catch (Exception e) {
        }          
        return json;

    }
}
