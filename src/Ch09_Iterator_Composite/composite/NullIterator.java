package Ch09_Iterator_Composite.composite;


import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
  @Override
  public boolean hasNext() {
    return false;
  }
  
  @Override
  public MenuComponent next() {
    return null;
  }
}
