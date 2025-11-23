import java.util.HashSet;

public class ContactManager {
    private HashSet<Contact> contacts = new HashSet<>();

    public boolean addContact(Contact c) {
        if (c == null || c.getNetId() == null) {
            return false;   // invalid
        }
        return contacts.add(c); // false if duplicate
    }

    public int getContactCount() {
        return contacts.size();
    }
}
