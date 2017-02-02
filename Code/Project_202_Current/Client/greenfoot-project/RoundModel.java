
public class RoundModel
{
    private static RoundModel roundModel = null;

    private int score = 0;
    private int clicks = 0;
    private int roundStatus = 0;

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getClicks()
    {
        return clicks;
    }

    public void setClicks(int clicks)
    {
        this.clicks = clicks;
    }

    public int getRoundStatus()
    {
        return roundStatus;
    }

    public void setRoundStatus(int roundStatus)
    {
        this.roundStatus = roundStatus;
    }

    public static RoundModel getInstance()
    {
        if(roundModel == null)
        {
            roundModel = new RoundModel();
        }

        return roundModel;
    }

}
