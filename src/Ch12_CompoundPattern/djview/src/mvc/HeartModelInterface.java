package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 14:07
 */
public interface HeartModelInterface {
  int getHeartRate();
  
  void registerObserver(BeatObserver o);
  
  void removeObserver(BeatObserver o);
  
  void registerObserver(BPMObserver o);
  
  void removeObserver(BPMObserver o);
}
