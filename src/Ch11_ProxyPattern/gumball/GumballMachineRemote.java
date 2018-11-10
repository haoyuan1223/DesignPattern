package Ch11_ProxyPattern.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Yuan Hao on 2018/11/10 13:56
 */
public interface GumballMachineRemote extends Remote {
  
  int getCount() throws RemoteException;
  
  String getLocation() throws RemoteException;
  
  State getState() throws RemoteException;
}
