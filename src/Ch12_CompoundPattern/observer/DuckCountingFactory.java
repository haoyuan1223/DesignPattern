package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 15:32
 */
public class DuckCountingFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new QuackCounter(new MallardDuck());
  }
  
  @Override
  public Quackable createRubberDuck() {
    return new QuackCounter(new RubberDuck());
  }
  
  @Override
  public Quackable createRedHeadDuck() {
    return new QuackCounter(new RedheadDuck());
  }
  
}
