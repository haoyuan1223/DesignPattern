package Ch08_TemplateMethod.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
  
  @Override
  void brew() {
    System.out.println("Dripping Coffee through filter");
  }
  
  @Override
  void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
  
  @Override
  boolean customerWantsCondiments() {
    String answer = null;
    System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException e) {
      System.err.println("IO error trying to read your answer");
    }
    return "y".equalsIgnoreCase(answer);
  }
}
