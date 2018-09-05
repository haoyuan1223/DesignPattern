package Ch06_CommandPattern.undo;

public interface Command {
  void execute();
  
  void undo();
}
