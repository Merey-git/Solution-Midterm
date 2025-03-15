package additives;

import coffee.Coffee;

public class CinnamonDecorator extends CoffeeDecorator {
    public CinnamonDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", Cinnamon";
    }
    public double getCost() {
        return coffee.getCost() + 0.4;
    }
}