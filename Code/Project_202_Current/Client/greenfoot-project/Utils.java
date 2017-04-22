public class Utils  
{
    private static Utils utils = null;
    //public static String BASE_URL = "http://ec2-54-183-114-75.us-west-1.compute.amazonaws.com:8080/MultiPlayerGame/";
    public static String BASE_URL = "http://localhost:8080/MultiPlayerGame/";
    public static int BOUND = 12;
    public static int rounds = 3;
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
