package Ch03_DecoratorPattern.decoratorWithSize.decorated;

public class DarkCoffee extends Beverage {
  
  public DarkCoffee() {
    setDescription("Dark Coffee");
  }
  
  @Override
  public double cost() {
    return setCost(0.99);
  }
}
