package interfaces;

public class AutoFan implements Automated {
	private int speed;
	@Override
	public void turnOff() {
		System.out.println("Fan Off");
	}

	@Override
	public void turnOn() {
		System.out.println("Fan On");
	}

	@Override
	public boolean isCritical() {
		return false;
	}

	@Override
	public int getStatus() {
		return 0;
	}

	public void adjustSpeed(int speed) {
		this.speed = speed;
	}
}
