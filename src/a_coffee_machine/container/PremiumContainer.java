package a_coffee_machine.container;

import a_coffee_machine.supplies.Beverage;
import a_coffee_machine.supplies.Cappuccino;
import a_coffee_machine.supplies.Espresso;
import a_coffee_machine.supplies.Mochaccino;

public class PremiumContainer implements Container {
    private int water;
    private int coffee;
    private int milk;
    private int cacao;

    public PremiumContainer() {
        water = 1000;
        coffee = 1000;
        milk = 1000;
        cacao = 300;
    }

    @Override
    public double getCurrentWater() {
        return water;
    }

    @Override
    public double getCurrentMilk() {
        return milk;
    }

    @Override
    public double getCurrentCoffee() {
        return coffee;
    }

    @Override
    public double getCurrentCacao() {
        return cacao;
    }

    public void refill() {
        water = 1000;
        coffee = 1000;
        milk = 1000;
        cacao = 300;
    }

    public void makeCoffee(Beverage beverage, int quantity) {
        if (beverage instanceof Espresso) {
            for (int i = 0; i < quantity; i++) {
                makeEspresso();
            }
        } else if (beverage instanceof Cappuccino) {
            for (int i = 0; i < quantity; i++) {
                makeCappuccino();
            }
        } else if (beverage instanceof Mochaccino) {
            for (int i = 0; i < quantity; i++) {
                makeMochaccino();
            }
        }
    }

    public void makeEspresso() {
        coffee -= 10;
        water -= 30;
    }

    public void makeCappuccino() {
        coffee -= 18;
        milk -= 150;

    }

    public void makeMochaccino() {
        coffee -= 18;
        milk -= 150;
        cacao -= 10;
    }

}
