package multiplayergameServer;

import org.json.* ;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.resource.* ;
import org.restlet.data.Form;

import java.util.*;

public class GetSetPlayersStatus extends ServerResource
{
	@Get
        @Post
	public Representation getSetStatus(Representation entity)
	{		
		Form form = new Form(entity);
		String userId = form.getFirstValue("userId");
		String ss = form.getFirstValue("roundStatus");

		Player p = new Player();
		p.setName(userId);
		p.setRoundStatus(Integer.parseInt(ss.toString()));	
		
		
		JSONObject obj = new JSONObject();
		obj.put("Result", MultiplayerGameCore.getInstance().updatePlayerData(p));
		
		List<Player> playerList = MultiplayerGameCore.getInstance().getListofPlayer();
		JSONArray ja = new JSONArray();
		for(int i = 0; i < playerList.size(); i++)
		{
			JSONObject jo = new JSONObject();
			jo.put("name", playerList.get(i).getName());
			jo.put("roundStatus", playerList.get(i).getRoundStatus());
			jo.put("score", playerList.get(i).getScore());
			ja.put(jo);
		}
		
		obj.put("players", ja);
		
		return new JsonRepresentation(obj);
	}
}