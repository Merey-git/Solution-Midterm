package factory;
import payment.*;
import adapter.*;

public class PaymentFactory {
    public PaymentMethod createPayment(String type) {
        switch(type.toLowerCase()) {
            case "credit":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "crypto":
                return new CryptoPayment();
            case "bank":
                // Legacy система — интеграция через Adapter
                return new BankPaymentAdapter(new BankAPI());
            case "applepay":
                return new ApplePayment();
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
