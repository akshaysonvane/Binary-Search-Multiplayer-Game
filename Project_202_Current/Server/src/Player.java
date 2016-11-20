package multiplayergameServer;

import java.util.ArrayList;

public class Player
{
	private String sUserName;
	private GameSessionData sessionData = new GameSessionData();

	IGameStateManager subject;

	public void setSubject(IGameStateManager s)
	{
		subject = s;
	}

	public void notifi()
	{
		System.out.println("User " + sUserName + " session Data Updated");
		GameSessionData gd = subject.getState().getPlayerGameData();
		sessionData.nGameState = gd.nGameState;
		sessionData.nNumberToSearch = gd.nNumberToSearch;

		if (gd.nRoundStatus >= 0)
			sessionData.nRoundStatus = gd.nRoundStatus;

		if (gd.nScore >= 0)
			sessionData.nScore = gd.nScore;

		if (gd.randomNumber != null && gd.randomNumber.size() > 0)
			sessionData.randomNumber = gd.randomNumber;
	}

	public int getGameState()
	{
		return sessionData.nGameState;
	}

	public ArrayList<Integer> getRandomNumberList()
	{
		return sessionData.randomNumber;
	}

	public int getNumberToSearch()
	{
		return sessionData.nNumberToSearch;
	}

	public String getName()
	{
		return sUserName;
	}

	public void setName(String szName)
	{
		this.sUserName = szName;
	}

	public int getRoundStatus()
	{
		return sessionData.nRoundStatus;
	}

	public void setRoundStatus(int n)
	{
		this.sessionData.nRoundStatus = n;
	}

	public int getScore()
	{
		return sessionData.nScore;
	}

	public void setScore(int n)
	{
		this.sessionData.nScore = n;
	}
}