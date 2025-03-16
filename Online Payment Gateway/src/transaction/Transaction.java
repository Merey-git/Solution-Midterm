package transaction;
public class Transaction {
    private double amount;
    private String method;
    private String status;

    public Transaction(double amount, String method, String status) {
        this.amount = amount;
        this.method = method;
        this.status = status;
    }

    public String toString() {
        return "Amount: $" + amount + ", Method: " + method + ", Status: " + status;
    }
}
