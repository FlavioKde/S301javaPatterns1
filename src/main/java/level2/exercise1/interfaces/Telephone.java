package level2.exercise1.interfaces;

import level2.exercise1.exception.BadTelefonException;

public interface Telephone {
    String getNumber() throws BadTelefonException;
    void telephone();
}
