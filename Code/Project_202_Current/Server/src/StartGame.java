package multiplayergameServer;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class StartGame extends ServerResource
{

	@Get
	@Post
	public Representation startGame(Representation entity) throws JSONException, IOException
	{
		JSONObject json = new JSONObject(entity.getText());
		Integer round = (Integer) json.get("round"); 

		System.out.println(round);
		MultiplayerGameCore.getInstance().setRound(round);

		JSONObject obj = new JSONObject();
		obj.put("Result", true);
		return new JsonRepresentation(obj);
	}
}
