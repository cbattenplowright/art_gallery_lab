import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer ("James", 5000);
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("James");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(5000);
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(4000);
        assertThat(customer.getWallet()).isEqualTo(4000);
    }

    @Test
    public void canSubtractWallet() {
        customer.subtractWallet(200);
        assertThat(customer.getWallet()).isEqualTo(4800);
    }
}
