package Ch09_Iterator_Composite.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
  
  private Stack<Iterator<MenuComponent>> stack = new Stack<>();
  
  CompositeIterator(Iterator<MenuComponent> iterator) {
    stack.push(iterator);
  }
  
  @Override
  public boolean hasNext() {
    if (stack.isEmpty()) {
      return false;
    } else {
      Iterator<MenuComponent> iterator = stack.peek();
      if (!iterator.hasNext()) {
        stack.pop();
        return hasNext();
      } else {
        return true;
      }
    }
  }
  
  @Override
  public MenuComponent next() {
    if (hasNext()) {
      Iterator<MenuComponent> iterator = stack.peek();
      MenuComponent component = iterator.next();
      stack.push(component.createIterator());
      return component;
    } else {
      return null;
    }
  }
}
