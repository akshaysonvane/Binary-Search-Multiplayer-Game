
public class ResetData  
{
    private static ResetData resetData = null;

    public static ResetData getInstance()
    {
        if(resetData == null)
        {
            resetData = new ResetData();
        }

        return resetData;
    }

    public void reset()
    {
        Utils.getInstance().setGameHost(false);
        RoundModel.getInstance().setClicks(0);
        RoundModel.getInstance().setRoundStatus(0);
        RoundModel.getInstance().setScore(0);
    }
}
