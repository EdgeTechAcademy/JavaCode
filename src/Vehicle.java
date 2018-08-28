public class Vehicle {
	private int rpm;
	private int speed;
	private int gears;         // number of gears
	private int currentGear;   // what gear the car is in currently

    /* let IntelliJ help you create
           the getters and setters,
           the toString
           and a constructor
    */

	public Vehicle(int rpm, int speed, int gears, int currentGear) {
		this.rpm = rpm;
		this.speed = speed;
		this.gears = gears;
		this.currentGear = currentGear;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	@Override
	public String toString() {
		return "Vehicle{" +
				"rpm=" + rpm +
				", speed=" + speed +
				", gears=" + gears +
				", currentGear=" + currentGear +
				'}';
	}

	public void accelerate(int deltaVelocity) {
//		Add deltaVelocity to speed
		speed += deltaVelocity;
//		if deltaVelocity
//			is greater than 0 add 350 to rpm
		if (deltaVelocity > 0) {
			rpm += 350;
		}
//			if less than 0 subtract 350 from rpm
		if (deltaVelocity < 0) {
			rpm -= 350;
		}
//		if rpm is greater than 2700
		if (rpm > 2700) {
//			if currentGear is less than gears then add one to currentGear and set rpm to 2600
			if (currentGear < gears) {
				currentGear++;
				rpm = 2600;
			}
//			else if currentGear is equal to gears and if rpm greater than 2900
			else if (currentGear == gears && rpm > 2900) {
//				print out "Slow down!"
				System.out.println("Slow Down!");
			}
		}
//		if rpm is less than 2300
		if (rpm < 2300) {
//			If currentGear greater than 1 then subtract one from currentGear and set rpm to 2600
			if (currentGear > 1) {
				currentGear--;
				rpm = 2600;
			}
		}
//		Last line in method : Print status (Speed, Gear and RPM).
		System.out.println(this);
	}

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(2900, 100, 4, 2);
		vehicle.accelerate(20);
		vehicle.accelerate(20);
		vehicle.accelerate(20);

		vehicle.accelerate(-40);
		vehicle.accelerate(-40);
		vehicle.accelerate(-40);
		vehicle.accelerate(-40);

	}
}