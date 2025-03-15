package additives;
import coffee.Coffee;
public class VanillaDecorator extends CoffeeDecorator {
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", Vanilla Syrup";
    }
    public double getCost() {
        return coffee.getCost() + 0.6;
    }
}