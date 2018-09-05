package Ch04_FactoryPattern.pizzas;

public class CheesePizza extends Pizza {
  public CheesePizza() {
    name = "toString Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza toString";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}
