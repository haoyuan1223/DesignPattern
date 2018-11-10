package Ch11_ProxyPattern.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Yuan Hao on 2018/11/10 16:08
 */
public class ImageProxy implements Icon {
  private ImageIcon imageIcon;
  private URL imageURL;
  private boolean retrieving;
  
  ImageProxy(URL imageURL) {
    this.imageURL = imageURL;
  }
  
  private synchronized void setImageIcon(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
  }
  
  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    if (imageIcon != null) {
      imageIcon.paintIcon(c, g, x, y);
    } else {
      g.drawString("Loading CD Cover...", x + 300, y + 100);
      if (!retrieving) {
        retrieving = true;
        Thread retrievalThread = new Thread(() -> {
          try {
            setImageIcon(new ImageIcon(imageURL, "CD Cover"));
            c.repaint();
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
        retrievalThread.start();
      }
    }
  }
  
  @Override
  public int getIconWidth() {
    if (imageIcon != null) {
      return imageIcon.getIconWidth();
    } else {
      return 800;
    }
  }
  
  @Override
  public int getIconHeight() {
    if (imageIcon != null) {
      return imageIcon.getIconHeight();
    } else {
      return 600;
    }
  }
}
