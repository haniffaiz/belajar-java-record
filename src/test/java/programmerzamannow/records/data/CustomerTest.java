package programmerzamannow.records.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void createNewRecord() {
        var customer = new Customer("1", "Hanif", "hanif@localhost", "0811123456");
        assertNotNull(customer);

        System.out.println(customer);
    }

    @Test
    void getProperty() {
        var customer = new Customer("1", "Hanif", "hanif@localhost", "0811123456");
        assertNotNull(customer);
        assertEquals("1", customer.id());
        assertEquals("Hanif", customer.name());
        assertEquals("hanif@localhost", customer.email());
        assertEquals("0811123456", customer.phone());

        System.out.println(customer);
    }
}