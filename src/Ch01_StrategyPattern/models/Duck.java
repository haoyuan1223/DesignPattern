package Ch01_StrategyPattern.models;

public abstract class Duck {
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;
  
  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }
  
  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
  
  public void performFly(){
    flyBehavior.fly();
  }
  
  public void performQuack(){
    quackBehavior.quack();
  }
  
  public void swim(){
    System.out.println("All ducks float, even decoys!");
  }
}
