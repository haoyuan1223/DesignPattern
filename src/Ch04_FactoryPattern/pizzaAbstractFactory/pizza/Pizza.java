package Ch04_FactoryPattern.pizzaAbstractFactory.pizza;

import Ch04_FactoryPattern.pizzaAbstractFactory.material.*;

public abstract class Pizza {
  private String name;
  Dough dough;
  Sauce sauce;
  Veggies[] veggies;
  Cheese cheese;
  Pepperoni pepperoni;
  Clam clam;
  
  public abstract void prepare();
  
  public void bake() {
    System.out.println("Baking " + name);
  }
  
  public void cut() {
    System.out.println("Cutting " + name);
  }
  
  public void box() {
    System.out.println("Boxing " + name);
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("---- ").append(name).append(" ----\n");
    if (dough != null) {
      result.append(dough);
      result.append("\n");
    }
    if (sauce != null) {
      result.append(sauce);
      result.append("\n");
    }
    if (cheese != null) {
      result.append(cheese);
      result.append("\n");
    }
    if (veggies != null) {
      for (int i = 0; i < veggies.length; i++) {
        result.append(veggies[i]);
        if (i < veggies.length-1) {
          result.append(", ");
        }
      }
      result.append("\n");
    }
    if (clam != null) {
      result.append(clam);
      result.append("\n");
    }
    if (pepperoni != null) {
      result.append(pepperoni);
      result.append("\n");
    }
    return result.toString();
  }
  
}
