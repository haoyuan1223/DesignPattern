package Ch11_ProxyPattern.gumball;

import java.rmi.Naming;

/**
 * Created by Yuan Hao on 2018/11/10 14:08
 */
public class GumballMonitorTest {
  public static void main(String[] args) {
    String[] location = {
        "rmi://localhost/gumballmachine",
        "rmi://santafe.mightygumball.com/gumballmachine",
        "rmi://boulder.mightygumball.com/gumballmachine",
        "rmi://seattle.mightygumball.com/gumballmachine"
    };
    
    if (args.length > 0) {
      location = new String[1];
      location[0] = "rmi://" + args[0] + "/gumballmachine";
      System.out.println(location[0]);
    }
    
    GumballMonitor[] monitor = new GumballMonitor[location.length];
    
    for (int i = 0; i < location.length; i++) {
      try {
        GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
        monitor[i] = new GumballMonitor(machine);
        monitor[i].report();
        System.out.println(monitor[i]);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
