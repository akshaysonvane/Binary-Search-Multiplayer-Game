package multiplayergameServer;

import org.json.JSONObject;
import org.restlet.data.Form;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;


public class StartGame extends ServerResource
{
    
    
    @Get
    @Post
    public Representation startGame(Representation entity)
    {            
            Form form = new Form(entity);
            String round = form.getFirstValue("round");
            
            MultiplayerGameCore.getInstance().setRound(Integer.parseInt(round));            
            
            JSONObject obj = new JSONObject();
            obj.put("Result", true);
            return new JsonRepresentation(obj);
    }
}
