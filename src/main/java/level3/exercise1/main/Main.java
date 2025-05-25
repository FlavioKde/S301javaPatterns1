package level3.exercise1.main;

import level3.exercise1.dataClass.*;
import level3.exercise1.logic.ImplementExample;
import level3.exercise1.logic.LoadExample;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();
        LoadExample loadExample = new LoadExample(parking);
        loadExample.loadExample();

        ImplementExample.start(parking, 0);
        ImplementExample.start(parking, 1);
        ImplementExample.start(parking,2);

    }
}
