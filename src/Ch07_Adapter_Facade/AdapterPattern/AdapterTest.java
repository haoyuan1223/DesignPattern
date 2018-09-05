package Ch07_Adapter_Facade.AdapterPattern;

public class AdapterTest {
  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();
    DuckAdapter duckAdapter = new DuckAdapter(mallardDuck);
    duckAdapter.gobble();
    duckAdapter.fly();
    
    WildTurkey turkey = new WildTurkey();
    TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
    turkeyAdapter.quack();
    turkeyAdapter.fly();
  }
}
