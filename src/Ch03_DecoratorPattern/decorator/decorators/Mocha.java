package Ch03_DecoratorPattern.decorator.decorators;

import Ch03_DecoratorPattern.decorator.decorated.Beverage;

public class Mocha extends Condiment {
  
  private Beverage beverage;
  
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
  
  @Override
  public double cost() {
    return 0.2 + beverage.cost();
  }
}
