package Ch10_StatePattern;

/**
 * Created by Yuan Hao on 2018/10/3 19:50
 */
public interface State {
  
  void insertQuarter();
  
  void ejectQuarter();
  
  void turnCrank();
  
  void dispense();
  
  void refill();
  
}
