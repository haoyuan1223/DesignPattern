package Ch08_TemplateMethod.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{
  @Override
  void brew() {
    System.out.println("Steeping the tea");
  }
  
  @Override
  void addCondiments() {
    System.out.println("Adding Lemon");
  }
  
  @Override
  boolean customerWantsCondiments() {
    String answer = null;
    System.out.print("Would you like lemon with your tea (y/n)? ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException e) {
      System.err.println("IO error trying to read your answer");
    }
    return "y".equalsIgnoreCase(answer);
  }
}
