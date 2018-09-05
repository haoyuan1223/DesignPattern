package Ch04_FactoryPattern.pizzaAbstractFactory.factory;

import Ch04_FactoryPattern.pizzaAbstractFactory.material.*;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.cheese.ReggianoCheese;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.clam.FreshClam;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.dough.ThinCrustDough;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.pepperoni.SlicedPepperoni;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.sauce.MarinaraSauce;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.veggies.Garlic;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.veggies.Mushroom;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.veggies.Onion;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }
  
  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }
  
  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }
  
  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
  }
  
  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
  
  @Override
  public Clam createClam() {
    return new FreshClam();
  }
}
