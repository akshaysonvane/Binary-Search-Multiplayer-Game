import java.rmi.*;
		
public interface getSet extends java.rmi.Remote
{
	int getValue() throws RemoteException;
	void setValue(int v) throws RemoteException;
}
