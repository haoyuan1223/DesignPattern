package Ch04_FactoryPattern.pizzaAbstractFactory.pizza;

import Ch04_FactoryPattern.pizzaAbstractFactory.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
  private PizzaIngredientFactory ingredientFactory;
  
  public ClamPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  
  public void prepare() {
    System.out.println("Preparing " + getName());
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clam = ingredientFactory.createClam();
  }
}
