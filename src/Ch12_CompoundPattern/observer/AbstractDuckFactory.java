package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 15:29
 */
public abstract class AbstractDuckFactory {

  public abstract Quackable createMallardDuck();
  
  public abstract Quackable createRubberDuck();
  
  public abstract Quackable createRedHeadDuck();
}
