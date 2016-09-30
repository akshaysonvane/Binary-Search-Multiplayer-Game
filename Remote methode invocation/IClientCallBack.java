import java.rmi.*;
		
public interface IClientCallBack extends java.rmi.Remote
{
	int getValue() throws RemoteException;
	void setValue(int v) throws RemoteException;
}