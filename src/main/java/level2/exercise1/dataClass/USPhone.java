package level2.exercise1.dataClass;

import level2.exercise1.exception.BadTelefonException;
import level2.exercise1.interfaces.Telephone;

public class USPhone implements Telephone {
    private final String number;

    public USPhone(String number) throws BadTelefonException {
        if (!number.matches("\\+1\\d{10}")) {
            throw new BadTelefonException("Invalid US format: +1 followed by 10 digits");
        }
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void telephone() {
        System.out.println("US Phone: " + number);
    }
}
