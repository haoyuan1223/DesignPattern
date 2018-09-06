package Ch09_Iterator_Composite.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
  
  private ArrayList<MenuItem> items;
  private int position = 0;
  
  PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
    this.items = items;
  }
  
  @Override
  public boolean hasNext() {
    return position < items.size();
  }
  
  @Override
  public MenuItem next() {
    return items.get(position++);
  }
  
  @Override
  public void remove() {
    if (position <= 0) {
      throw new IllegalStateException("You can't remove an item until you've done at least one next()");
    }
    items.remove(position--);
  }
}
