package Ch04_FactoryPattern.pizzaAbstractFactory.pizza;

import Ch04_FactoryPattern.pizzaAbstractFactory.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
  private PizzaIngredientFactory ingredientFactory;
  
  public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  
  public void prepare() {
    System.out.println("Preparing " + getName());
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    veggies = ingredientFactory.createVeggies();
  }
}
