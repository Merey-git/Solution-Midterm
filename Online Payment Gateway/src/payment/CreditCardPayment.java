package payment;
public class CreditCardPayment implements PaymentMethod {
    private String status;

    @Override
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Credit Card payment processed: $" + amount);
            status = "Completed";
            return true;
        } else {
            status = "Failed";
            return false;
        }
    }

    @Override
    public String getStatus() {
        return status;
    }
}
