package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:01
 */
public interface QuackObservable {
  
  void registerObserver(Observer observer);
  
  void notifyObservers();
}
