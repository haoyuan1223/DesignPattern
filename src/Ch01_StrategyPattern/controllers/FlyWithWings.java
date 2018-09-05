package Ch01_StrategyPattern.controllers;

import Ch01_StrategyPattern.models.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I can fly with wings!");
  }
}
