package Ch08_TemplateMethod.simple;

public class Tea {
  
  void prepareRecipe() {
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
  
  private void boilWater() {
    System.out.println("Boiling water");
  }
  
  private void steepTeaBag() {
    System.out.println("Steeping the tea");
  }
  
  private void addLemon() {
    System.out.println("Adding Lemon");
  }
  
  private void pourInCup() {
    System.out.println("Pouring into cup");
  }
}
