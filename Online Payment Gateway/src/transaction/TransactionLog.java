package transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionLog {
    private List<Transaction> log = new ArrayList<>();

    public void add(Transaction t) {
        log.add(t);
    }

    public void showLog() {
        System.out.println("\n=== Transaction History ===");
        for (Transaction t : log) {
            System.out.println(t);
        }
    }
}

