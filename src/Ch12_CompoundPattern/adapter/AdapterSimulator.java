package Ch12_CompoundPattern.adapter;

import Ch12_CompoundPattern.duck.MallardDuck;
import Ch12_CompoundPattern.duck.Quackable;
import Ch12_CompoundPattern.duck.RedheadDuck;
import Ch12_CompoundPattern.duck.RubberDuck;

/**
 * Created by Yuan Hao on 2018/11/13 15:19
 */
public class AdapterSimulator {
  public static void main(String[] args) {
    AdapterSimulator adapterSimulator = new AdapterSimulator();
    adapterSimulator.simulate();
  }
  
  private void simulate() {
    Quackable mallardDuck = new MallardDuck();
    Quackable redheadDuck = new RedheadDuck();
    Quackable rubberDuck = new RubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());
    
    System.out.println("Duck Simulator: With Goose Adapter");
    
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(rubberDuck);
    simulate(gooseDuck);
  }
  
  private void simulate(Quackable duck) {
    duck.quack();
  }
}
