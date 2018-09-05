package Ch03_DecoratorPattern.decoratorWithSize.decorated;

public abstract class Beverage {
  private String description = " ";
  
  public enum Size {
    TALL, GRANDE, VENTI
  }
  
  public Beverage() {
    this.size = Size.GRANDE;
  }
  
  private Size size;
  
  public Size getSize() {
    return size;
  }
  
  public void setSize(Size size) {
    this.size = size;
  }
  
  public String getDescription() {
    return size.name() + description;
  }
  
  void setDescription(String description) {
    this.description += description;
  }
  
  public abstract double cost();
  
  protected double setCost(double cost) {
    switch (size) {
      case TALL:
        return cost * 1.2;
      case VENTI:
        return cost * 0.8;
      default:
        return cost;
    }
  }
  
}
