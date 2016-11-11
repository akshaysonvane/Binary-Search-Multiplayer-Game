/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplayergameServer;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author sunil
 */
public class GameStateManager extends TimerTask implements IGameStateManager {
    
    private ArrayList<Player> player = new ArrayList();
    
    IGameState gameFinishedState = new GameFinishedState();
    IGameState gameRunningState = new GameRunningState();
    IGameState gameStartState = new GameStartState();
    IGameState gameWaitingToStartState = new GameWaitingToStartState();
    
    IGameState currentState;
    long time = System.currentTimeMillis();
    long nCurrentTime;
    
    GameStateManager()
    {
        currentState = gameWaitingToStartState;       
    }  
    
    public void run() {      
      
      nCurrentTime = System.currentTimeMillis();
      
      switch(currentState.getCurrentState())
      {
          case 0:
              if((nCurrentTime - time) > 5000)
              {
                  currentState = gameStartState;
                  time = nCurrentTime;
                  System.out.println(currentState.getCurrentState());
                  notifyObserver();
              }
              break;
          case 1:
              if((nCurrentTime - time) > 2000)
              {
                  currentState = gameRunningState;
                  time = nCurrentTime;
                  notifyObserver();
                  System.out.println(currentState.getCurrentState());
              }
              break;
          case 2:
              if((nCurrentTime - time) > 60000)
              {
                  currentState = gameFinishedState;
                  time = nCurrentTime;
                  notifyObserver();
                  System.out.println(currentState.getCurrentState());
              }
              break;
          case 3:
              if((nCurrentTime - time) > 5000)
              {
                  currentState = gameWaitingToStartState;
                  time = nCurrentTime;
                  notifyObserver();
                  System.out.println(currentState.getCurrentState());
              }
              break;
      }      
    }

    public void notifyObserver()
    {
        for(Player p: player)
        {
            p.notifi();
        }
    }
    
    public IGameState getState()
    {
        return currentState;
    }
    
    public void attach(Player p)
    {        
        player.add(p);
    }
    public void detach(Player p)
    {
        for(int i=0; i < player.size(); i++)
        {
            if(player.get(i).getName().equalsIgnoreCase(p.getName()))
                player.remove(i);
        }
        
    }
    
}
