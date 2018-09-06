package Ch09_Iterator_Composite.iterator;

public class MenuItem {
  private String name;
  private String description;
  private boolean vegetarian;
  private double price;
  
  MenuItem(String name,
           String description,
           boolean vegetarian,
           double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }
  
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
  
  double getPrice() {
    return price;
  }
  
  boolean isVegetarian() {
    return vegetarian;
  }
  
  public String toString() {
    return (name + ", $" + price + "\n   " + description);
  }
}
