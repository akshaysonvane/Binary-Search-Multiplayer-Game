package multiplayerGameServer;

import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import java.util.*;

public class LeaveGame extends ServerResource
{
	@Get
	public String leaveGame()
	{
		//Need to read name that is coming from client
		String name = "Sunil";

		Player p = new Player();
		p.setName(name);
		p.setLevel(0);
		p.setScore(0);
		JSONObject obj = new JSONObject();
		obj.put("Result", MultiplayerGameCore.getInstance().removePlayer(p));
		return obj.toString();
	}
}