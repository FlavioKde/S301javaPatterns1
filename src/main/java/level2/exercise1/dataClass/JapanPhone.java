package level2.exercise1.dataClass;

import level2.exercise1.exception.BadTelefonException;
import level2.exercise1.interfaces.Telephone;

public class JapanPhone implements Telephone {
    private String number;


    public JapanPhone (String number) throws BadTelefonException {
        if (!number.matches("\\+81[789]0-?\\d{4}-?\\d{4}")) {
            throw new BadTelefonException("Invalid Japan format");
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
