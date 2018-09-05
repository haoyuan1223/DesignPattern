package Ch03_DecoratorPattern.decoratorWithSize.decorators;

import Ch03_DecoratorPattern.decoratorWithSize.decorated.Beverage;

public class Whip extends Condiment {
  
  private Beverage beverage;
  
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
  
  @Override
  public double cost() {
    return setCost(0.1) + beverage.cost();
  }
}
