package ds.abstractFactory;


class PizzaStoryAF {

  public interface PizzaIngredientFactory {

  	public Dough createDough();
  	public Sauce createSauce();
  	public Cheese createCheese();
  	public Veggies[] createVeggies();
  	public Pepperoni createPepperoni();
  	public Clams createClam();

  }

  public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  	public Dough createDough() {
  		return new ThickCrustDough();
  	}

  	public Sauce createSauce() {
  		return new PlumTomatoSauce();
  	}

  	public Cheese createCheese() {
  		return new MozzarellaCheese();
  	}

  	public Veggies[] createVeggies() {
  		Veggies veggies[] = { new BlackOlives(),
  		                      new Spinach(),
  		                      new Eggplant() };
  		return veggies;
  	}

  	public Pepperoni createPepperoni() {
  		return new SlicedPepperoni();
  	}

  	public Clams createClam() {
  		return new FrozenClams();
  	}
  }
}
