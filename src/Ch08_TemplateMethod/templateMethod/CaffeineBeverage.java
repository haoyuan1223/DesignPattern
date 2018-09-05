package Ch08_TemplateMethod.templateMethod;

public abstract class CaffeineBeverage {
  final void prepareRecipe() {
    boilWater();
    brew();
    addCondiments();
    pourInCup();
  }
  
  abstract void brew();
  
  abstract void addCondiments();
  
  void boilWater() {
    System.out.println("Boiling water");
  }
  
  void pourInCup() {
    System.out.println("Pouring into cup");
  }
}
