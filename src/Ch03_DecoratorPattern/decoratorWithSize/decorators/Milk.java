package Ch03_DecoratorPattern.decoratorWithSize.decorators;

import Ch03_DecoratorPattern.decoratorWithSize.decorated.Beverage;

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
    return setCost(0.1) + beverage.cost();
  }
}
