package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:14
 */
public class RubberDuck implements Quackable {
  private Observable observable;
  
  RubberDuck() {
    observable = new Observable(this);
  }
  
  public void quack() {
    System.out.println("Squeak");
    notifyObservers();
  }
  
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }
  
  public void notifyObservers() {
    observable.notifyObservers();
  }
  
  public String toString() {
    return "Rubber Duck";
  }
}
