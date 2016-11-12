/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplayergameServer;

import java.util.ArrayList;
import org.restlet.representation.Representation;

/**
 *
 * @author sunil
 */
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
