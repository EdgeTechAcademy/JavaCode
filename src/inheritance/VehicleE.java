package inheritance;

import interfaces.WarpDrive;

/**
 * Created by Edge Tech Academy on 11/10/2016.
 */
public class VehicleE implements WarpDrive {

    public enum WHEELS {
        TWO_WHEELS, THREE_WHEELS, FOUR_WHEELS, EIGHTEEN_WHEELER
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

    //  unchanging fields
    private WHEELS      wheels;
    private int         engineSize;
    private DOORS       doors;
    private int         gearCount;
    private TRANS       transmission;      //  AUTOMATIC or STICK
    private SEATS       seatingCapacity;
    private COLOR       color;
    private String      model;
	private int			rpm;

	//  driver changeable fields
    private boolean     running;
    private int			gear;
    private double 		speed;

    //  WarpFactor interface variables
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

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWarpFactor(double  warpFactor)
    {
        this.warpFactor = warpFactor;
        speed = WarpDrive.LIGHT_SPEED * Math.pow(warpFactor, 3.3333);
    }

    public void accelerate (int deltaVelocity) {
    	speed += deltaVelocity;
		rpm += (deltaVelocity > 0) ? 350 : -350;
		if (rpm > 2700) {
			if (gear < gearCount) {
				gear++;
				rpm = 2600;
			} else if (gear == gearCount && rpm > 2900) {
				System.out.print("Slow Down!   ");
			}
		} else if (rpm < 2300) {
			if (gear > 1) {
				gear--;
				rpm = 2600;
			}
		}
		System.out.println(getSpeed() + " " + getGear() + " " + getRpm());
	}

    public void engage() {
        setWarpFactor(WarpDrive.MAX_WARP);
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
        return "inheritance.VehicleE { " +
                "wheels=" + wheels +
                ", engineSize=" + engineSize +
                ", doors=" + doors +
                ", gearCount=" + gearCount +
                ", transmission=" + transmission +
                ", seatingCapacity=" + seatingCapacity +
                ", color=" + color +
                ", model='" + model + '\'' +
                ", running=" + running +
                ", gear=" + gear +
                ", speed=" + speed +
                "}";
    }

    public void printDescription() {
        System.out.println("inheritance.VehicleE: The " + "inheritance.Vehicle is a " + getModel());
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
        spider.setGear(2);
		spider.setSpeed(100);
		spider.setRpm(2900);
		System.out.println(spider.getSpeed() + " " + spider.getGear() + " " + spider.getRpm());
		spider.accelerate(20);
		spider.accelerate(20);
		spider.accelerate(20);
		spider.accelerate(-40);
		spider.accelerate(-40);
		spider.accelerate(-40);
		spider.accelerate(-40);
    }
}
