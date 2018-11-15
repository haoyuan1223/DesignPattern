package Ch12_CompoundPattern.duck;

/**
 * Created by Yuan Hao on 2018/11/13 15:13
 */
public class DuckSimulator {
  public static void main(String[] args) {
    simulate();
  }
  
  private static void simulate() {
    Quackable mallardDuck = new MallardDuck();
    Quackable redheadDuck = new RedheadDuck();
    Quackable rubberDuck = new RubberDuck();
    System.out.println("Duck Simulator");
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(rubberDuck);
  }
  
  private static void simulate(Quackable duck) {
    duck.quack();
  }
}
