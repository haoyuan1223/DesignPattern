package Ch10_StatePattern.gumballState;

import Ch10_StatePattern.State;

/**
 * Created by Yuan Hao on 2018/10/3 19:55
 */
public class SoldOutState implements State {
  private GumballMachine gumballMachine;
  
  SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You can't insert a quarter, the machine is sold out");
  }
  
  public void ejectQuarter() {
    System.out.println("You can't eject, you haven't inserted a quarter yet");
  }
  
  public void turnCrank() {
    System.out.println("You turned, but there are no gumballs");
  }
  
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  
  public void refill() {
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  
  public String toString() {
    return "sold out";
  }
}
