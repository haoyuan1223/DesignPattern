package Ch01_StrategyPattern.controllers;

import Ch01_StrategyPattern.models.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I am flying with a rocket!");
  }
}
