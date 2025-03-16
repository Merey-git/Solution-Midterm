package adapter;
public class BankAPI {
    public boolean makeTransaction(double amount) {
        if (amount > 0) {
            System.out.println("BankAPI: Transaction approved by legacy bank system.");
            return true;
        }
        return false;
    }
}
