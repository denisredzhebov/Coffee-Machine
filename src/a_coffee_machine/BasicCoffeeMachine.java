package a_coffee_machine;

import a_coffee_machine.container.BasicContainer;
import a_coffee_machine.container.Container;
import a_coffee_machine.supplies.Beverage;
import a_coffee_machine.supplies.Espresso;

public class BasicCoffeeMachine implements CoffeeMachine {

    private BasicContainer container;

    public BasicCoffeeMachine() {
        container = new BasicContainer();
    }

    @Override
    public Product brew(Beverage beverage) {
        if (beverage instanceof Espresso && container.getCurrentWater() >= 30 && container.getCurrentCoffee() >= 10) {
            Product espresso = new Product(beverage);
            container.makeEspresso();
            return espresso;
        }
        return null;
    }

    @Override
    public Container getSupplies() {
        return container;
    }

    @Override
    public void refill() {
        container.refill();
    }

}
