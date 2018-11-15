package Ch12_CompoundPattern.observer;

import java.util.ArrayList;

/**
 * Created by Yuan Hao on 2018/11/13 16:04
 */
public class Observable implements QuackObservable {
  
  private ArrayList<Observer> observers = new ArrayList<>();
  private QuackObservable duck;
  
  Observable(QuackObservable duck) {
    this.duck = duck;
  }
  
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  
  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(duck);
    }
  }
  
}
