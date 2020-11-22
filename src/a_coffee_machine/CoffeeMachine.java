package a_coffee_machine;

import a_coffee_machine.container.Container;
import a_coffee_machine.supplies.Beverage;

public interface CoffeeMachine {
    /**
     * If the Coffee Machine was able to successfully make the beverage it returns a
     * Product instance that represents the actual beverage. Otherwise, it returns
     * null.
     */

    Product brew(Beverage beverage);

    /**
     * Returns the Container of the Coffee Machine
     */
    Container getSupplies();

    /**
     * Reffils the Container of the Coffee Machine with its default values
     */
    void refill();
}
