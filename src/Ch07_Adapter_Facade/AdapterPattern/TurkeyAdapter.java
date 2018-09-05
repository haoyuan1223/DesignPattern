package Ch07_Adapter_Facade.AdapterPattern;

public class TurkeyAdapter implements Duck{
  
  private Turkey turkey;
  
  TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }
  
  @Override
  public void quack() {
    turkey.gobble();
  }
  
  @Override
  public void fly() {
    turkey.fly();
  }
}
