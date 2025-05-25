package level3.exercise1.dataClass;

import level3.exercise1.exception.CannotBeNullException;
import level3.exercise1.interfaces.CommandVehicle;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void executeCommand(Vehicle vehicle, CommandVehicle command) {
        if(vehicle == null || command == null){
            throw new CannotBeNullException("Vehicle and command can not be null");
        }

        command.execute();
    }
    public void listVehicles( ){
        vehicleList.forEach(vehicle->System.out.println(vehicle.getName()));
        }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
