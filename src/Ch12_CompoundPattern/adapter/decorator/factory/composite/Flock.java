package Ch12_CompoundPattern.adapter.decorator.factory.composite;

import Ch12_CompoundPattern.duck.Quackable;

import java.util.ArrayList;

/**
 * Created by Yuan Hao on 2018/11/13 15:40
 */
public class Flock implements Quackable {
  
  private ArrayList<Quackable> ducks = new ArrayList<>();
  
  public void add(Quackable duck) {
    ducks.add(duck);
  }
  
  @Override
  public void quack() {
    for (Quackable duck : ducks) {
      duck.quack();
    }
  }
  
  public String toString() {
    return "Flock of Quackers";
  }
}
