public class DataModel
{
    private String userId = null;
    private static DataModel dataModel = null;
    private static PlayerModel playerModel = null;

    public static DataModel getInstance()
    {
        if(dataModel == null)
        {
            dataModel = new DataModel();
        }

        return dataModel;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public PlayerModel getPlayerModel()
    {
        return playerModel;
    }

    public void setPlayerModel(PlayerModel playerModel)
    {
        this.playerModel = playerModel;
    }
}
