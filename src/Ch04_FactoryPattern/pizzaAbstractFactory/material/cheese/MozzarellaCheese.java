package Ch04_FactoryPattern.pizzaAbstractFactory.material.cheese;

import Ch04_FactoryPattern.pizzaAbstractFactory.material.Cheese;

public class MozzarellaCheese implements Cheese {
  @Override
  public String toString() {
    return "Shredded Mozzarella";
  }
}
