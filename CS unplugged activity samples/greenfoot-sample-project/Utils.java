/**
 * Write a description of class Utils here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utils  
{
    private static Utils utils = null;
    public static String BASE_URL = "http://localhost:8080/MultiPlayerGame/";
    
    public static Utils getInstance()
    {
        if (utils == null)
        {
            utils = new Utils();
        }
        
        return utils;
    }
}
