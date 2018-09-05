package Ch04_FactoryPattern.pizzaAbstractFactory.factory;

import Ch04_FactoryPattern.pizzaAbstractFactory.material.*;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clam createClam();
}
