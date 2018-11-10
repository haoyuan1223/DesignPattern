package Ch11_ProxyPattern.virtualProxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Yuan Hao on 2018/11/10 16:17
 */
public class ImageProxyTest {
  private ImageComponent imageComponent;
  private JFrame frame = new JFrame("CD Cover Viewer");
  private Hashtable<String, String> cds = new Hashtable<>();
  
  public static void main(String[] args) throws Exception {
    ImageProxyTest test = new ImageProxyTest();
  }
  
  private ImageProxyTest() throws Exception {
    cds.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
    cds.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
    cds.put("Karma", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
    cds.put("MCMXC A.D.", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
    cds.put("Northern Exposure", "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
    cds.put("Selected Ambient Works, Vol. 2", "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
    
    URL initialURL = new URL(cds.get("Selected Ambient Works, Vol. 2"));
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Favorite CDs");
    menuBar.add(menu);
    frame.setJMenuBar(menuBar);
    
    for (Enumeration<String> e = cds.keys(); e.hasMoreElements(); ) {
      String name = e.nextElement();
      JMenuItem menuItem = new JMenuItem(name);
      menu.add(menuItem);
      menuItem.addActionListener(event -> {
        imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
        frame.repaint();
      });
    }
    
    // set up frame and menus
    Icon icon = new ImageProxy(initialURL);
    imageComponent = new ImageComponent(icon);
    frame.getContentPane().add(imageComponent);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setVisible(true);
    
  }
  
  private URL getCDUrl(String name) {
    try {
      return new URL(cds.get(name));
    } catch (MalformedURLException e) {
      e.printStackTrace();
      return null;
    }
  }
}
