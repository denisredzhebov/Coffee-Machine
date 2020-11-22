package a_coffee_machine;

import a_coffee_machine.container.Container;
import a_coffee_machine.container.PremiumContainer;
import a_coffee_machine.supplies.Beverage;
import a_coffee_machine.supplies.Cappuccino;
import a_coffee_machine.supplies.Espresso;
import a_coffee_machine.supplies.Mochaccino;

public class PremiumCoffeeMachine implements CoffeeMachine {

    private PremiumContainer container;
    private boolean autoRefill;

    public PremiumCoffeeMachine() {
        autoRefill = false;
        container = new PremiumContainer();
    }

    public PremiumCoffeeMachine(boolean autoRefill) {
        this.autoRefill = autoRefill;
        container = new PremiumContainer();
    }

    public Product brew(Beverage beverageToMake, int quantity) {
        if (quantity <= 0 || quantity > 3) {
            return null;
        }
        if (beverageToMake instanceof Cappuccino) {
            if (container.getCurrentCoffee() < 18 * quantity || container.getCurrentMilk() < 150 * quantity) {
                if (autoRefill == false) {
                    return null;
                }
                refill();
            }
        } else if (beverageToMake instanceof Mochaccino) {
            if (container.getCurrentCoffee() < 18 * quantity || container.getCurrentMilk() < 150 * quantity
                    || container.getCurrentCacao() < 10 * quantity) {
                if (autoRefill == false) {
                    return null;
                }
                refill();
            }
        } else if (beverageToMake instanceof Espresso) {
            if (container.getCurrentCoffee() < 10 * quantity || container.getCurrentWater() < 30 * quantity) {
                if (autoRefill == false) {
                    return null;
                }
                refill();
            }
        }
        Product coffees = new Product(beverageToMake, quantity);
        container.makeCoffee(beverageToMake, quantity);
        return coffees;
    }

    @Override
    public Product brew(Beverage beverage) {
        return brew(beverage, 1);
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
