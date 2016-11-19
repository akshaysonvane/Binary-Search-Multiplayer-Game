public class Utils  
{
    private static Utils utils = null;
    public static String BASE_URL = "http://localhost:8080/MultiPlayerGame/";
    public static int BOUND = 12;
    private boolean gameHost = false;

    public static Utils getInstance()
    {
        if (utils == null)
        {
            utils = new Utils();
        }

        return utils;
    }

    public boolean getGameHost()
    {
        return gameHost;
    }

    public void setGameHost(boolean gameHost)
    {
        this.gameHost = gameHost;
    }
}
