package Ch03_DecoratorPattern.decorator.decorated;

public class DarkCoffee extends Beverage{
  
  public DarkCoffee() {
    setDescription("Dark Coffee");
  }
  
  @Override
  public double cost() {
    return 0.99;
  }
}
