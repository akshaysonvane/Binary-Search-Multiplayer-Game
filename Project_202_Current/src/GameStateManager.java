package multiplayergameServer;

import java.util.ArrayList;
import java.util.TimerTask;

public class GameStateManager extends TimerTask implements IGameStateManager {
    
    private ArrayList<Player> player = new ArrayList<Player>();
    
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
              if((nCurrentTime - time) > 5000 && MultiplayerGameCore.getInstance().getRoundLeft() > 0)
              {
                  currentState = gameStartState;
                  time = nCurrentTime;                  
                  notifyObserver();
                  System.out.println("Waiting For round " + MultiplayerGameCore.getInstance().getRound() + " To Start");
              }
              break;
          case 1:
              if((nCurrentTime - time) > 1000)
              {
                  currentState = gameRunningState;
                  time = nCurrentTime;
                  RandomNumberList rn = RandomNumberList.getInstance();
                  rn.generateRandomNumbers();
                  notifyObserver();
                  System.out.println("Start Round");
              }
              break;
          case 2:
              if((nCurrentTime - time) > 10000)
              {
                  currentState = gameFinishedState;
                  time = nCurrentTime;
                  notifyObserver();
                  System.out.println("Round Running");
              }
              break;
          case 3:
              if((nCurrentTime - time) > 5000)
              {
                  MultiplayerGameCore.getInstance().setRoundDone();
                  
                  currentState = gameWaitingToStartState;
                  time = nCurrentTime;
                  notifyObserver();
                  System.out.println("Round finished");                 
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
