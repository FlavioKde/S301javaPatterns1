package level3.exercise1.logic;

import level3.exercise1.dataClass.*;
import level3.exercise1.interfaces.CommandVehicle;


public class ImplementExample {

    public static void start(Parking parking, int vehicleIndex){
       Vehicle vehicle = parking.getVehicleList().get(vehicleIndex);

        CommandVehicle start = new StartCommand(vehicle);
        CommandVehicle accelerate = new AcceleratCommand(vehicle);
        CommandVehicle brake = new BrakeCommand(vehicle);

        parking.executeCommand(vehicle, start);
        parking.executeCommand(vehicle, accelerate);
        parking.executeCommand(vehicle, brake);
        }
    }



