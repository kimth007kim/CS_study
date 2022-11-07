package Starbucks.Topping;

import Starbucks.Coffee.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,휘핑 크림";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.1;
    }
}
