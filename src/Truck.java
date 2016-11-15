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
        System.out.println("The " + "Truck has " +
                getTowingCapacity() + " Towing Capacity.");
    }
}
