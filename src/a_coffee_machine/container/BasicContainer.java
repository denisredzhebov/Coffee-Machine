package a_coffee_machine.container;

public class BasicContainer implements Container {
    private int water;
    private int coffee;

    public BasicContainer() {
        water = 600;
        coffee = 600;
    }

    @Override
    public double getCurrentWater() {
        return water;
    }

    public void refill() {
        water = 600;
        coffee = 600;
    }

    public void makeEspresso() {
        water -= 30;
        coffee -= 10;
    }

    @Override
    public double getCurrentMilk() {
        return 0;
    }

    @Override
    public double getCurrentCoffee() {
        return coffee;
    }

    @Override
    public double getCurrentCacao() {
        return 0;
    }

}
