package Ch08_TemplateMethod.simple;

public class Test {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    System.out.println("Making tea...");
    tea.prepareRecipe();
    System.out.println("Making coffee...");
    coffee.prepareRecipe();
  }
}
