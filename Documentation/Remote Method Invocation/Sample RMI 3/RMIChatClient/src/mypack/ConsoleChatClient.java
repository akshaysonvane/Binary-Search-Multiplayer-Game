package mypack;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

interface Chat extends Remote
{
	String getMessage(String msg) throws RemoteException;
}

public class ConsoleChatClient
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			Chat ct = (Chat)Naming.lookup("rmi://localhost:1099/conchat");
			String msg = "";
			
			while(!msg.equalsIgnoreCase("quit"))
			{
				System.out.print("\nMsg to server : ");
				msg = scan.nextLine();
				System.out.println("\nMsg from server : "+ct.getMessage(msg));
			}
			System.out.println("\nEnd of chat");
		}
		catch(Exception e)
		{
			System.out.println("\nError : "+e.getMessage());
		}
		scan.close();
	}

}
