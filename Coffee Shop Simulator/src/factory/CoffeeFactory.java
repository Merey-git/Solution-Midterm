package factory;
import coffee.Coffee;
import coffee.Americano;
import coffee.Espresso;
import coffee.Latte;
import coffee.Cappuccino;
import coffee.Mocha;
public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso": return new Espresso();
            case "cappuccino": return new Cappuccino();
            case "latte": return new Latte();
            case "mocha": return new Mocha();
            case "americano": return new Americano();
            default: throw new IllegalArgumentException("Unknown coffee type");
        }
    }
}
