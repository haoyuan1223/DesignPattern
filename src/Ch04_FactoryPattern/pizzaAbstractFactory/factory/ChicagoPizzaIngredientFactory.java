package Ch04_FactoryPattern.pizzaAbstractFactory.factory;

import Ch04_FactoryPattern.pizzaAbstractFactory.material.*;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.cheese.MozzarellaCheese;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.clam.FrozenClam;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.dough.ThickCrustDough;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.pepperoni.SlicedPepperoni;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.sauce.PlumTomatoSauce;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.veggies.BlackOlives;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.veggies.Eggplant;
import Ch04_FactoryPattern.pizzaAbstractFactory.material.veggies.Spinach;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  
  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }
  
  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }
  
  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }
  
  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{ new BlackOlives(), new Spinach(), new Eggplant() };
  }
  
  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
  
  @Override
  public Clam createClam() {
    return new FrozenClam();
  }
}
