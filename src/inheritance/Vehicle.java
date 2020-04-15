package inheritance;

/**
 * Created by Edge Tech Academy on 11/10/2016.
 */
public class Vehicle {

    //  unchanging fields
    private int wheels;
    private int engineSize;     //  in cubic cm
    private int doors;
    private int gearCount;
    private boolean isAutomatic;  //  true if isAutomatic. false if manual
    private int seatingCapacity;
    private String make;
    private String model;
    private String color;
    private String[] accessories;          //TODO add code for accessories

    //  driver changeable fields
    private boolean running;
    private int gear;
    private int speed;

    //  unchanging fields
    public int getWheels() {
        return wheels;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public int getGearCount() {
        return gearCount;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getModel() {
        return model;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }


    //  driver changeable fields
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getSpeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public Vehicle(int engineSize, int gearCount, String color, String model) {
        this(4, 4, engineSize, gearCount, true, 5, color, model);
    }

    public Vehicle(int wheels, int doors, int engineSize, int gearCount, boolean automatic, int seatingCapacity, String color, String model) {
        this.wheels = wheels;
        this.doors = doors;
        this.engineSize = engineSize;
        this.gearCount = gearCount;
        this.isAutomatic = automatic;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "inheritance.Vehicle { " +
                "wheels=" + wheels +
                ", engineSize=" + engineSize +
                ", doors=" + doors +
                ", gear=" + gear +
                ", gearCount=" + gearCount +
                ", isAutomatic=" + isAutomatic +
                ", seatingCapacity=" + seatingCapacity +
                ", running=" + running +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                "}";
    }

    public static void main(String[] args) {
        Vehicle acuraTLX 	= new Vehicle(4, 4, 300, 8, true, 5, "Black", "Acura TLX");
        Vehicle acuraTSX 	= new Vehicle(300, 8, "Silver", "Acura TSX");
        Vehicle fordF150 	= new Vehicle(4, 2, 450, 3, true, 3, "White", "Ford F150");
        Vehicle miniCooper 	= new Vehicle(4, 2, 200, 3, true, 2, "Green", "Mini Cooper");
        Vehicle spider 		= new Vehicle(3, 0, 300, 4, false, 2, "Black", "Spider");
        Vehicle indian 		= new Vehicle(2, 0, 450, 4, false, 2, "Yellow", "Indian!");

        Vehicle[] veh2 = {acuraTLX, acuraTSX, fordF150, miniCooper, spider, indian};
        for (int i = 0; i < veh2.length; i++) {
            System.out.println(veh2[i]);
        }
        System.out.println(spider);
        System.out.println(fordF150);
        spider.setGear(3);
        System.out.println(spider);
    }
}
