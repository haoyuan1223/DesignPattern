package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 14:06
 */
public class HeartAdapter implements BeatModelInterface {
  private HeartModelInterface heart;
  
  HeartAdapter(HeartModelInterface heart) {
    this.heart = heart;
  }
  
  public void initialize() {
  }
  
  public void on() {
  }
  
  public void off() {
  }
  
  public int getBPM() {
    return heart.getHeartRate();
  }
  
  public void setBPM(int bpm) {
  }
  
  public void registerObserver(BeatObserver o) {
    heart.registerObserver(o);
  }
  
  public void removeObserver(BeatObserver o) {
    heart.removeObserver(o);
  }
  
  public void registerObserver(BPMObserver o) {
    heart.registerObserver(o);
  }
  
  public void removeObserver(BPMObserver o) {
    heart.removeObserver(o);
  }
}

