package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 13:46
 */
public interface ControllerInterface {
  
  void start();
  
  void stop();
  
  void increaseBPM();
  
  void decreaseBPM();
  
  void setBPM(int bpm);
}
