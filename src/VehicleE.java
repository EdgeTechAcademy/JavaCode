/**
 * Created by Edge Tech Academy on 11/10/2016.
 */
public class VehicleE implements WarpDrive {

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

    public enum TRANS {
        AUTOMATIC(true), STICK(false);
        private boolean value;
        TRANS(boolean value) { this.value = value; }
    }

    public enum VARIETY {
        SO_TRUE("Ture"), NOT_TRUE("False"), POSSIBLE("Possible");
        private String value;
        VARIETY(String value) { this.value = value; }
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

    public VehicleE(int engineSize, int gearCount, COLOR color, String model) {
        this(WHEELS.FOUR_WHEELS, DOORS.FOUR_DOORS, engineSize, gearCount, TRANS.AUTOMATIC, SEATS.SEATS_5, color, model);
    }

    public VehicleE(WHEELS wheels, DOORS doors, int engineSize, int gearCount, TRANS transmission, SEATS seatingCapacity, COLOR color, String model) {
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
        return "VehicleE { " +
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


    public static void main (String[] args) {
        VehicleE acuraTLX   = new VehicleE(WHEELS.FOUR_WHEELS,  DOORS.FOUR_DOORS, 300, 8, TRANS.AUTOMATIC,  SEATS.SEATS_5, COLOR.YELLOW, "Acura TLX");
        VehicleE acuraTSX   = new VehicleE(                                       300, 8,                                  COLOR.SILVER, "Acura TSX");
        VehicleE FordF150   = new VehicleE(WHEELS.FOUR_WHEELS,  DOORS.TWO_DOORS,  450, 3, TRANS.AUTOMATIC,  SEATS.SEATS_3, COLOR.RED,    "Ford F150");
        VehicleE miniCooper = new VehicleE(WHEELS.FOUR_WHEELS,  DOORS.TWO_DOORS,  200, 3, TRANS.AUTOMATIC,  SEATS.SEATS_2, COLOR.GREEN,  "Mini Cooper");
        VehicleE spider     = new VehicleE(WHEELS.TWO_WHEELS,   DOORS.NO_DOORS,   300, 4, TRANS.STICK,      SEATS.SEATS_2, COLOR.BLACK,  "Spider");
        VehicleE indian     = new VehicleE(WHEELS.THREE_WHEELS, DOORS.NO_DOORS,   450, 4, TRANS.STICK,      SEATS.SEATS_2, COLOR.YELLOW, "Indian!");

        System.out.println(spider);
        if ( FordF150.getTransmission() == TRANS.AUTOMATIC)
            System.out.println("Yes it is");
        spider.setCurrentGear(3);

		QUOTES.GODFATHER.main(args);
    }
}
