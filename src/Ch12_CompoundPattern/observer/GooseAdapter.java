package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:03
 */
public class GooseAdapter implements Quackable {
  private Goose goose;
  private Observable observable;
  
  GooseAdapter(Goose goose) {
    this.goose = goose;
    this.observable = new Observable(this);
  }
  
  @Override
  public void quack() {
    goose.honk();
    notifyObservers();
  }
  
  @Override
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }
  
  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }
  
  public String toString() {
    return "Goose pretending to be a Duck";
  }
}
