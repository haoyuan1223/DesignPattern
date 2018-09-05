package Ch04_FactoryPattern.pizzas;

public class VeggiePizza extends Pizza {
  public VeggiePizza() {
    name = "Veggie Pizza";
    dough = "Crust";
    sauce = "Marinara mozzarella";
    toppings.add("Shredded mozzarella");
    toppings.add("Grated parmesan");
    toppings.add("Diced onion");
    toppings.add("Sliced mushrooms");
    toppings.add("Sliced red pepper");
    toppings.add("Sliced black olives");
  }
}
