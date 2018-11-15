package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:03
 */
public class Quackologist implements Observer{
  @Override
  public void update(QuackObservable duck) {
    System.out.println("Quackologist: " + duck + " just quacked.");
  }
  
  public String toString() {
    return "Quackologist";
  }
}
