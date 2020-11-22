package a_coffee_machine;

import a_coffee_machine.supplies.Beverage;
import a_coffee_machine.supplies.Cappuccino;
import a_coffee_machine.supplies.Espresso;
import a_coffee_machine.supplies.Mochaccino;

public class Product {
    private Beverage beverage;
    private int quantity;
    private int luckNumber = -1;

    private String[] lucks = { "If at first you don't succeed call it version 1.0.",
            "Today you will make magic happen!", "Have you tried turning it off and on again?",
            "Life would be much more easier if you had the source code." };

    public Product(Beverage beverageToMake) {
        this.beverage = new Espresso();
        quantity = 1;
    }

    public Product(Beverage beverageToMake, int quantity) {
        luckNumber++;
        if (beverageToMake instanceof Cappuccino) {
            this.beverage = new Cappuccino();
        } else if (beverageToMake instanceof Mochaccino) {
            this.beverage = new Mochaccino();
        } else if (beverageToMake instanceof Espresso) {
            this.beverage = new Espresso();
        }
        this.quantity = quantity;

        if (luckNumber == 4) {
            luckNumber = 0;
        }
    }

    public String getName() {
        return beverage.getName();
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLuck() {
        return lucks[luckNumber];
    }
}
