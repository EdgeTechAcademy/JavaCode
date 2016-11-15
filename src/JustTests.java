/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class JustTests {
    public static void main(String[] args){
        VehicleE veh01, veh02, veh03;

        veh01 = new VehicleE(VehicleE.WHEELS.FOUR_WHEELS,  VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC,  VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura TLX");
        veh02 = new Truck   (VehicleE.WHEELS.FOUR_WHEELS,  VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC,  VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Ford F150", 4000);
        veh03 = new SUV     (VehicleE.WHEELS.FOUR_WHEELS,  VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC,  VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura MDX", 8);

        veh01.printDescription();
        veh02.printDescription();
        veh03.printDescription();
    }

}
