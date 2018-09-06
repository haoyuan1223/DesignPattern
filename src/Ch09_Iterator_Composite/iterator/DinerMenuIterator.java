package Ch09_Iterator_Composite.iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
  
  private MenuItem[] items;
  private int position = 0;
  
  DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }
  
  @Override
  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }
  
  @Override
  public MenuItem next() {
    return items[position++];
  }
  
  @Override
  public void remove() {
    if (position <= 0) {
      throw new IllegalStateException("You can't remove an item until you've done at least one next()");
    }
    if (items[position - 1] != null) {
      if (items.length - 1 - position - 1 >= 0)
        System.arraycopy(items, position, items, position - 1, items.length - 1 - position - 1);
      items[items.length - 1] = null;
    }
  }
}
