package Ch10_StatePattern.luckier;

import Ch10_StatePattern.State;

/**
 * Created by Yuan Hao on 2018/10/3 19:52
 */
public class NoQuarterState implements State {
  private GumballMachine gumballMachine;
  
  NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }
  
  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter");
  }
  
  public void turnCrank() {
    System.out.println("You turned, but there's no quarter");
  }
  
  public void dispense() {
    System.out.println("You need to pay first");
  }
  
  public void refill() {
  
  }
  
  public String toString() {
    return "waiting for quarter";
  }
}
