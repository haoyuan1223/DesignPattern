package Ch03_DecoratorPattern.decorator.decorators;

import Ch03_DecoratorPattern.decorator.decorated.Beverage;

public class Milk extends Condiment {
  
  private Beverage beverage;
  
  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
  
  @Override
  public double cost() {
    return 0.1 + beverage.cost();
  }
}
