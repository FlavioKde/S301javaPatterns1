package level2.exercise1.logic;

import level2.exercise1.dataClass.Contact;
import level2.exercise1.dataClass.JapanFactory;
import level2.exercise1.dataClass.SpanishFactory;
import level2.exercise1.dataClass.USFactory;
import level2.exercise1.exception.BadTelefonException;
import level2.exercise1.exception.CountryNotSupporterException;
import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.AddressBookFactory;
import level2.exercise1.interfaces.Telephone;

public class BuilderFactory {
    private final AddressBookFactory factory;

    public BuilderFactory(String country){
        this.factory = switch(country.toLowerCase()) {
            case "spain" -> new SpanishFactory();
            case "usa" -> new USFactory();
            case "japan" -> new JapanFactory();
            default -> throw new CountryNotSupporterException("Country not supported");
        };
    }

    public Contact buildContact(String phoneNumber, String addressData) throws BadTelefonException {
        Telephone telephone = factory.createTelephone(phoneNumber);
        Address address = factory.createAddress(addressData);
        return new Contact(address, telephone);
    }


}
