<<<<<<< HEAD
## 📄 Coffee Shop Simulator – Midterm Project

────────────────────────────────────

## 📌 Project Description:
This Java project simulates a coffee ordering system. It allows users to choose a base coffee drink and dynamically add extra ingredients (toppings) such as milk, chocolate syrup, whipped cream, vanilla, and cinnamon.
=======
## 📄 Online Payment Gateway - Midterm Project

────────────────────────────────────
## 📌 Project Description:
This Java project simulates a simple online payment system. It allows the user to choose different payment methods (Credit Card, PayPal, Cryptocurrency, Bank, Apple Pay), enter the payment amount, and process the transaction. The system logs each transaction and displays its status.
>>>>>>> 0157638 (Midterm)

────────────────────────────────────
## 📐 Applied Design Patterns:

1️⃣ Factory Method Pattern:
<<<<<<< HEAD
- Implemented in CoffeeFactory.java.
- Creates different types of coffee: Espresso, Cappuccino, Latte, Mocha, Americano.

2️⃣ Decorator Pattern:
- Implemented in MilkDecorator, ChocolateDecorator, WhippedCreamDecorator, VanillaDecorator, and CinnamonDecorator.
- Allows dynamic addition of ingredients without modifying the core coffee classes.
- Each decorator changes both the description and cost of the coffee object.
=======
- Class: PaymentFactory.java
- Creates payment method objects dynamically based on user input.
- Supported payment types:
  • credit
  • paypal
  • crypto
  • bank (uses Adapter Pattern)
  • applepay

2️⃣ Adapter Pattern:
- Classes: BankAPI.java + BankPaymentAdapter.java
- Integrates legacy BankAPI into the system without changing existing structure.
- Converts external API interface to internal PaymentMethod interface.
>>>>>>> 0157638 (Midterm)

────────────────────────────────────
## 📂 Project Structure:

<<<<<<< HEAD
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

=======
/payment/
├── PaymentMethod.java          → common interface  
├── CreditCardPayment.java     → Credit Card payment class  
├── PayPalPayment.java         → PayPal payment class  
├── CryptoPayment.java         → Crypto payment class  
├── ApplePayPayment.java       → Apple Pay payment class

/factory/
├── PaymentFactory.java        → Factory Method implementation

/adapter/
├── BankAPI.java               → Simulated legacy bank system  
├── BankPaymentAdapter.java    → Adapter connecting BankAPI to PaymentMethod

/transaction/
├── Transaction.java           → Transaction model  
├── TransactionLog.java        → Transaction history handler

/main/
├── PaymentGatewayDemo.java    → Main program interface

────────────────────────────────────
## Result:
---- Online Payment Gateway ----
Enter payment type (credit/paypal/crypto/bank/applepay or 'exit'): applepay  
Enter amount: $250  
Apple Pay payment processed: $250.0  
Status: Completed

Enter payment type (credit/paypal/crypto/bank/applepay or 'exit'): crypto
Enter amount: $8000
Crypto payment processed: $8000.0
Status: Pending (confirmation on blockchain)

---- Transaction History ----
Amount: $250.0, Method: applepay, Status: Completed  
Amount: $8000.0, Method: crypto, Status: Pending (confirmation on blockchain)

────────────────────────────────────

Author: Kuanyshkhan Merey
>>>>>>> 0157638 (Midterm)
