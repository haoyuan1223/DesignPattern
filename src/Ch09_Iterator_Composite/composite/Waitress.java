package Ch09_Iterator_Composite.composite;

import java.util.Iterator;

public class Waitress {
  private MenuComponent allMenus;
  
  Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }
  
  void printMenu() {
    allMenus.print();
  }
  
  void printVegetarianMenu() {
    Iterator<MenuComponent> iterator = allMenus.createIterator();
    
    System.out.println("\nVEGETARIAN MENU\n----");
    while (iterator.hasNext()) {
      MenuComponent menuComponent = iterator.next();
      try {
        if (menuComponent.isVegetarian()) {
          menuComponent.print();
        }
      } catch (UnsupportedOperationException ignored) {
      }
    }
  }
}
