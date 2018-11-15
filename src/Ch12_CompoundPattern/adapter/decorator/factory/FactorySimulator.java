package Ch12_CompoundPattern.adapter.decorator.factory;

import Ch12_CompoundPattern.duck.MallardDuck;
import Ch12_CompoundPattern.duck.Quackable;
import Ch12_CompoundPattern.duck.RedheadDuck;
import Ch12_CompoundPattern.duck.RubberDuck;
import Ch12_CompoundPattern.adapter.Goose;
import Ch12_CompoundPattern.adapter.GooseAdapter;

/**
 * Created by Yuan Hao on 2018/11/13 15:31
 */
public class FactorySimulator extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new MallardDuck();
  }
  
  @Override
  public Quackable createRubberDuck() {
    return new RubberDuck();
  }
  
  @Override
  public Quackable createRedHeadDuck() {
    return new RedheadDuck();
  }
  
  @Override
  public Quackable createGooseDuck() {
    return new GooseAdapter(new Goose());
  }
}
