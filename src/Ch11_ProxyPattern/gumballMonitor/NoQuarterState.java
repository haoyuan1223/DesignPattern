package Ch11_ProxyPattern.gumballMonitor;

/**
 * Created by Yuan Hao on 2018/11/10 15:52
 */
public class NoQuarterState implements State {
  
  private static final long serialVersionUID = 2L;
  
  private transient GumballMachine gumballMachine;
  
  NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  @Override
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
  
  public String toString() {
    return "waiting for quarter";
  }
}
