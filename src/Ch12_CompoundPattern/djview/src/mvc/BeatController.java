package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 13:49
 */
public class BeatController implements ControllerInterface {
  private BeatModelInterface model;
  private DJView view;
  
  BeatController(BeatModelInterface model) {
    this.model = model;
    view = new DJView(this, model);
    view.createView();
    view.createControls();
    view.disableStopMenuItem();
    view.enableStartMenuItem();
    model.initialize();
  }
  
  public void start() {
    model.on();
    view.disableStartMenuItem();
    view.enableStopMenuItem();
  }
  
  public void stop() {
    model.off();
    view.disableStopMenuItem();
    view.enableStartMenuItem();
  }
  
  public void increaseBPM() {
    int bpm = model.getBPM();
    model.setBPM(bpm + 1);
  }
  
  public void decreaseBPM() {
    int bpm = model.getBPM();
    model.setBPM(bpm - 1);
  }
  
  public void setBPM(int bpm) {
    model.setBPM(bpm);
  }
}