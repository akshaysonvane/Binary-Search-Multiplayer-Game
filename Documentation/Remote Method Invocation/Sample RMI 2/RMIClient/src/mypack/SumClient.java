package mypack;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

interface maths extends Remote
{
	int add(int x, int y) throws RemoteException;
	int sub(int x, int y) throws RemoteException;
}

public class SumClient
{

	public static void main(String[] args)
	{
		try
		{
			maths m = (maths)Naming.lookup("rmi://localhost/mymath");
			System.out.println("\nAdd : "+m.add(10, 20));
			System.out.println("\nSub : "+m.sub(20, 10));
		}
		catch(Exception e)
		{
			System.out.println("\nError : "+e.getMessage());
		}
	}

}
