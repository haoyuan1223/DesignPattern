package Ch06_CommandPattern.undo;

public class CeilingFanOffCommand implements Command {
  
  private CeilingFan ceilingFan;
  
  private int preSpeed;
  
  CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }
  
  @Override
  public void execute() {
    preSpeed = ceilingFan.getSpeed();
    ceilingFan.off();
  }
  
  @Override
  public void undo() {
    ceilingFan.undo(preSpeed);
  }
}
