package Ch03_DecoratorPattern.decoratorWithSize.decorated;

public class Decaf extends Beverage {
  public Decaf() {
    setDescription("Decaf");
  }
  
  @Override
  public double cost() {
    return setCost(1.05);
  }
}
