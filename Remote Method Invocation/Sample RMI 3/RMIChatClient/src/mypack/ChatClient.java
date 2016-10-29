package mypack;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

interface Chatting extends Remote
{
	String getMessage(String msg) throws RemoteException;
}

public class ChatClient 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			Chatting ct = (Chatting)Naming.lookup("rmi://localhost:1099/str");
			System.out.print("\nEnter string : ");
			System.out.println("\nReverse string : "+ct.getMessage(scan.nextLine()));
		}
		catch(Exception e)
		{
			System.out.println("\nError : "+e.getMessage());
		}
		scan.close();
	}

}
