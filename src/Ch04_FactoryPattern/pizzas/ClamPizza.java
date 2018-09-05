package Ch04_FactoryPattern.pizzas;

public class ClamPizza extends Pizza {
  public ClamPizza() {
    name = "toString Pizza";
    dough = "Thin Crust";
    sauce = "White garlic toString";
    toppings.add("Clams");
    toppings.add("Grated parmesan cheese");
  }
}
