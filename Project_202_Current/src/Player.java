package multiplayerGameServer; 

public class Player
{
	private String sUserName;
	private int nLevel; //0: Still playing, 1: done
	private int nScore;

	public String getName()
	{
		return sUserName;
	}

	public void setName(String szName)
	{
		sUserName = szName;
	}

	public int getLevel()
	{
		return nLevel;
	}
	
	public void setLevel(int n)
	{
		nLevel = n;
	}

	public int getScore()
	{
		return nScore;
	}
	
	public void setScore(int n)
	{
		nScore = n;
	}
}