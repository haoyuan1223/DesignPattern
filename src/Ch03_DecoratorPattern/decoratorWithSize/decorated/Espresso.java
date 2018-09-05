package Ch03_DecoratorPattern.decoratorWithSize.decorated;

public class Espresso extends Beverage {
  
  public Espresso() {
    setDescription("Espresso");
  }
  
  @Override
  public double cost() {
    return setCost(1.99);
  }
}
