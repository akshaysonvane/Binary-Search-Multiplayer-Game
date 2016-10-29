package mypack;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

interface Chat extends Remote
{
	String getMessage(String msg) throws RemoteException;
}

public class ConsoleChatServer extends UnicastRemoteObject implements Chat
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConsoleChatServer() throws RemoteException{}
	
	public String getMessage(String msg) throws RemoteException
	{
		if(!msg.equalsIgnoreCase("quit"))
		{
			System.out.println("\nMsg from Client : "+msg);
			Scanner scan = new Scanner(System.in);
			
			System.out.print("\nMsg to client : ");
			msg = scan.nextLine();
			scan.close();
		}
		else
		{
			System.out.println("\nEnd of chat");
		}
		return msg;
	}
	
	public static void main(String[] args) throws RemoteException
	{
		ConsoleChatServer cs = new ConsoleChatServer();
		Registry reg = LocateRegistry.createRegistry(1099);
		try
		{
			reg.bind("conchat", cs);
		}
		catch(Exception e)
		{
			System.out.println("\nError : "+e.getMessage());
		}
		
	}

}
