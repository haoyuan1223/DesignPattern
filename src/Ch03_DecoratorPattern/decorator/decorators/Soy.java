package Ch03_DecoratorPattern.decorator.decorators;

import Ch03_DecoratorPattern.decorator.decorated.Beverage;

public class Soy extends Condiment {
  
  private Beverage beverage;
  
  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
  
  @Override
  public double cost() {
    return 0.15 + beverage.cost();
  }
}
