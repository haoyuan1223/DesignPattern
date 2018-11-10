package Ch11_ProxyPattern.gumball;

import java.rmi.Naming;

/**
 * Created by Yuan Hao on 2018/11/10 14:06
 */
public class GumballMachineTest {
  public static void main(String[] args) {
    GumballMachineRemote gumballMachine;
    int count;
    
    if (args.length < 2) {
      System.out.println("GumballMachine <name> <inventory>");
      System.exit(1);
    }
    
    try {
      count = Integer.parseInt(args[1]);
      gumballMachine = new GumballMachine(args[0], count);
      Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
      System.out.println("Succeed to Rebind \"//" + args[0] + "/gumballmachine\" ");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
