package interfaces;

public class AutoLight implements Automated {
	@Override
	public void turnOff() {
		System.out.println("Light Off");
	}

	@Override
	public void turnOn() {
		System.out.println("Light On");
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
