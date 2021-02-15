import org.junit.jupiter.api.Test;

import java.util.Date;

class Transaction {

    private int amount;
    private Date date;

    public Transaction(int amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}