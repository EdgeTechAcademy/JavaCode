import inheritance.SUV;
import inheritance.Truck;
import inheritance.VehicleE;

/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class JustTests {

    public static void main(String[] args) {

        Truck       truck;
        SUV suv;

        VehicleE veh01,
                 veh02,
                 veh03;

        veh01 = new VehicleE(300, 8,  VehicleE.COLOR.YELLOW, "Acura TLX");
        veh02 = new Truck   (300, 8,  VehicleE.COLOR.YELLOW, "Ford  F150", 4000);
        veh03 = new SUV     (300, 8,  VehicleE.COLOR.YELLOW, "Acura MDX", 8);

        truck = new Truck(300, 8,  VehicleE.COLOR.YELLOW, "Ford  F150", 4000);
        suv   = new SUV     (300, 8,  VehicleE.COLOR.YELLOW, "Acura MDX", 8);

        System.out.println("truck = " + truck);
        System.out.println("suv =   " + suv);
        System.out.println();

        truck = (Truck)veh02;
        truck.printDescription();
        suv.printDescription();
        System.out.println();

//        veh01.printDescription();
//        veh02.printDescription();
//        veh03.printDescription();
        print(veh01);
        print(veh02);
        print(veh03);
    }
    public static void print (VehicleE veh) {
        veh.printDescription();
    }
}
