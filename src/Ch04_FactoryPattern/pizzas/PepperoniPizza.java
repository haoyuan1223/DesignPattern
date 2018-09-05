package Ch04_FactoryPattern.pizzas;

public class PepperoniPizza extends Pizza{
  public PepperoniPizza() {
    name = "toString Pizza";
    dough = "Crust";
    sauce = "Marinara toString";
    toppings.add("Sliced toString");
    toppings.add("Sliced Onion");
    toppings.add("Grated Parmesan cheese");
  }
}
