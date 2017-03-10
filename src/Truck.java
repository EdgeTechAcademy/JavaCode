/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class Truck extends VehicleE {
    private int towingCapacity;

    public Truck(int engineSize, int gearCount, COLOR color, String model, int towingCapacity) {
        super(engineSize, gearCount, color, model);
        this.towingCapacity = towingCapacity;
    }

    public Truck(WHEELS wheels, DOORS doors, int engineSize, int gearCount, TRANS transmission, SEATS seatingCapacity, COLOR color, String model, int towingCapacity) {
        super(wheels, doors, engineSize, gearCount, transmission, seatingCapacity, color, model);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + getModel() + " has a " + getTowingCapacity() + " pound Towing Capacity.");
    }

	@Override
	public String toString() {
		return super.toString() + "\nThe " + getModel() + " has a " + getTowingCapacity() + " pound Towing Capacity.";
	}

	public static void main(String[] args) {
        Truck truck = new Truck(300,6,COLOR.BLUE, "Titan", 5000);
        truck.printDescription();
//        System.out.println(truck);
  //      System.out.println(truck.super.toString());

		Integer i = new Integer(10);
		Integer j = new Integer(20);
 		swap(i, j);
		System.out.println("i = " + i + ", j = " + j);
	}
	public static void swap(Integer i, Integer j) {
		Integer temp = new Integer(i);
		i = j;
		j = temp;
	}
}