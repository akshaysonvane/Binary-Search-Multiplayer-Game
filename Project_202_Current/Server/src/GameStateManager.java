package multiplayergameServer;

import java.util.ArrayList;
import java.util.TimerTask;

public class GameStateManager extends TimerTask implements IGameStateManager
{

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

	public void run()
	{

		nCurrentTime = System.currentTimeMillis();

		switch (currentState.getCurrentState())
		{
			// 0 = waiting to start
			case 0:
				System.out.println("Waiting For round " + MultiplayerGameCore.getInstance().getRound() + " To Start");
				if ((nCurrentTime - time) > 5000 && MultiplayerGameCore.getInstance().getRoundLeft() > 0)
				{
					System.out.println("Case 0");
					currentState = gameStartState;
					time = nCurrentTime;
					RandomNumberList rn = RandomNumberList.getInstance();
					rn.generateRandomNumbers();
					notifyObserver();

				}
				break;
			// 1=Start
			case 1:
				if ((nCurrentTime - time) > 1000)
				{
					System.out.println("Case 1");
					currentState = gameRunningState;
					time = nCurrentTime;
					notifyObserver();

				}
				System.out.println("Start Round");
				break;
			// 2 = running
			case 2:
				if ((nCurrentTime - time) > 30000)
				{
					System.out.println("Case 2");
					currentState = gameFinishedState;
					time = nCurrentTime;
					notifyObserver();
				}
				System.out.println("Round Running");
				break;
			// 3 = finished
			case 3:
				System.out.println("Round finished");
				if ((nCurrentTime - time) > 5000)
				{
					System.out.println("Case 3");
					MultiplayerGameCore.getInstance().setRoundDone();

					currentState = gameWaitingToStartState;
					time = nCurrentTime;
					notifyObserver();

				}
				break;
		}
	}

	public void notifyObserver()
	{
		for (Player p : player)
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
		for (int i = 0; i < player.size(); i++)
		{
			if (player.get(i).getName().equalsIgnoreCase(p.getName()))
				player.remove(i);
		}

	}

}
