package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:10
 */
public class QuackCounter implements Quackable{
  private Quackable duck;
  private static int numberOfQuacks;
  
  QuackCounter(Quackable duck) {
    this.duck = duck;
  }
  
  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }
  
  static int getQuacks() {
    return numberOfQuacks;
  }
  
  public void registerObserver(Observer observer) {
    duck.registerObserver(observer);
  }
  
  public void notifyObservers() {
    duck.notifyObservers();
  }
  
  public String toString() {
    return duck.toString();
  }
}
