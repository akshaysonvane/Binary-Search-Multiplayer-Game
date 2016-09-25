import java.rmi.RMISecurityManager; 
import java.rmi.Naming; 
import java.rmi.RemoteException; 
public class GetSetClient 
{ 
    public static void main(String arg[]) 
    { 
        
        System.setSecurityManager(new RMISecurityManager()); 

        try 
        { 
           getSet obj = (getSet)Naming.lookup( "//" + 
                "localhost" + 
                "/GetsetServer");         //objectname in registry 
	   
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
} 
