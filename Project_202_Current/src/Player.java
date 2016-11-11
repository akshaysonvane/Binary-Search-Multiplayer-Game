package multiplayergameServer;

public class Player
{
	private String sUserName;
	private int nRoundStatus; // 0: Still playing, 1: done
	private int nScore;

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
		return nRoundStatus;
	}

	public void setRoundStatus(int n)
	{
		this.nRoundStatus = n;
	}

	public int getScore()
	{
		return nScore;
	}

	public void setScore(int n)
	{
		this.nScore = n;
	}
}