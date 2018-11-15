package Ch12_CompoundPattern.adapter;

import Ch12_CompoundPattern.duck.Quackable;

/**
 * Created by Yuan Hao on 2018/11/13 15:17
 */
public class GooseAdapter implements Quackable {
  
  private Goose goose;
  
  public GooseAdapter(Goose goose) {
    this.goose = goose;
  }
  
  @Override
  public void quack() {
    goose.honk();
  }
  
  public String toString() {
    return "Goose pretending to be a Duck";
  }
}
