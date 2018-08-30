package interfaces;

import java.util.ArrayList;

public class AutomatedHome {
	public static void main(String[] args) {
		ArrayList<Automated> devices = new ArrayList<>();

		devices.add(new AutoLight());
		devices.add(new AutoLight());
		devices.add(new AutoLight());
		devices.add(new AutoLight());
		devices.add(new AutoLight());

		devices.add(new AutoThermostat());
		devices.add(new AutoThermostat());

		devices.add(new AutoFan());
		devices.add(new AutoFan());
		devices.add(new AutoFan());
		devices.add(new AutoFan());

		devices.add(new AutoFridge());

		for (Automated device : devices) {
			if (! device.isCritical())
				device.turnOff();
		}
	}
}
