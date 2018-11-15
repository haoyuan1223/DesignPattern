package Ch12_CompoundPattern.adapter.decorator;

import Ch12_CompoundPattern.duck.Quackable;

/**
 * Created by Yuan Hao on 2018/11/13 15:22
 */
public class QuackCounter implements Quackable {
  
  private Quackable duck;
  
  private static int numberOfQuacks = 0;
  
  public QuackCounter(Quackable duck) {
    this.duck = duck;
  }
  
  @Override
  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }
  
  public static int getNumberOfQuacks() {
    return numberOfQuacks;
  }
}
