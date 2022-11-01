package Starbucks.Topping;

import Starbucks.Coffee.Beverage;
import Starbucks.Coffee.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,두유";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
