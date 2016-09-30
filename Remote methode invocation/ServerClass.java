import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 
import java.util.*;

public class ServerClass extends UnicastRemoteObject implements getSet
{	
    public ServerClass() throws RemoteException {} 

    private int nValue = 10;
    private List<Object> Client = new ArrayList<Object>();

    public int getValue() 
    { 
	try
	{
		System.out.println(((IClientCallBack)Client.get(0)).getValue());
	}
	catch(Exception e)
	{
	}
	return nValue; 
    } 
    public void setValue(int v) { nValue = v;}
    public void Register(Object CB)
    {
	System.out.println("Enter");	
	Client.add(CB);
	System.out.println("Exit");
    }

    public static void main(String args[]) 
    { 
        try 
        { 
            ServerClass serv = new ServerClass();  
            Naming.rebind("GetsetServer", serv); 
        } 
        catch (Exception e) 
        { 
            System.out.println("ServerClass err: " + e.getMessage()); 
            e.printStackTrace(); 
        } 
    } 
} 
