import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Customer c1;
    Account account;



    @BeforeEach
    void setUp() {
        c1 = new Customer("Jon");
        account = new Account(c1);
        int newBalance = account.depositAmount(125);

    }

    @Test
    void getCustomer() {


    }

    @Test
    void getBalance() {
        assertEquals(125, account.getBalance());
    }

    @Test
    public int withDrawAmount(int amount) throws Exception{

        // TODO: skal kodes og returnere ny saldo. Smid fejl hvis amount > saldo
        int depositAmount= - 125;
        int sum = 0;
        if (depositAmount > sum) {
            throw new Exception("amount is not bigger than saldo");
        }
        return 0;
    }

    // TODO: skal debugges og returnere ny saldo. Smid fejl hvis amount < 0.
    @Test
    void depositAmount() throws Exception{
        int depositAmount= - 125;
        int sum = 0;
        if (depositAmount < sum) {
            throw new Exception("amount is not bigger than 0");
        }
    }

    @Test
    void getTransactions() {
    }
}