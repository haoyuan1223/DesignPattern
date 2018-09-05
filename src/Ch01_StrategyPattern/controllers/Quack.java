package Ch01_StrategyPattern.controllers;

import Ch01_StrategyPattern.models.QuackBehavior;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
