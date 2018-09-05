package Ch03_DecoratorPattern.decoratorWithSize.decorators;

import Ch03_DecoratorPattern.decoratorWithSize.decorated.Beverage;

public abstract class Condiment extends Beverage {
  
  @Override
  public abstract String getDescription();
  
}
