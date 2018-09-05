package Ch01_StrategyPattern.controllers;

import Ch01_StrategyPattern.models.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I cannot fly...");
  }
}
