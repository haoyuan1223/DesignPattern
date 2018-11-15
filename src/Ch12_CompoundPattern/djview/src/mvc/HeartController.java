package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 14:09
 */
public class HeartController implements ControllerInterface {
  
  HeartController(HeartModelInterface model) {
    DJView view = new DJView(this, new HeartAdapter(model));
    view.createView();
    view.createControls();
    view.disableStopMenuItem();
    view.disableStartMenuItem();
  }
  
  public void start() {
  }
  
  public void stop() {
  }
  
  public void increaseBPM() {
  }
  
  public void decreaseBPM() {
  }
  
  public void setBPM(int bpm) {
  }
}