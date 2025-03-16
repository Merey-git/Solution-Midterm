package main;
import coffee.Coffee;
import factory.CoffeeFactory;

import java.util.Scanner;

import additives.MilkDecorator;
import additives.ChocolateDecorator;
import additives.WhippedCreamDecorator;
import additives.VanillaDecorator;
import additives.CinnamonDecorator;


public class CoffeeShopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeFactory factory = new CoffeeFactory();

        System.out.println("----- Coffee Shop Simulator -----");
        System.out.print("Choose coffee type (espresso/cappuccino/latte/mocha/americano): ");
        String type = scanner.nextLine();

        Coffee coffee = factory.createCoffee(type);

        System.out.print("Add milk? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.print("Add chocolate syrup? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new ChocolateDecorator(coffee);
        }

        System.out.print("Add whipped cream? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new WhippedCreamDecorator(coffee);
        }

        System.out.print("Add vanilla syrup? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new VanillaDecorator(coffee);
        }

        System.out.print("Add cinnamon? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new CinnamonDecorator(coffee);
        }

        System.out.println("\nYour order:");
        System.out.println("Description: " + coffee.getDescription() + ".");
        System.out.printf("Total cost: $%.2f\n", coffee.getCost());
    }
}