package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 14:09
 */
public class HearTest {
  public static void main(String[] args) {
    HeartModel heartModel = new HeartModel();
    ControllerInterface model = new HeartController(heartModel);
  }
}
