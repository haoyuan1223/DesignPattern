package Ch11_ProxyPattern.gumballMonitor;

import java.io.Serializable;

/**
 * Created by Yuan Hao on 2018/11/10 15:51
 */
public interface State extends Serializable {
  
  void insertQuarter();
  
  void ejectQuarter();
  
  void turnCrank();
  
  void dispense();
}
