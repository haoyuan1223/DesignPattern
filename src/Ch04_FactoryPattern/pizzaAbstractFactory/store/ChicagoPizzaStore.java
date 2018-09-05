package Ch04_FactoryPattern.pizzaAbstractFactory.store;

import Ch04_FactoryPattern.pizzaAbstractFactory.factory.ChicagoPizzaIngredientFactory;
import Ch04_FactoryPattern.pizzaAbstractFactory.factory.PizzaIngredientFactory;
import Ch04_FactoryPattern.pizzaAbstractFactory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
    switch (item) {
      case "cheese":
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
        break;
      case "veggie":
        pizza = new VeggiePizza(ingredientFactory);
        pizza.setName("Chicago Style Veggie Pizza");
        break;
      case "clam":
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("Chicago Style Clam Pizza");
        break;
      case "pepperoni":
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("Chicago Style Pepperoni Pizza");
        break;
    }
    return pizza;
  }
}
