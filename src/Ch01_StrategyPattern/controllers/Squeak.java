package Ch01_StrategyPattern.controllers;

import Ch01_StrategyPattern.models.QuackBehavior;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
