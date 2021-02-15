import org.junit.jupiter.api.Test;

import java.util.Objects;


class CustomerTest {


    Customer customer;

    @Test
    public boolean EqualsTrue (Object o) throws Exception {
        if (this == o) {
            return true;
        } else {
            throw new Exception("O doesn't return true");
        }
    }

    @Test
    public boolean EqualsFalse (Object o) throws Exception {
        if (!(o instanceof Customer)) {
            Customer customer = (Customer) o;
        } else {
            throw new Exception("O doesn't return true");
        }
        return Objects.equals(customer.getName(), customer.getName());
    }

    @Test
    public int hashCode() {
        return Objects.hash(customer.getName());
    }




}