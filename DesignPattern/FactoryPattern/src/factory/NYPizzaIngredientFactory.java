package factory;

import Ingredient.*;
import Ingredient.Impl.cheese.ReggianoCheese;
import Ingredient.Impl.clam.FreshClams;
import Ingredient.Impl.dough.ThinCrustDough;
import Ingredient.Impl.pepperoni.SlicedPepperoni;
import Ingredient.Impl.sauce.MarinaraSauce;
import Ingredient.Impl.veggies.Garlic;
import Ingredient.Impl.veggies.Mushroom;
import Ingredient.Impl.veggies.Onion;
import Ingredient.Impl.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
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
        Veggies veggies[]= {new Garlic(),new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
