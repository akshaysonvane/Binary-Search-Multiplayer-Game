import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 
public class ServerClass extends UnicastRemoteObject implements getSet
{ 
    public ServerClass() throws RemoteException {} 

    private int nValue = 10;

    public int getValue() { return nValue; } 
    public void setValue(int v) { nValue = v;}

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
