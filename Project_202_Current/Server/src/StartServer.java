package multiplayergameServer;

import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class StartServer extends ServerResource
{
    
    
    @Get
    @Post
    public Representation startServer(Representation entity)
    {            
            //MultiplayerGameCore.getInstance().stopGame();
            MultiplayerGameCore.getInstance().startServer();
            
            
            JSONObject obj = new JSONObject();
            obj.put("Result", true);
            return new JsonRepresentation(obj);
    }
}
