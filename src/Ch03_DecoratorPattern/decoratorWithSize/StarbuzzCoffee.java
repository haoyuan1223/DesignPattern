package Ch03_DecoratorPattern.decoratorWithSize;

import Ch03_DecoratorPattern.decoratorWithSize.decorated.*;
import Ch03_DecoratorPattern.decoratorWithSize.decorators.Milk;
import Ch03_DecoratorPattern.decoratorWithSize.decorators.Mocha;
import Ch03_DecoratorPattern.decoratorWithSize.decorators.Soy;
import Ch03_DecoratorPattern.decoratorWithSize.decorators.Whip;

public class StarbuzzCoffee {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    
    Beverage beverage1 = new DarkCoffee();
    beverage1.setSize(Beverage.Size.VENTI);
    beverage1 = new Milk(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()));
    
    Beverage beverage2 = new HouseBlend();
    beverage2.setSize(Beverage.Size.TALL);
    beverage2 = new Soy(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));
    
    Beverage beverage3 = new Decaf();
    System.out.println(beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost()));
  }
}
