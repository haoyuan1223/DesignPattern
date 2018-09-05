package Ch04_FactoryPattern.pizzaAbstractFactory.material.clam;

import Ch04_FactoryPattern.pizzaAbstractFactory.material.Clam;

public class FreshClam implements Clam {
  @Override
  public String toString() {
    return "Fresh Clams from Long Island Sound";
  }
}
