package multiplayerGameServer; 
import java.util.*;

public class MultiplayerGameCore
{
	List<Player> playerList = new ArrayList<Player>();

	private static MultiplayerGameCore instance = null;
   	private MultiplayerGameCore() {	}
	
	public static MultiplayerGameCore getInstance() 
	{
      		if(instance == null) {
         		instance = new MultiplayerGameCore();
      		}
      		return instance;
   	}

	public Boolean addPlayer(Player newPlayer)
	{
		if(playerList.contains(newPlayer)) //fix this as this condition will always fail. Compare name instead of object.
			return false;

		playerList.add(newPlayer);
		return true;
	}
	public Boolean removePlayer(Player p)
	{
		playerList.remove(p);
		return true;
	}
	
}