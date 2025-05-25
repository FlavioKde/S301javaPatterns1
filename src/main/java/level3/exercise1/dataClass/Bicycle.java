package level3.exercise1.dataClass;

public class Bicycle extends Vehicle{
    private boolean accelerate;
    private boolean curb;
    private boolean starUp;

    public Bicycle(String name, String type){
        super(name, type);
    }
    public void accelerate() {
        this.accelerate = true;
        System.out.println("The bicycle accelerates");
    }

    public void brake() {
        this.curb = true;
        System.out.println("The bicycle is braking");
    }

    public void start(){
        this.starUp = true;
        System.out.println("The bicycle is turning on");
    }

    public void stop() {
        this.starUp = false;
        System.out.println("The bicycle turns off");
    }


}
