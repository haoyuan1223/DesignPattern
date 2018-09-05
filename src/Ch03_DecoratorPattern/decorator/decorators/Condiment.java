package Ch03_DecoratorPattern.decorator.decorators;

import Ch03_DecoratorPattern.decorator.decorated.Beverage;

public abstract class Condiment extends Beverage {
  
  @Override
  public abstract String getDescription();
  
}
