import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    public void customerTest() {
        Customer customer = new Customer("Firstname Lastname");
        assertEquals("Firstname Lastname", customer.getName());
    }
}