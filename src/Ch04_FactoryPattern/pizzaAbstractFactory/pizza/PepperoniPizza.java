package Ch04_FactoryPattern.pizzaAbstractFactory.pizza;

import Ch04_FactoryPattern.pizzaAbstractFactory.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
  private PizzaIngredientFactory ingredientFactory;
  
  public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  
  public void prepare() {
    System.out.println("Preparing " + getName());
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    veggies = ingredientFactory.createVeggies();
    pepperoni = ingredientFactory.createPepperoni();
  }
}
