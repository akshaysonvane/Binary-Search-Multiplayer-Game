/**
 * Write a description of class DataModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataModel  
{
    private String userId = null;
    private static DataModel dataModel = null;

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
}
