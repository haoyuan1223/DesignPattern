package Ch10_StatePattern.luckier;

/**
 * Created by Yuan Hao on 2018/10/3 20:15
 */
public class GumballMachineTest {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(10);
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
  }
}
