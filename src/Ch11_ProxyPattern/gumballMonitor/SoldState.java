package Ch11_ProxyPattern.gumballMonitor;

/**
 * Created by Yuan Hao on 2018/11/10 13:59
 */
public class SoldState implements State{
  
  private static final long serialVersionUID = 2L;
  
  private transient GumballMachine gumballMachine;
  
  SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball");
  }
  
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank");
  }
  
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball!");
  }
  
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      System.out.println("Oops, out of gumballs!");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
  
  public String toString() {
    return "dispensing a gumball";
  }
}
