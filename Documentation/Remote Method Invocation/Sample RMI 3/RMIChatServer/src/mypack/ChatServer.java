package mypack;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

interface Chatting extends Remote
{
	String getMessage(String msg) throws RemoteException;
}

public class ChatServer extends UnicastRemoteObject implements Chatting
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChatServer() throws RemoteException{}
	
	public String getMessage(String msg) throws RemoteException
	{
		StringBuffer sb = new StringBuffer(msg);
		return ""+sb.reverse();
	}
	
	public static void main(String[] args) throws RemoteException
	{
		ChatServer cf = new ChatServer();
		Registry reg = LocateRegistry.createRegistry(1099);
		try
		{
			reg.bind("str", cf);
		}
		catch(Exception e)
		{
			System.out.println("\nError : "+e.getMessage());
		}
		
	}

}
