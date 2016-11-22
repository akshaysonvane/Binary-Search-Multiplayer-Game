package multiplayergameServer;

import java.util.ArrayList;

public class GameSessionData {
    
    public int nRoundStatus; // 0: Still playing, 1: done
    public int nScore;
    public int nGameState; //0 = waiting to start, 1=Start, 2 = running, 3 = finished
    public ArrayList<Integer> randomNumber = new ArrayList<Integer>();
    public int nNumberToSearch;
    public int round;
    
}
