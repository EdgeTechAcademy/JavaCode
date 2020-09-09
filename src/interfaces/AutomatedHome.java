package interfaces;

import java.util.ArrayList;
import java.util.List;

public class AutomatedHome {
	public static void main(String[] args) {
		List<Automated> devices = new ArrayList<>();

		devices.add(new AutoLight());			//	garage light
		devices.add(new AutoLight());			//	bedroom light
		devices.add(new AutoLight());			//	TV room light
		devices.add(new AutoLight());			//	bathroom light
		devices.add(new AutoLight());			//	kitchen light

		devices.add(new AutoThermostat());		//	bedroom side of the house
		devices.add(new AutoThermostat());		//	TV room side of the house

		devices.add(new AutoFan());				//	bedroom fan
		devices.add(new AutoFan());				//	TV room fan
		devices.add(new AutoFan());				//	living room fan
		devices.add(new AutoFan());				//	guest bedroom fan

		devices.add(new AutoFridge());

		vacationMode(devices);
	}

	public static void vacationMode(List<Automated> devices) {
		//	vacation mode
		for (Automated device : devices) {
			if (! device.isCritical())
				device.turnOff();
		}

	}
}
