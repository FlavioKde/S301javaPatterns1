package level3.exercise1.dataClass;

public class Car extends Vehicle {
    private boolean accelerate;
    private boolean curb;
    private boolean starUp;


    public Car(String name, String type){
        super(name, type);

    }

    public void accelerate() {
        this.accelerate = true;
        System.out.println("The car accelerates");
    }

    public void brake() {
        this.curb = true;
        System.out.println("The car is braking");
    }

    public void start(){
        this.starUp = true;
        System.out.println("The car is turning on");
    }

    public void stop() {
        this.starUp = false;
        System.out.println("The car turns off");
    }
}
