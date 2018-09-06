package Ch09_Iterator_Composite.iterator;

public class Test {
  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    
    // With iterators
    waitress.printMenu();
    
  }
}
