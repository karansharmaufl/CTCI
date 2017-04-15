import java.rmi.server.* ;
import java.rmi.* ;
import java.rmi.registry.* ;
import rmi.RMI;
public class RMIServer extends UnicastRemoteObject implements RMI
{
    public RMIServer()throws RemoteException
    {     super();       }
    public String getData(String text)throws RemoteException
    {
        text = "Hi"+text ;
        return text ;
    }
    public static void main(String a[])
    {
            try
            {
                Registry reg = LocateRegistry.createRegistry(1099);
                reg.rebind("server", new RMIServer());
                System.out.println("Server Started");
            }
            catch(Exception e)
            {    System.out.print(e);    }
    }
}
