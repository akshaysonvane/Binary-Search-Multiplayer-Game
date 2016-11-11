/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplayergameServer;

import org.restlet.representation.Representation;

/**
 *
 * @author sunil
 */
public interface IGameState {  
    
    public GameSessionData getPlayerGameData();
    public int getCurrentState();
}
