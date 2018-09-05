package Ch06_CommandPattern.undo;

public class CeilingFan {
  private static final int OFF = 0;
  private static final int LOW = 1;
  private static final int MEDIUM = 2;
  private static final int HIGH = 3;
  
  private int speed;
  
  CeilingFan() {
    speed = OFF;
  }
  
  void high() {
    speed = HIGH;
    System.out.println("CeilingFan{" + "speed=" + speed + '}');
  }
  
  void medium() {
    speed = MEDIUM;
    System.out.println("CeilingFan{" + "speed=" + speed + '}');
  }
  
  void low() {
    speed = LOW;
    System.out.println("CeilingFan{" + "speed=" + speed + '}');
  }
  
  void off() {
    speed = OFF;
    System.out.println("CeilingFan{" + "speed=" + speed + '}');
  }
  
  int getSpeed() {
    return speed;
  }
  
  void undo(int preSpeed) {
    switch (preSpeed) {
      case CeilingFan.HIGH:
        high();
        break;
      case CeilingFan.LOW:
        low();
        break;
      case CeilingFan.MEDIUM:
        medium();
        break;
      default:
        off();
        break;
    }
  }
}
