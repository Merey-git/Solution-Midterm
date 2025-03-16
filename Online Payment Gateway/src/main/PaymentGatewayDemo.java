package main;
import java.util.Scanner;
import payment.*;
import factory.PaymentFactory;
import transaction.*;
import adapter.*;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentFactory factory = new PaymentFactory();
        TransactionLog log = new TransactionLog();

        System.out.println("---- Online Payment Gateway ----");
        // Основной цикл — пока пользователь не напишет 'exit'
        while (true) {
            System.out.print("\nEnter payment type (credit/paypal/crypto/bank/applepay or 'exit'): ");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("exit")) break;

            System.out.print("Enter amount: $");
            double amount = Double.parseDouble(scanner.nextLine());

            try {
                PaymentMethod method = factory.createPayment(type);
                boolean success = method.processPayment(amount);
                System.out.println("Status: " + method.getStatus());

                log.add(new Transaction(amount, type, method.getStatus()));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        log.showLog();
    }
}
