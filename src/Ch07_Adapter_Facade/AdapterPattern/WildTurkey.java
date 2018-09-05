package Ch07_Adapter_Facade.AdapterPattern;

public class WildTurkey implements Turkey{
  @Override
  public void gobble() {
    System.out.println("Gobble");
  }
  
  @Override
  public void fly() {
    System.out.println("fly~");
  }
}
