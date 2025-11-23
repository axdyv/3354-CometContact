import org.junit.Test;
import static org.junit.Assert.*;

public class AddContactTest {

    @Test
    public void testAddValidContact() {
        ContactManager cm = new ContactManager();
        Contact c = new Contact("Adam", "axe220000");

        boolean result = cm.addContact(c);

        assertTrue(result);
        assertEquals(1, cm.getContactCount());
    }

    @Test
    public void testAddDuplicateContact() {
        ContactManager cm = new ContactManager();
        Contact c1 = new Contact("Adam", "axe220000");
        Contact c2 = new Contact("Adam Dupe", "axe220000");

        cm.addContact(c1);
        boolean result = cm.addContact(c2);

        assertFalse(result);
        assertEquals(1, cm.getContactCount());
    }

    @Test
    public void testAddInvalidContact() {
        ContactManager cm = new ContactManager();
        Contact invalid = new Contact("Isi", null);

        boolean result = cm.addContact(invalid);

        assertFalse(result);
        assertEquals(0, cm.getContactCount());
    }
}
