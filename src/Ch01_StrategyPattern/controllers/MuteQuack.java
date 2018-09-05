package Ch01_StrategyPattern.controllers;

import Ch01_StrategyPattern.models.QuackBehavior;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Silence...");
  }
}
