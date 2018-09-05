package Ch01_StrategyPattern.views;

import Ch01_StrategyPattern.controllers.FlyNoWay;
import Ch01_StrategyPattern.controllers.MuteQuack;
import Ch01_StrategyPattern.models.Duck;

public class ModelDuck extends Duck {
  public ModelDuck() {
    quackBehavior = new MuteQuack();
    flyBehavior = new FlyNoWay();
  }
  
  public void display() {
    System.out.println("I am a model duck.");
  }
}
