package level2.exercise1.dataClass;

import level2.exercise1.exception.BadTelefonException;
import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.AddressBookFactory;
import level2.exercise1.interfaces.Telephone;

public class JapanFactory implements AddressBookFactory {

    @Override
    public Address createAddress(String addressData) {
        return new JapanAddress(addressData);
    }

    @Override
    public Telephone createTelephone(String number) throws BadTelefonException {
        return new JapanPhone(number);
    }
}
