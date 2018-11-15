package Ch12_CompoundPattern.adapter.decorator.factory.composite;

import Ch12_CompoundPattern.duck.Quackable;
import Ch12_CompoundPattern.adapter.Goose;
import Ch12_CompoundPattern.adapter.GooseAdapter;
import Ch12_CompoundPattern.adapter.decorator.QuackCounter;
import Ch12_CompoundPattern.adapter.decorator.factory.AbstractDuckFactory;
import Ch12_CompoundPattern.adapter.decorator.factory.DuckCountingFactory;

/**
 * Created by Yuan Hao on 2018/11/13 15:44
 */
public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new DuckCountingFactory();
    simulator.simulate(duckFactory);
  }
  
  private void simulate(AbstractDuckFactory duckFactory) {
    Quackable redheadDuck = duckFactory.createRedHeadDuck();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());
    
    System.out.println("\nDuck Simulator: With Composite - Flocks");
    
    Flock flockOfDucks = new Flock();
    
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);
    
    Flock flockOfMallards = new Flock();
    
    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();
    
    flockOfMallards.add(mallardOne);
    flockOfMallards.add(mallardTwo);
    flockOfMallards.add(mallardThree);
    flockOfMallards.add(mallardFour);
    
    flockOfDucks.add(flockOfMallards);
    
    System.out.println("\nDuck Simulator: Whole Flock Simulation");
    simulate(flockOfDucks);
    
    System.out.println("\nDuck Simulator: Mallard Flock Simulation");
    simulate(flockOfMallards);
    
    System.out.println("\nThe ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
  }
  
  private void simulate(Quackable duck) {
    duck.quack();
  }
  
}
