package Ch04_FactoryPattern.pizzaAbstractFactory.store;

import Ch04_FactoryPattern.pizzaAbstractFactory.factory.NYPizzaIngredientFactory;
import Ch04_FactoryPattern.pizzaAbstractFactory.factory.PizzaIngredientFactory;
import Ch04_FactoryPattern.pizzaAbstractFactory.pizza.*;

public class NYPizzaStore extends PizzaStore {
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    switch (item) {
      case "cheese":
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("New York Style Cheese Pizza");
        break;
      case "veggie":
        pizza = new VeggiePizza(ingredientFactory);
        pizza.setName("New York Style Veggie Pizza");
        break;
      case "clam":
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("New York Style Clam Pizza");
        break;
      case "pepperoni":
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("New York Style Pepperoni Pizza");
        break;
    }
    return pizza;
  }
}
