package Ch05_SingletonPattern;

public class Singleton3 {

  private static Singleton3 instance = new Singleton3();
  
  private Singleton3(){}
  
  public synchronized static Singleton3 getInstance(){
    return instance;
  }
}
