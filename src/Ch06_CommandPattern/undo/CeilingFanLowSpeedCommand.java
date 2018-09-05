package Ch06_CommandPattern.undo;

public class CeilingFanLowSpeedCommand implements Command{
  private CeilingFan ceilingFan;
  private int preSpeed;
  
  public CeilingFanLowSpeedCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }
  
  @Override
  public void execute() {
    preSpeed = ceilingFan.getSpeed();
    ceilingFan.low();
  }
  
  @Override
  public void undo() {
    ceilingFan.undo(preSpeed);
  }
}
