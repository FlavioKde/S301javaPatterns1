package level3.exercise1.dataClass;

public class Plane extends Vehicle {
    private boolean accelerate;
    private boolean curb;
    private boolean starUp;

    public Plane(boolean accelerate, boolean curb, boolean starUp, String name,String type){
        super( name, type);
    }
    public void accelerate() {
        this.accelerate = true;
        System.out.println("The plane accelerates");
    }

    public void brake() {
        this.curb = true;
        System.out.println("The plane is braking");
    }

    public void start(){
        this.starUp = true;
        System.out.println("The plane is turning on");
    }

    public void stop() {
        this.starUp = false;
        System.out.println("The plane turns off");
    }
}
