package Ch03_DecoratorPattern.decorator.decorated;

public abstract class Beverage {
  private String description = "Unknown Beverage";
  
  public String getDescription() {
    return description;
  }
  
  void setDescription(String description) {
    this.description = description;
  }
  
  public abstract double cost();
  
}
