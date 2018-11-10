package Ch11_ProxyPattern.gumball;

import java.io.Serializable;

/**
 * Created by Yuan Hao on 2018/11/10 13:50
 */
public interface State extends Serializable {
  
  void insertQuarter();
  
  void ejectQuarter();
  
  void turnCrank();
  
  void dispense();
}
