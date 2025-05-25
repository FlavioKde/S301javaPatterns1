package level3.exercise1.dataClass;

import level3.exercise1.interfaces.CommandVehicle;

public class AcceleratCommand implements CommandVehicle {
    private Vehicle vehicle;

    public AcceleratCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }

    @Override
    public void undo() {
        vehicle.stop();

    }
}
