package Starbucks.Topping;

import Starbucks.Coffee.Beverage;
import Starbucks.Coffee.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,모카";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}
