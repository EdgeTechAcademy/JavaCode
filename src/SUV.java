/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class SUV extends VehicleE {
    private int seatCount;

    public SUV(int engineSize, int gearCount, COLOR color, String model, int seatCount) {
        super(engineSize, gearCount, color, model);
        this.seatCount = seatCount;
    }

    public SUV(WHEELS wheels, DOORS doors, int engineSize, int gearCount, TRANS transmission, SEATS seatingCapacity, COLOR color, String model, int seatCount) {
        super(wheels, doors, engineSize, gearCount, transmission, seatingCapacity, color, model);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public String toString() {
        return "SUV{" +
                       "seatCount=" + seatCount +
                       "} " + super.toString();
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The SUV" + " has " + getSeatCount() +
                " seats.");
    }
}
