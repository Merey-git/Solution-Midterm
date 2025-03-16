package adapter;
import payment.PaymentMethod;

public class BankPaymentAdapter implements PaymentMethod {
    private BankAPI bankAPI;
    private String status;

    public BankPaymentAdapter(BankAPI api) {
        this.bankAPI = api;
    }

    @Override
    public boolean processPayment(double amount) {
        boolean success = bankAPI.makeTransaction(amount); // вызываем старый API
        status = success ? "Completed (via Bank API)" : "Failed";
        return success;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
