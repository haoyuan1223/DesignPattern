package Ch11_ProxyPattern.virtualProxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Yuan Hao on 2018/11/10 16:15
 */
public class ImageComponent extends JComponent {
  private static final long serialVersionUID = 1;
  private Icon icon;
  
  ImageComponent(Icon icon) {
    this.icon = icon;
  }
  
  void setIcon(Icon icon) {
    this.icon = icon;
  }
  
  public void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    int w = icon.getIconWidth();
    int h = icon.getIconHeight();
    int x = (800 - w) / 2;
    int y = (600 - h) / 2;
    icon.paintIcon(this, graphics, x, y);
  }
}
