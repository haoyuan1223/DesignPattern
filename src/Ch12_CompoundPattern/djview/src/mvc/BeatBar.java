package mvc;

import javax.swing.*;

/**
 * Created by Yuan Hao on 2018/11/15 13:47
 */
public class BeatBar extends JProgressBar implements Runnable {
  private static final long serialVersionUID = 2L;
  
  BeatBar() {
    Thread thread = new Thread(this);
    setMaximum(100);
    thread.start();
  }
  
  public void run() {
      int value = getValue();
      value = (int) (value * .75);
      setValue(value);
      repaint();
      try {
        Thread.sleep(50);
      } catch (Exception ignored) {
      }
  }
}
