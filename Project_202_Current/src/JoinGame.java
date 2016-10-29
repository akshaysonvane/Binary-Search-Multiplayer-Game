package multiplayerGameServer;

import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import java.util.*;

public class JoinGame extends ServerResource
{
	@Get
	public String RegisterPlayer()
	{
		//Need to read name that is coming from client
		String name = "Sunil";

		Player p = new Player();
		p.setName(name);
		p.setLevel(0);
		p.setScore(0);
		JSONObject obj = new JSONObject();
		obj.put("Result", MultiplayerGameCore.getInstance().addPlayer(p));
		return obj.toString();
	}
}