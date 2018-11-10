package Ch11_ProxyPattern.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Yuan Hao on 2018/11/10 13:52
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
  private static final long serialVersionUID = 2L;
  private State soldOutState;
  private State noQuarterState;
  private State hasQuarterState;
  private State soldState;
  private State winnerState;
  
  private State state;
  private int count;
  private String location;
  
  protected GumballMachine(String location, int numberGumballs) throws RemoteException {
    soldOutState = new SoldOutState();
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);
    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
    this.location = location;
  }
  
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }
  
  void setState(State state) {
    this.state = state;
  }
  
  public State getState() {
    return state;
  }
  
  State getSoldOutState() {
    return soldOutState;
  }
  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  State getHasQuarterState() {
    return hasQuarterState;
  }
  
  State getSoldState() {
    return soldState;
  }
  
  State getWinnerState() {
    return winnerState;
  }
  
  public int getCount() {
    return count;
  }
  
  public String getLocation() {
    return location;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2014");
    result.append("\nInventory: ").append(count).append(" gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is ").append(state).append("\n");
    return result.toString();
  }
}
