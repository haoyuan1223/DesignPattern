package Ch12_CompoundPattern.observer;

import java.util.ArrayList;

/**
 * Created by Yuan Hao on 2018/11/13 16:17
 */
public class Flock implements Quackable {
  private ArrayList<Quackable> ducks = new ArrayList<>();
  
  public void add(Quackable duck) {
    ducks.add(duck);
  }
  
  public void quack() {
    for (Quackable duck : ducks) {
      duck.quack();
    }
  }
  
  public void registerObserver(Observer observer) {
    for (Quackable duck : ducks) {
      duck.registerObserver(observer);
    }
  }
  
  public void notifyObservers() {
  }
  
  public String toString() {
    return "Flock of Ducks";
  }
}
