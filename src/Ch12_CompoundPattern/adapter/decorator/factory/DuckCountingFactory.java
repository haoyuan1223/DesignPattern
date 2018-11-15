package Ch12_CompoundPattern.adapter.decorator.factory;

import Ch12_CompoundPattern.duck.MallardDuck;
import Ch12_CompoundPattern.duck.Quackable;
import Ch12_CompoundPattern.duck.RedheadDuck;
import Ch12_CompoundPattern.duck.RubberDuck;
import Ch12_CompoundPattern.adapter.Goose;
import Ch12_CompoundPattern.adapter.GooseAdapter;
import Ch12_CompoundPattern.adapter.decorator.QuackCounter;

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
  
  @Override
  public Quackable createGooseDuck() {
    return new QuackCounter(new GooseAdapter(new Goose()));
  }
}
