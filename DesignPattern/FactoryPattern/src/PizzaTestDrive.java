
import PizzaStore.CHPizzaStore;
import PizzaStore.NYPizzaStore;
import PizzaStore.PizzaStore;
import pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        System.out.println("Hi");
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza= nyStore.orderPizza("cheese");

        PizzaStore chStore = new CHPizzaStore();
        Pizza pizza1 = chStore.orderPizza("cheese");
    }
}
