package Ch09_Iterator_Composite.iterator;

public interface Iterator<T> {
  boolean hasNext();
  
  T next();
  
  void remove();
}
