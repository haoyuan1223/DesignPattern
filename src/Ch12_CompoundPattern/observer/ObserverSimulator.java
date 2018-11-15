package Ch12_CompoundPattern.observer;

/**
 * Created by Yuan Hao on 2018/11/13 16:18
 */
public class ObserverSimulator {
  public static void main(String[] args) {
    ObserverSimulator simulator = new ObserverSimulator();
    AbstractDuckFactory duckFactory = new DuckCountingFactory();
    
    simulator.simulate(duckFactory);
  }
  
  private void simulate(AbstractDuckFactory duckFactory) {
    
    Quackable redheadDuck = duckFactory.createRedHeadDuck();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());
    
    Flock flockOfDucks = new Flock();
    
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);
    
    Flock flockOfMallards = new Flock();
    
    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();
    
    flockOfMallards.add(mallardOne);
    flockOfMallards.add(mallardTwo);
    flockOfMallards.add(mallardThree);
    flockOfMallards.add(mallardFour);
    
    flockOfDucks.add(flockOfMallards);
    
    System.out.println("Duck Simulator: With Observer");
    
    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);
    
    simulate(flockOfDucks);
    
    System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
  }
  
  private void simulate(Quackable duck) {
    duck.quack();
  }
}
