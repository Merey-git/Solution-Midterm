package additives;
import coffee.Coffee;
public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate Syrup";
    }
    public double getCost() {
        return coffee.getCost() + 0.7;
    }
}