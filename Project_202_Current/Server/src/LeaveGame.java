package multiplayergameServer;

import java.io.IOException;

import org.json.*;
import org.restlet.representation.*;
import org.restlet.ext.json.*;
import org.restlet.resource.*;

public class LeaveGame extends ServerResource
{
	@Get
	@Post
	public Representation leaveGame(Representation entity) throws JSONException, IOException
	{
		// Need to read name that is coming from client
		JSONObject json = new JSONObject(entity.getText());
		String userId = (String) json.get("userId");

		Player p = new Player();
		p.setName(userId);
		JSONObject obj = new JSONObject();
		obj.put("Result", MultiplayerGameCore.getInstance().removePlayer(p));
		return new JsonRepresentation(obj);
	}
}