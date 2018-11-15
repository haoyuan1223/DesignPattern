package Ch12_CompoundPattern.adapter.decorator;

import Ch12_CompoundPattern.duck.MallardDuck;
import Ch12_CompoundPattern.duck.Quackable;
import Ch12_CompoundPattern.duck.RedheadDuck;
import Ch12_CompoundPattern.duck.RubberDuck;
import Ch12_CompoundPattern.adapter.Goose;
import Ch12_CompoundPattern.adapter.GooseAdapter;

/**
 * Created by Yuan Hao on 2018/11/13 15:24
 */
public class DecoratorSimulator {
  
  public static void main(String[] args) {
    DecoratorSimulator decoratorSimulator = new DecoratorSimulator();
    decoratorSimulator.simulate();
  }
  
  private void simulate() {
    Quackable mallardDuck = new QuackCounter(new MallardDuck());
    Quackable redheadDuck = new QuackCounter(new RedheadDuck());
    Quackable rubberDuck = new QuackCounter(new RubberDuck());
    Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
    
    System.out.println("Duck Simulator: With Decorator");
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(rubberDuck);
    simulate(gooseDuck);
    System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
  }
  
  private void simulate(Quackable quackable) {
    quackable.quack();
  }
}
