package Ch04_FactoryPattern.pizzas;

public class PizzaStore {
  private SimplePizzaFactory pizzaFactory;
  
  public PizzaStore(SimplePizzaFactory pizzaFactory) {
    this.pizzaFactory = pizzaFactory;
  }
  
  public Pizza createPizza(String type) {
    Pizza pizza = pizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
