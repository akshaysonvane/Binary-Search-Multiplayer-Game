package multiplayergameServer;

public class GameFinishedState implements IGameState 
{
    GameSessionData gd = new GameSessionData();
    
    public int getCurrentState()
    {
        return 3;
    }
    
    public GameSessionData getPlayerGameData()
    {
        gd.nGameState = 3;
        gd.nNumberToSearch = -1;
        gd.nRoundStatus = -1;
        gd.nScore = -1;        
        return gd;
    }
    
}
