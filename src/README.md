## 📄 Coffee Shop Simulator – Midterm Project

────────────────────────────────────

## 📌 Project Description:
This Java project simulates a coffee ordering system. It allows users to choose a base coffee drink and dynamically add extra ingredients (toppings) such as milk, chocolate syrup, whipped cream, vanilla, and cinnamon.

────────────────────────────────────
## 📐 Applied Design Patterns:

1️⃣ Factory Method Pattern:
- Implemented in CoffeeFactory.java.
- Creates different types of coffee: Espresso, Cappuccino, Latte, Mocha, Americano.

2️⃣ Decorator Pattern:
- Implemented in MilkDecorator, ChocolateDecorator, WhippedCreamDecorator, VanillaDecorator, and CinnamonDecorator.
- Allows dynamic addition of ingredients without modifying the core coffee classes.
- Each decorator changes both the description and cost of the coffee object.

────────────────────────────────────
## 📂 Project Structure:

/coffee/
├── Coffee.java                 → Base interface
├── Espresso.java              → Coffee type
├── Cappuccino.java
├── Latte.java
├── Mocha.java
├── Americano.java

/factory/
├── CoffeeFactory.java         → Factory Method class

/additives/
├── CoffeeDecorator.java       → Abstract decorator
├── MilkDecorator.java
├── ChocolateDecorator.java
├── WhippedCreamDecorator.java
├── VanillaDecorator.java
├── CinnamonDecorator.java

/main/
├── CoffeeShopDemo.java        → Main program interface

────────────────────────────────────
## Result
----- Coffee Shop Simulator -----
Choose coffee type (espresso/cappuccino/latte/mocha/americano): americano
Add milk? (yes/no): no
Add chocolate syrup? (yes/no): yes
Add whipped cream? (yes/no): no
Add vanilla syrup? (yes/no): yes
Add cinnamon? (yes/no): no

Your order:
Description: Americano, Chocolate Syrup, Vanilla Syrup
Total cost: $3.50

────────────────────────────────────

Author: Kuanyshkhan Merey

