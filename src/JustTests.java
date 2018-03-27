import java.net.CacheRequest;

/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class JustTests {
    private String original;

    public static void main(String[] args) {


        Truck       truck;
        SUV         suv;
        
        VehicleE veh01, veh02, veh03;

        veh01 = new VehicleE(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura TLX");
        veh02 = new Truck(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Ford F150", 4000);
        veh03 = new SUV(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura MDX", 8);

        truck = new Truck(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Ford F150", 4000);
        suv = new SUV(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura MDX", 8);

        System.out.println("truck = " + truck);
        System.out.println("suv = " + suv);
        System.out.println();

        truck.printDescription();
        suv.printDescription();
        System.out.println();

        veh01.printDescription();
        veh02.printDescription();
        veh03.printDescription();
    }
}
