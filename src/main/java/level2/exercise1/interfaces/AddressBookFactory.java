package level2.exercise1.interfaces;

import level2.exercise1.exception.BadTelefonException;

public interface AddressBookFactory {
    Address createAddress(String address);
    Telephone createTelephone(String number) throws BadTelefonException;
}
