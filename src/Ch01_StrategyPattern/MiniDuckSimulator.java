package Ch01_StrategyPattern;

import Ch01_StrategyPattern.controllers.FlyRocketPowered;
import Ch01_StrategyPattern.controllers.Quack;
import Ch01_StrategyPattern.controllers.Squeak;
import Ch01_StrategyPattern.views.MallardDuck;
import Ch01_StrategyPattern.views.ModelDuck;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    MallardDuck mallard = new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();
    mallard.swim();
    
    System.out.println();
    
    ModelDuck modelDuck = new ModelDuck();
    modelDuck.display();
    modelDuck.performFly();
    modelDuck.setFlyBehavior(new FlyRocketPowered());
    modelDuck.performFly();
    modelDuck.performQuack();
    modelDuck.setQuackBehavior(new Quack());
    modelDuck.performQuack();
    modelDuck.setQuackBehavior(new Squeak());
    modelDuck.performQuack();
  }
}
