package Ch03_DecoratorPattern.decorator.decorated;

public class HouseBlend extends Beverage{
  
  public HouseBlend() {
    setDescription("House Blend Coffee");
  }
  
  @Override
  public double cost() {
    return 0.89;
  }
}
