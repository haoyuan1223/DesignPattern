package Ch06_CommandPattern.simpleRemote;

public class RemoteControlTest {
  public static void main(String[] args) {
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    lightOnCommand.execute();
  }
}
