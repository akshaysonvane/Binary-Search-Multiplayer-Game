package multiplayergameServer;


public class GameWaitingToStartState implements IGameState {
        
    GameSessionData gd = new GameSessionData();
    
    public int getCurrentState()
    {
        return 0;
    }
    
    public GameSessionData getPlayerGameData()
    {        
        gd.nGameState = 0;        
        gd.nRoundStatus = 0;
        gd.nScore = -1;
        gd.nNumberToSearch = -1; 
        return gd;
    }   
}
