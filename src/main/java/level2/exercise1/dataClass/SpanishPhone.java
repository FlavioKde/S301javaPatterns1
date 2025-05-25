package level2.exercise1.dataClass;


import level2.exercise1.exception.BadTelefonException;
import level2.exercise1.interfaces.Telephone;

public class SpanishPhone implements Telephone {
        private String number;

    public void SpanishPhone(String number) throws BadTelefonException {
            if (!number.matches("\\+34\\d{9}")) {
                throw new BadTelefonException("Invalid Spanish format: +34 followed by 9 digits");
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

