package interfaces;

public class AutoFridge implements Automated {
	@Override
	public void turnOff() {
		System.out.println("Really!?");
	}

	@Override
	public void turnOn() {
		System.out.println("Really!?");
	}

	@Override
	public boolean isCritical() {
		return true;
	}

	@Override
	public int getStatus() {
		return 0;
	}
}
