/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplayergameServer;

/**
 *
 * @author sunil
 */
public interface IGameStateManager {
    
    public void attach(Player p);
    public void detach(Player p);
    public IGameState getState();
    
}
