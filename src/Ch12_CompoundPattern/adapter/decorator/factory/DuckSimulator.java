package Ch12_CompoundPattern.adapter.decorator.factory;

import Ch12_CompoundPattern.duck.Quackable;
import Ch12_CompoundPattern.adapter.decorator.QuackCounter;

/**
 * Created by Yuan Hao on 2018/11/13 15:33
 */
public class DuckSimulator {
  
  public static void main(String[] args) {
    DuckSimulator duckSimulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new FactorySimulator();
    AbstractDuckFactory duckCountingFactory = new DuckCountingFactory();
    duckSimulator.simulate(duckFactory);
    duckSimulator.simulate(duckCountingFactory);
  }
  
  private void simulate(AbstractDuckFactory abstractDuckFactory) {
    Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
    Quackable redHeadDuck = abstractDuckFactory.createRedHeadDuck();
    Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
    Quackable gooseDuck = abstractDuckFactory.createGooseDuck();
    System.out.println("Duck Simulator: With Abstract Factory");
    
    simulate(mallardDuck);
    simulate(rubberDuck);
    simulate(redHeadDuck);
    simulate(gooseDuck);
    System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
  }
  
  private void simulate(Quackable duck) {
    duck.quack();
  }
}
