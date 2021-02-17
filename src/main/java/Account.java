import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private List<Transaction> transactions;
    private Customer customer;

    public Account(Customer customer) {
        this.transactions = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBalance(){
        // TODO: skal debugges
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }
        return sum;
    }

    public int withDrawAmount(int amount) {
        int newSum = 0;
        // TODO: skal kodes og returnere ny saldo. Smid fejl hvis amount > saldo

//        transactions.remove(amount) = newSum
//        getBalance()-withDrawAmount(amount) =newSum;
        return newSum;
    }

    public int depositAmount(int amount){
        int sum;
        // TODO: skal debugges og returnere ny saldo. Smid fejl hvis amount < 0.
        transactions.add(new Transaction(amount, new Date()));
        return amount;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "transactions=" + transactions +
                ", customer=" + customer +
                '}';
    }
}

