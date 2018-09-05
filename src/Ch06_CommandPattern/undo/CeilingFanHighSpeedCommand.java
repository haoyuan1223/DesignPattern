package Ch06_CommandPattern.undo;

public class CeilingFanHighSpeedCommand implements Command {
  
  private CeilingFan ceilingFan;
  
  private int preSpeed;
  
  CeilingFanHighSpeedCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }
  
  @Override
  public void execute() {
    preSpeed = ceilingFan.getSpeed();
    ceilingFan.high();
  }
  
  @Override
  public void undo() {
    ceilingFan.undo(preSpeed);
  }
}
