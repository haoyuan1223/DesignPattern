package Ch04_FactoryPattern.pizzas;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<>();
  
  public String getName() {
    return name;
  }
  
  public void prepare() {
    System.out.println("Preparing " + name);
  }
  
  public void bake() {
    System.out.println("Baking " + name);
  }
  
  public void cut() {
    System.out.println("Cutting " + name);
  }
  
  public void box() {
    System.out.println("Boxing " + name);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("----").append(name).append("-----\n");
    sb.append(dough).append("\n");
    sb.append(sauce).append("\n");
    toppings.forEach(topping -> sb.append(topping).append("\n"));
    return sb.toString();
  }
}
