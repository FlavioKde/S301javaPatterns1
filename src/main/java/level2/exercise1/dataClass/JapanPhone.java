package level2.exercise1.dataClass;

import level2.exercise1.exception.BadTelefonException;
import level2.exercise1.interfaces.Telephone;

public class JapanPhone implements Telephone {
    private String number;


    public JapanPhone (String number) throws BadTelefonException {
        if (!number.matches("\\+81[789]0-?\\d{4}-?\\d{4}")) {
            throw new BadTelefonException("After the international prefix +81, the number must start with 70, 80, or 90," +
                    " followed by 8 numeric digits, typically formatted as 70-1234-5678");
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
