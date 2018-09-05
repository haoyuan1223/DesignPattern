package Ch06_CommandPattern.undo;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    
    CeilingFan ceilingFan = new CeilingFan();
    
    CeilingFanMediumSpeedCommand ceilingFanMedium = new CeilingFanMediumSpeedCommand(ceilingFan);
    CeilingFanHighSpeedCommand ceilingFanHigh = new CeilingFanHighSpeedCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
    
    remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
    remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
    
    remoteControl.onButtonPushed(0);
    remoteControl.offButtonPushed(0);
    
    remoteControl.undoButtonPushed();
    
    remoteControl.onButtonPushed(1);
    
    remoteControl.undoButtonPushed();
  }
}
