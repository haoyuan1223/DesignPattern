package Ch06_CommandPattern.remote;

public class HotTub {
  private boolean on;
  private int temperature;
  
  public void on() {
    on = true;
  }
  
  public void off() {
    on = false;
  }
  
  public void circulate() {
    if (on) {
      System.out.println("Hot tub is bubbling!");
    }
  }
  
  public void jetsOn() {
    if (on) {
      System.out.println("Hot tub jets are on");
    }
  }
  
  public void jetsOff() {
    if (on) {
      System.out.println("Hot tub jets are off");
    }
  }
  
  public void setTemperature(int temperature) {
    if (temperature > this.temperature) {
      System.out.println("Hot tub is heating to a steaming " + temperature + " degrees");
    } else {
      System.out.println("Hot tub is cooling to " + temperature + " degrees");
    }
    this.temperature = temperature;
  }
}
