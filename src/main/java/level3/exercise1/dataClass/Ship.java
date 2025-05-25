package level3.exercise1.dataClass;

public class Ship extends Vehicle{
    private boolean accelerate;
    private boolean curb;
    private boolean starUp;

    public Ship( String name, String type){
        super(name, type);
    }
    public void accelerate() {
        this.accelerate = true;
        System.out.println("The ship accelerates");
    }

    public void brake() {
        this.curb = true;
        System.out.println("The ship is braking");
    }

    public void start(){
        this.starUp = true;
        System.out.println("The ship is turning on");
    }

    public void stop() {
        this.starUp = false;
        System.out.println("The ship turns off");
    }
}
