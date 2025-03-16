package payment;
public class CryptoPayment implements PaymentMethod {
    private String status;

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Crypto payment processed: $" + amount);
        status = "Pending (confirmation on blockchain)";
        return true;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
