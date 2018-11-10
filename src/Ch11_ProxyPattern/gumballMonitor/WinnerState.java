package Ch11_ProxyPattern.gumballMonitor;

/**
 * Created by Yuan Hao on 2018/11/10 14:01
 */
public class WinnerState implements State {
  
  private static final long serialVersionUID = 2L;
  
  private transient GumballMachine gumballMachine;
  
  WinnerState(GumballMachine gumballMachine) {
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
    System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.releaseBall();
      if (gumballMachine.getCount() > 0) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      } else {
        System.out.println("Oops, out of gumballs!");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      }
    }
  }
  
  public String toString() {
    return "dispensing two gumballs for your quarter, because YOU'RE A WINNER!";
  }
}
