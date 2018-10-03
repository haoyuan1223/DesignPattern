package Ch10_StatePattern.luckier;

import Ch10_StatePattern.State;

/**
 * Created by Yuan Hao on 2018/10/3 20:16
 */
public class GumballMachine {
  
  private State soldOutState;
  private State noQuarterState;
  private State hasQuarterState;
  private State soldState;
  private State luckierState;
  
  private State state;
  private int count;
  
  GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    luckierState = new LuckierState(this);
    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }
  
  void insertQuarter() {
    state.insertQuarter();
  }
  
  void ejectQuarter() {
    state.ejectQuarter();
  }
  
  void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count--;
    }
  }
  
  int getCount() {
    return count;
  }
  
  void refill(int count) {
    this.count += count;
    System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
    state.refill();
  }
  
  void setState(State state) {
    this.state = state;
  }
  
  State getSoldOutState() {
    return soldOutState;
  }
  
  State getNoQuarterState() {
    return noQuarterState;
  }
  
  State getHasQuarterState() {
    return hasQuarterState;
  }
  
  State getSoldState() {
    return soldState;
  }
  
  State getLuckierState() {
    return luckierState;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: ").append(count).append(" gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is ").append(state).append("\n");
    result.append("-----------------------------------------").append("\n");
    return result.toString();
  }
}
