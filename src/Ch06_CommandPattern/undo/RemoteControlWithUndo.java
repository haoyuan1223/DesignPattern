package Ch06_CommandPattern.undo;

import java.util.Arrays;

public class RemoteControlWithUndo {
  private Command[] onCommands;
  private Command[] offCommands;
  private Command undo;
  
  RemoteControlWithUndo() {
    Command noCommand = new NoCommand();
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];
    Arrays.fill(onCommands, noCommand);
    Arrays.fill(offCommands, noCommand);
    this.undo = noCommand;
  }
  
  void setCommand(int index, Command onCommand, Command offCommand) {
    onCommands[index] = onCommand;
    offCommands[index] = offCommand;
  }
  
  void onButtonPushed(int index) {
    onCommands[index].execute();
    undo = onCommands[index];
  }
  
  void offButtonPushed(int index) {
    offCommands[index].execute();
    undo = offCommands[index];
  }
  
  void undoButtonPushed() {
    undo.undo();
  }
}
