package level2.exercise1.dataClass;

import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.Telephone;

public class Contact {
    private final Address address;
    private final Telephone telephone;

    public Contact(Address address, Telephone telephone){
        this.address = address;
        this.telephone = telephone;
    }


    public Address getAddress() {
        return address;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Contact:\n" +
                "- Address: " + address + "\n" +
                "- Phone: " + telephone;
    }
}
