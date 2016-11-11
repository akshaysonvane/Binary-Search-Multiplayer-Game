package multiplayergameServer; 
import java.util.*;

public class MultiplayerGameCore
{
	List<Player> playerList = new ArrayList<Player>();
        GameStateManager gameStateManager = new GameStateManager(); 
        Timer timer = new Timer();

	private static MultiplayerGameCore instance = null;
   	private MultiplayerGameCore() {	}
	
	public static synchronized MultiplayerGameCore getInstance() 
	{
      		if(instance == null) {
         		instance = new MultiplayerGameCore();                        
      		}
      		return instance;
   	}

	public Boolean addPlayer(Player newPlayer)
	{ 
            
		for(int i = 0; i < playerList.size(); i++)
		{
                    if(playerList.get(i).getName().equalsIgnoreCase(newPlayer.getName()))
                            return false;
		}		

		playerList.add(newPlayer);
                gameStateManager.attach(newPlayer);
                newPlayer.setSubject(gameStateManager);
		return true;
	}

	public Boolean removePlayer(Player p)
	{
            timer.schedule(gameStateManager, 3000, 3000);
		for(int i = 0; i < playerList.size(); i++)
		{
                    if(playerList.get(i).getName().equalsIgnoreCase(p.getName()))
                    {
                            playerList.remove(i);
                            gameStateManager.detach(p);
                            return true;
                    }
		}
		
		return false;
	}
	public Boolean updatePlayerData(Player p)
	{
		for(int i = 0; i < playerList.size(); i++)
		{
			if(playerList.get(i).getName().equalsIgnoreCase(p.getName()))
			{
				int nCurrScore = playerList.get(i).getScore();
				p.setScore(nCurrScore);
				//All other data already came from client. Otherwise fill in here.
				playerList.set(i, p);
				return true;
			}
		}
		return false;
	}
	
	public List<Player> getListofPlayer()
	{
		return playerList;
	}
	
}