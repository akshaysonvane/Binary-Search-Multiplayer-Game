package multiplayergameServer;

import org.json.* ;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.resource.* ;
import org.restlet.data.Form;

import java.util.*;

public class JoinGame extends ServerResource
{
	@Get
        @Post
	public Representation RegisterPlayer(Representation entity)
	{
		//Need to read name that is coming from client
		Form form = new Form(entity);
		String userId = form.getFirstValue("userId");

		Player p = new Player();
		p.setName(userId);
		JSONObject obj = new JSONObject();
		obj.put("Result", MultiplayerGameCore.getInstance().addPlayer(p));
		return new JsonRepresentation(obj);
	}
}