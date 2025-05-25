package level2.exercise1.dataClass;


import java.util.ArrayList;
import java.util.List;

public class InternationalAddressBook {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void showContacts() {
        contacts.forEach(contact -> {
            contact.getAddress().address();
            contact.getTelephone().telephone();
            System.out.println("------------------");
        });
    }
}

