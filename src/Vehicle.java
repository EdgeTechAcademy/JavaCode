/**
 * Created by Edge Tech Academy on 11/10/2016.
 */
public class Vehicle {

    //  unchanging fields
    private int         wheels;
    private int         engineSize;     //  in cubic cm
    private int         doors;
    private int         gearCount;
    private boolean     automatic;  //  true if automatic. false if manual
    private int         seatingCapacity;
    private String      model;
    private String      color;

    //  driver changeable fields
    private boolean     running;
    private int         currentGear;
    private int         currentSpeed;

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
        return automatic;
    }


    //  driver changeable fields
    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Vehicle(int engineSize, int gearCount, String color, String model) {
        this(4, 4, engineSize, gearCount, true, 5, color, model);
    }

    public Vehicle(int wheels, int doors, int engineSize, int gearCount, boolean automatic, int seatingCapacity, String color, String model) {
        this.wheels = wheels;
        this.doors = doors;
        this.engineSize = engineSize;
        this.gearCount = gearCount;
        this.automatic = automatic;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle { " +
                "wheels=" + wheels +
                ", engineSize=" + engineSize +
                ", doors=" + doors +
                ", currentGear=" + currentGear +
                ", gearCount=" + gearCount +
                ", automatic=" + automatic +
                ", seatingCapacity=" + seatingCapacity +
                ", running=" + running +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", currentSpeed=" + currentSpeed +
                "}";
    }

    public static void main (String[] args) {
        Vehicle acuraTLX   = new Vehicle(4, 4, 300, 8, true,  5, "Black",   "Acura TLX");
        Vehicle acuraTSX   = new Vehicle(      300, 8,           "Silver",  "Acura TSX");
        Vehicle FordF150   = new Vehicle(4, 2, 450, 3, true,  3, "White",   "Ford F150");
        Vehicle miniCooper = new Vehicle(4, 2, 200, 3, true,  2, "Green",   "Mini Cooper");
        Vehicle spider     = new Vehicle(3, 0, 300, 4, false, 2, "Black",   "Spider");
        Vehicle indian     = new Vehicle(2, 0, 450, 4, false, 2, "Yellow",  "Indian!");

        System.out.println(spider);
        spider.setCurrentGear(3);
    }
}