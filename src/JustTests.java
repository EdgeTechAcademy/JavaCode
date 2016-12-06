/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class JustTests {
    public static void main(String[] args) {
        VehicleE veh01, veh02, veh03;

        //veh01 = new VehicleE(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura TLX");
        veh02 = new Truck(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Ford F150", 4000);
        veh03 = new SUV(VehicleE.WHEELS.FOUR_WHEELS, VehicleE.DOORS.FOUR_DOORS, 300, 8, VehicleE.TRANS.AUTOMATIC, VehicleE.SEATS.SEATS_5, VehicleE.COLOR.YELLOW, "Acura MDX", 8);

        //veh01.printDescription();
        veh02.printDescription();
        veh03.printDescription();

        int count1 = 2_147_483_647;
        float count2 = 1_000_000_000;
        //byte	count3 = 500;
        //char	count4 = 'zz';
        char count5 = 'A';
        char count6 = 65;
        System.out.format("%c %c%n", count6, count5);
        boolean t = Integer.valueOf(1).equals(new Long(1).intValue());
        System.out.format("%b%n", t);
        t = Integer.valueOf(1).equals(Long.valueOf(1));
        System.out.format("%b%n", t);

        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0));
        System.out.println(result);
/*2*/   result.setCharAt(1, original.charAt(original.length()-1));
        System.out.println(result);
/*3*/   result.insert(1, original.charAt(4));
        System.out.println(result);
/*4*/   result.append(original.substring(1,4));
        System.out.println(result);
/*5*/   result.insert(3, (original.substring(index, index+2) + " "));

        System.out.println(result);

        int	x, y, z;
        x = 10;
        y = 0;
        z = 5;
        z -= --x - y--;
        System.out.printf ("X = %d%n Y = %d%n  Z = %d%n",   x, y,     z);
        System.out.printf ("X = %d%n Y = %d%n  Z = %d%n", --x, y++, --z);
        System.out.printf ("X = %d%n Y = %d%n  Z = %d%n",   x, y,     z);

        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
