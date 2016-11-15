/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class JustTests {
    public static void main(String[] args) {
        VehicleE veh01, veh02, veh03;

        veh01 = new VehicleE(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura TLX");
        veh02 = new Truck(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Ford F150", 4000);
        veh03 = new SUV(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura MDX", 8);

        veh01.printDescription();
        veh02.printDescription();
        veh03.printDescription();

        int count1 = 2_147_483_647;
        float count2 = 1_000_000_000;
        //byte	count3 = 500;
        //char	count4 = 'zz';
        char count5 = 'A';
        char count6 = 65;
        System.out.format("%c %c", count6, count5);
        boolean t = Integer.valueOf(1).equals(new Long(1).intValue());
        System.out.format("%b%n", t);
        t = Integer.valueOf(1).equals(Long.valueOf(1));
        System.out.format("%b%n", t);
    }
}
