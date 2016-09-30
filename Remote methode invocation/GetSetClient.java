import java.rmi.RMISecurityManager; 
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject;
public class GetSetClient extends UnicastRemoteObject implements IClientCallBack
{ 
    private int nValue = 15;
    public GetSetClient() throws RemoteException {}
    public static void main(String arg[]) 
    { 
        
        System.setSecurityManager(new RMISecurityManager()); 

        try 
        { 
           getSet obj = (getSet)Naming.lookup( "//" + 
                "localhost" + 
                "/GetsetServer");         //objectname in registry 
	   
	   obj.Register(new GetSetClient());
           System.out.println(obj.getValue()); 
	   obj.setValue(11);
	   System.out.println(obj.getValue());
        } 
        catch (Exception e) 
        { 
           System.out.println("HelloClient exception: " + e.getMessage()); 
           e.printStackTrace(); 
        } 
    } 

    public int getValue() { return nValue; } 
    public void setValue(int v) { nValue = v;}
} 
