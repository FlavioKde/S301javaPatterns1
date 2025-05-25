package level3.exercise1.dataClass;

import level3.exercise1.interfaces.CommandVehicle;

public class BrakeCommand implements CommandVehicle {
    private Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }

    @Override
    public void undo() {
        vehicle.stop();
    }
}
