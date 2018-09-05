package Ch07_Adapter_Facade.AdapterPattern;

public class DuckAdapter implements Turkey{
  private Duck duck;
  
  DuckAdapter(Duck duck) {
    this.duck = duck;
  }
  
  
  @Override
  public void gobble() {
    duck.quack();
  }
  
  @Override
  public void fly() {
    duck.fly();
  }
}
