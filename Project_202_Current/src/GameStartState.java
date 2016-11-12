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
        gd.nGameState = 1;        
        gd.nRoundStatus = -1;
        gd.nScore = -1;
        gd.randomNumber = rn.getRandomNumberList();
        gd.nNumberToSearch = rn.getNumberToSearch(); 
        return gd;
    }    
}
