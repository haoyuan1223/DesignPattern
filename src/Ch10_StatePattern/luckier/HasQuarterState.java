package Ch10_StatePattern.luckier;

import Ch10_StatePattern.State;

import java.util.Random;

/**
 * Created by Yuan Hao on 2018/10/3 19:54
 */
public class HasQuarterState implements State {
  private Random randomLuckier = new Random(System.currentTimeMillis());
  private GumballMachine gumballMachine;
  
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
    int winner = randomLuckier.nextInt(10);
    if ((winner == 0) && (gumballMachine.getCount() > 1)) {
      gumballMachine.setState(gumballMachine.getLuckierState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }
  
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  
  public void refill() {
  }
  
  public String toString() {
    return "waiting for turn of crank";
  }
}
