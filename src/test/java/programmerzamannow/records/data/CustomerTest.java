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

    @Test
    void constructor() {
        var customer = new Customer("1", "Hanif", "hanif@localhost");
        assertNotNull(customer);
        assertEquals("1", customer.id());
        assertEquals("Hanif", customer.name());
        assertEquals("hanif@localhost", customer.email());

        assertNull(customer.phone());

        System.out.println(customer);
    }

    @Test
    void canonicalConstructor() {
        var customer = new Customer("1", "Hanif", "HANIF@LOCALHOST");
        assertNotNull(customer);
        assertEquals("1", customer.id());
        assertEquals("Hanif", customer.name());
        assertEquals("hanif@localhost", customer.email());

        assertNull(customer.phone());

        System.out.println(customer);
    }

    @Test
    void recordMethod() {
        var customer = new Customer("1", "Hanif", "HANIF@LOCALHOST");
        assertEquals("Hello Haikal, my name is Hanif", customer.sayHello("Haikal"));
    }
}