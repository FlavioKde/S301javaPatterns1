package level3.exercise1.dataClass;

import level3.exercise1.interfaces.CommandVehicle;

public class StartCommand implements CommandVehicle {
    private Vehicle vehicle;

    public StartCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();

    }

    @Override
    public void undo() {
        vehicle.stop();
    }
}
