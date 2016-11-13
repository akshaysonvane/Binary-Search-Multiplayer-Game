package multiplayergameServer;

public class GameRunningState implements IGameState {   
    
    GameSessionData gd = new GameSessionData();
    
    public int getCurrentState()
    {
        return 2;
    }
    
    public GameSessionData getPlayerGameData()
    {
        gd.nGameState = 2;
        gd.nNumberToSearch = -1;
        gd.nRoundStatus = -1;
        gd.nScore = -1; 
        return gd;
    }
    
}
