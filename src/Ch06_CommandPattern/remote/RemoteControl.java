package Ch06_CommandPattern.remote;

import java.util.Arrays;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;
  
  public RemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    
    Command noCommand = new NoCommand();
    Arrays.fill(onCommands, noCommand);
    Arrays.fill(offCommands, noCommand);
  }
  
  public void setCommand(int index, Command onCommand, Command offCommand){
    onCommands[index] = onCommand;
    offCommands[index] = offCommand;
  }
  
  public void onButtonPressed(int index){
    onCommands[index].execute();
  }
  
  public void offButtonPressed(int index){
    offCommands[index].execute();
  }
}
