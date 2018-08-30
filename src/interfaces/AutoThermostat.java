package interfaces;

public class AutoThermostat implements Automated {
	@Override
	public void turnOff() {
		System.out.println("Lower Temp");
	}

	@Override
	public void turnOn() {
		System.out.println("Raise Temp");
	}

	@Override
	public boolean isCritical() {
		return false;
	}

	@Override
	public int getStatus() {
		return 0;
	}
}
