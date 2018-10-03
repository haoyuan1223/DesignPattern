package Ch10_StatePattern.luckier;

import Ch10_StatePattern.State;

/**
 * Created by Yuan Hao on 2018/10/3 20:11
 */
public class LuckierState implements State {
  private GumballMachine gumballMachine;
  
  LuckierState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a Gumball");
  }
  
  public void ejectQuarter() {
    System.out.println("Please wait, we're already giving you a Gumball");
  }
  
  public void turnCrank() {
    System.out.println("Turning again doesn't get you another gumball!");
  }
  
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.releaseBall();
      System.out.println("YOU'RE A LUCKIER! You got two gumballs for your quarter");
      if (gumballMachine.getCount() > 0) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      } else {
        System.out.println("Oops, out of gumballs!");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      }
    }
  }
  
  public void refill() {
  }
  
  public String toString() {
    return "dispensing two gumballs for your quarter, because YOU'RE A LUCKIER!";
  }
}
