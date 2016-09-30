package mypack;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

interface maths extends Remote
{
	int add(int x, int y) throws RemoteException;
	int sub(int x, int y) throws RemoteException;
}

public class SumServer extends UnicastRemoteObject implements maths 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SumServer() throws RemoteException{}
	
	public int add(int a, int b) throws RemoteException
	{
		return (a + b);
	}
	
	public int sub(int a, int b) throws RemoteException
	{
		return (a - b);
	}
	
	public static void main(String[] args) 
	{
		try
		{
			SumServer ss = new SumServer();
			Registry reg = LocateRegistry.createRegistry(1099);
			
			reg.bind("mymath",ss);
		}
		catch(Exception e)
		{
			System.out.println("\nError : "+e.getMessage());
		}
	}

}
