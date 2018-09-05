package Ch06_CommandPattern.remote;

public class CeilingFan {
  
  private static final int HIGH = 3;
  private static final int MEDIUM = 2;
  private static final int LOW = 1;
  private static final int OFF = 0;
  private String location;
  private int speed;
  
  public CeilingFan(String location) {
    this.location = location;
  }
  
  public void high() {
    // turns the ceiling fan on to high
    speed = HIGH;
    System.out.println(location + " ceiling fan is on high");
  }
  
  public void medium() {
    // turns the ceiling fan on to medium
    speed = MEDIUM;
    System.out.println(location + " ceiling fan is on medium");
  }
  
  public void low() {
    // turns the ceiling fan on to low
    speed = LOW;
    System.out.println(location + " ceiling fan is on low");
  }
  
  public void off() {
    // turns the ceiling fan off
    speed = OFF;
    System.out.println(location + " ceiling fan is off");
  }
  
  public int getSpeed() {
    return speed;
  }

}
