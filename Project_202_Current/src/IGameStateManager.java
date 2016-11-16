package multiplayergameServer;


public interface IGameStateManager {
    
    public void attach(Player p);
    public void detach(Player p);
    public IGameState getState();
    
}
