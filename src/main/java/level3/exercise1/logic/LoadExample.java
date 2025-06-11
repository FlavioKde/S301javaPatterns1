package level3.exercise1.logic;

import level3.exercise1.dataClass.*;


public class LoadExample {
    private Parking parking;

    public LoadExample(Parking parking) {
        this.parking = parking;

    }
    public void loadExample(){
        Vehicle car = new Car("Toyota","4 doors");
        Vehicle bicycle = new Bicycle("Specialized","mountain");
        Vehicle ship = new Ship("Euronav NV","tanker");
        Vehicle plane = new Plane("Airbus 380-A","Passenger");

        parking.addVehicle(car);
        parking.addVehicle(bicycle);
        parking.addVehicle(ship);
        parking.addVehicle(plane);

    }
}
