package Ch01_StrategyPattern.views;

import Ch01_StrategyPattern.controllers.FlyWithWings;
import Ch01_StrategyPattern.controllers.Quack;
import Ch01_StrategyPattern.models.Duck;

public class MallardDuck extends Duck {
  public MallardDuck(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
  public void display(){
    System.out.println("I am a real Mallard duck");
  }
}
