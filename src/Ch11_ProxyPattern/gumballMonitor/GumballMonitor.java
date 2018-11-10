package Ch11_ProxyPattern.gumballMonitor;

/**
 * Created by Yuan Hao on 2018/11/10 16:02
 */
class GumballMonitor {
  
  private GumballMachine machine;
  
  GumballMonitor(GumballMachine machine) {
    this.machine = machine;
  }
  
  void report() {
    System.out.println("Gumball Machine: " + machine.getLocation());
    System.out.println("Current inventory: " + machine.getCount() + " gumballs");
    System.out.println("Current state: " + machine.getState());
  }
}
