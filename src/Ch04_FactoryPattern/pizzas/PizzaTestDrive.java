package Ch04_FactoryPattern.pizzas;

public class PizzaTestDrive {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza = store.createPizza("cheese");
    System.out.println("We order a " + pizza.getName() + ":");
    System.out.println(pizza);
    pizza = store.createPizza("veggie");
    System.out.println("We order a " + pizza.getName() + ":");
    System.out.println(pizza);
  }
}
