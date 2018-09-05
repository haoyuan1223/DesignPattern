package Ch06_CommandPattern.undo;

public class CeilingFanMediumSpeedCommand implements Command {
  
  private CeilingFan ceilingFan;
  private int preSpeed;
  
  CeilingFanMediumSpeedCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }
  
  @Override
  public void execute() {
    preSpeed = ceilingFan.getSpeed();
    ceilingFan.medium();
  }
  
  @Override
  public void undo() {
    ceilingFan.undo(preSpeed);
  }
}
