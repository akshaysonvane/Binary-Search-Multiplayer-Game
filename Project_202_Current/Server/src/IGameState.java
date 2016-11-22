package multiplayergameServer;

public interface IGameState {  
    
    public GameSessionData getPlayerGameData();
    public int getCurrentState();
}
