package Ch11_ProxyPattern.gumball;

/**
 * Created by Yuan Hao on 2018/11/10 13:58
 */
public class SoldOutState implements State {
  
  private static final long serialVersionUID = 2L;
  
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
  
  public String toString() {
    return "sold out";
  }
}
