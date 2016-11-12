/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplayergameServer;

import java.util.ArrayList;

/**
 *
 * @author sunil
 */
public class GameSessionData {
    
    public int nRoundStatus; // 0: Still playing, 1: done
    public int nScore;
    public int nGameState; //0 = waiting to start, 1=Start, 2 = running, 3 = finished
    public ArrayList<Integer> randomNumber = new ArrayList();
    public int nNumberToSearch;
    public int round;
    
}
