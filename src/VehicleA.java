/**
 * Created by GJames on 11/16/2016.
 */
public class VehicleA implements WarpDrive {

    public enum WHEELS {
        TWO_WHEELS, FOUR_WHEELS, THREE_WHEELS
    }

    public enum SEATS {
        SEATS_2, SEATS_3, SEATS_5
    }

    public enum DOORS {
        TWO_DOORS, NO_DOORS, FOUR_DOORS
    }

    public enum COLOR {
        RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE, BROWN, BLACK, SILVER
    }

    public enum TRANS{
        AUTOMATIC(true), STICK(false);
        private boolean value;
        TRANS(boolean value) { this.value = value; }
    }

    //  unchanging fields
    private WHEELS      wheels;
    private int         engineSize;
    private DOORS       doors;
    private int         gearCount;
    private TRANS       transmission;      //  AUTOMATIC or STICK
    private SEATS       seatingCapacity;
    private COLOR       color;
    private String      model;

    //  driver changeable fields
    private boolean     running;
    private int         currentGear;
    private double      currentSpeed;

    //  IWarpFactor interface variables
    private double      warpFactor;

    //  unchanging fields
    public WHEELS getWheels() {
        return wheels;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public DOORS getDoors() {
        return doors;
    }

    public COLOR getColor() {
        return color;
    }

    public int getGearCount() {
        return gearCount;
    }

    public SEATS getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getModel() {
        return model;
    }

    public TRANS getTransmission() {
        return transmission;
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

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setWarpFactor(double  warpFactor)
    {
        this.warpFactor = warpFactor;
        currentSpeed = LIGHT_SPEED * Math.pow(warpFactor, 3.3333);
    }

    public void engage() {
        setWarpFactor(MAX_WARP);
    }

    public VehicleA(int engineSize, int gearCount, COLOR color, String model) {
        this(WHEELS.FOUR_WHEELS, DOORS.FOUR_DOORS, engineSize, gearCount, TRANS.AUTOMATIC, SEATS.SEATS_5, color, model);
    }

    public VehicleA(WHEELS wheels, DOORS doors, int engineSize, int gearCount, TRANS transmission, SEATS seatingCapacity, COLOR color, String model) {
        this.wheels = wheels;
        this.doors = doors;
        this.engineSize = engineSize;
        this.gearCount = gearCount;
        this.transmission = transmission;
        this.seatingCapacity = seatingCapacity;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "VehicleA { " +
                "wheels=" + wheels +
                ", engineSize=" + engineSize +
                ", doors=" + doors +
                ", gearCount=" + gearCount +
                ", transmission=" + transmission +
                ", seatingCapacity=" + seatingCapacity +
                ", color=" + color +
                ", model='" + model + '\'' +
                ", running=" + running +
                ", currentGear=" + currentGear +
                ", currentSpeed=" + currentSpeed +
                "}";
    }

    public void printDescription() {
        System.out.println("The " + "Vehicle is a " +
                getModel());
    }
}
