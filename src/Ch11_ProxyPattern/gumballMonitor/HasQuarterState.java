package Ch11_ProxyPattern.gumballMonitor;

import java.util.Random;

/**
 * Created by Yuan Hao on 2018/11/10 13:57
 */
public class HasQuarterState implements State {
  
  private static final long serialVersionUID = 2L;
  
  private transient GumballMachine gumballMachine;
  private Random randomWinner = new Random(System.currentTimeMillis());
  
  HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You can't insert another quarter");
  }
  
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  
  public void turnCrank() {
    System.out.println("You turned...");
    int winner = randomWinner.nextInt(10);
    if (winner == 0) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }
  
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  
  public String toString() {
    return "waiting for turn of crank";
  }
}
