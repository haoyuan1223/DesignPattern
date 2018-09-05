package Ch03_DecoratorPattern.decorator.decorators;

import Ch03_DecoratorPattern.decorator.decorated.Beverage;

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
    return 0.1 + beverage.cost();
  }
}
