package multiplayergameServer;

public class GameStartState implements IGameState 
{    
    
    GameSessionData gd = new GameSessionData();
    RandomNumberList rn = RandomNumberList.getInstance();
    
    public int getCurrentState()
    {
        return 1;
    }
    
    public GameSessionData getPlayerGameData()
    {
    	rn.generateRandomNumbers();
        gd.nGameState = 1;        
        gd.nRoundStatus = -1;
        gd.nScore = -1;
        gd.randomNumber = rn.getRandomNumberList();
        gd.nNumberToSearch = rn.getNumberToSearch(); 
        return gd;
    }    
}
