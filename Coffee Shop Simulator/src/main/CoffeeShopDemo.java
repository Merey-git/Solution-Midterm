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
        System.out.print("What would you like? (espresso / cappuccino / latte / mocha / americano): ");
        String type = scanner.nextLine();

        Coffee coffee = factory.createCoffee(type); 
 
        System.out.println("\nGreat choice! Now let’s customize your coffee:");
        
        System.out.print("Would you like to add some creamy milk? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.print("Fancy some rich chocolate syrup? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new ChocolateDecorator(coffee);
        }

        System.out.print("How about fluffy whipped cream on top? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new WhippedCreamDecorator(coffee);
        }

        System.out.print("Add a hint of vanilla sweetness? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new VanillaDecorator(coffee);
        }

        System.out.print("Would you like a sprinkle of cinnamon? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new CinnamonDecorator(coffee);
        }

        System.out.println("\nYour customized coffee order:");
        System.out.println("Description: " + coffee.getDescription() + ".");
        System.out.printf("Total cost: $%.2f\n", coffee.getCost());
        System.out.println("☀️ Enjoy your coffee and have a wonderful day!");
    }
}
