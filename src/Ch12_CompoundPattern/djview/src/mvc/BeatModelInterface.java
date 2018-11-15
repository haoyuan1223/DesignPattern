package mvc;

/**
 * Created by Yuan Hao on 2018/11/15 13:35
 */
public interface BeatModelInterface {
  
  void initialize();
  
  void on();
  
  void off();
  
  void setBPM(int bpm);
  
  int getBPM();
  
  void registerObserver(BeatObserver o);
  
  void removeObserver(BeatObserver o);
  
  void registerObserver(BPMObserver o);
  
  void removeObserver(BPMObserver o);
  
}
