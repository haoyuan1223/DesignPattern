package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 13:50
 */
public class DJViewTest {
  
  public static void main(String[] args) {
    BeatModelInterface model = new BeatModel();
    ControllerInterface controller = new BeatController(model);
  }
}
