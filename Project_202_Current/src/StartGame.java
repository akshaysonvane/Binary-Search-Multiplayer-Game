/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplayergameServer;

import java.util.Timer;
import org.json.JSONObject;
import org.restlet.data.Form;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

/**
 *
 * @author sunil
 */
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
