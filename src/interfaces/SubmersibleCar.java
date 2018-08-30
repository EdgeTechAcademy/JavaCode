package interfaces;

import inheritance.VehicleE;

import java.util.ArrayList;

public class SubmersibleCar extends VehicleE implements Submersible {
	@Override
	public void dive() {
		System.out.println("Dive Car");
	}

	@Override
	public void surface() {
		System.out.println("Bring Car to surface");
	}

	public SubmersibleCar(int engineSize, int gearCount, COLOR color, String model) {
		super(engineSize, gearCount, color, model);
	}

	public static void main(String[] args) {
		SubmersibleCar car = new SubmersibleCar(200,6,COLOR.GREEN,"TLX");
		car.dive();

		Submarine sub = new Submarine();
		sub.dive();

		ArrayList<Submersible> list = new ArrayList<>();
		list.add(car);
		list.add(sub);

		for (int i = 0; i < list.size(); i++) {
			Submersible thing = list.get(i);
			thing.surface();
		}
	}
}
