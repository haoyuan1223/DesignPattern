package Ch03_DecoratorPattern.decoratorWithSize.decorated;

public class HouseBlend extends Beverage {
  
  public HouseBlend() {
    setDescription("House Blend Coffee");
  }
  
  @Override
  public double cost() {
    return setCost(0.89);
  }
}
