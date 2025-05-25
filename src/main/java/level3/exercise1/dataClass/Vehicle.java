package level3.exercise1.dataClass;

public abstract class Vehicle {
    private String name;
    private String type;

    public Vehicle(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle: " + "\n"+
                "name= " + name + "\n" +
                "type= " + type + "\n" ;
    }

        public abstract void start();
        public abstract void stop();
        public abstract void accelerate();
        public abstract void brake();
    }

