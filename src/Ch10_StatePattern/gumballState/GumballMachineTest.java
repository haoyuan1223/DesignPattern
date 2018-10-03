package Ch10_StatePattern.gumballState;

/**
 * Created by Yuan Hao on 2018/10/3 20:00
 */
public class GumballMachineTest {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(2);
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.ejectQuarter();
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);
    
    gumballMachine.refill(5);
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);
  }
}
