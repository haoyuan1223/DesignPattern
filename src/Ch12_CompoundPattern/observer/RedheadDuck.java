package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:12
 */
public class RedheadDuck implements Quackable {
  private Observable observable;
  
  RedheadDuck() {
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
    return "Redhead Duck";
  }
}
