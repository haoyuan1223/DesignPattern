package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:11
 */
public class MallardDuck implements Quackable {
  private Observable observable;
  
  MallardDuck() {
    observable = new Observable(this);
  }
  
  public void quack() {
    System.out.println("Quack");
    notifyObservers();
  }
  
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }
  
  public void notifyObservers() {
    observable.notifyObservers();
  }
  
  public String toString() {
    return "Mallard Duck";
  }
}
