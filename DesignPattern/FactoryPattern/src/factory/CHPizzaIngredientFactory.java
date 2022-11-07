package factory;

import Ingredient.*;
import Ingredient.Impl.cheese.MozzarellaCheese;
import Ingredient.Impl.clam.FrozenClams;
import Ingredient.Impl.dough.ThinCrustDough;
import Ingredient.Impl.pepperoni.SlicedPepperoni;
import Ingredient.Impl.sauce.PlumTomatoSauce;
import Ingredient.Impl.veggies.*;

public class CHPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
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
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
