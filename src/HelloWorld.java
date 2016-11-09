/**
 * Created by Edge Tech Academy on 10/31/2016.
 *       Demonstrating a simple Class definition
 */

@SuppressWarnings("WeakerAccess")
public class HelloWorld {

    private String  name;

    private HelloWorld() {      }

    private HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello " + name + "!: Welcome to Edge Tech Academy";
    }

    public static void main(String[] args) {

        HelloWorld student1 = new HelloWorld("Alice");         //  Create your first Object
        System.out.println(student1);

        HelloWorld student2 = new HelloWorld();                //  Create your 2nd Object
        student2.setName("Benjamin");
        System.out.println("This is the name of our 2nd student " + student2.getName());

        int[] anArray = {100, 200, 300};
        System.out.println(anArray[0]);
        System.out.println(anArray[1]);
        System.out.println(anArray[2]);
//        System.out.println(anArray[3]);
        double earthMass = 5.9 * 1E24;
        System.out.println("The Mass of the Earth is: " + earthMass);

        String[] phoneParts = "682-334-5679".split("-");        //	["628", "334", "5679"]
        for (String p : phoneParts)
            System.out.println(p);
        String myName = "Gary James";
        int find_J = myName.indexOf("J");    // returns 5
        int find_G = myName.indexOf("G");    // returns 0
        int find_Z = myName.indexOf("Z");    // returns -1
        System.out.println("Found J at: " + find_J + "\nFound G at: " + find_G + "\nFound Z at: " + find_Z);

        boolean isGaryThere = myName.contains("Gary");    // returns true
        System.out.println("Was Gary There?: " + (isGaryThere ? "Yes" : "No"));
        int nameLength = myName.length();    // returns 10
        String newName = myName.replace("a", "-");    // returns G-ary J-mes
        String exchange = "682-334-5679".substring(4, 7);        // "334"
        String phone = String.join("-", phoneParts[0], phoneParts[1], phoneParts[2]);    // "682-334-5679"
        System.out.println("The phone number is back together: " + phone);
        System.out.println(String.format("%6.3f", 1234.587654321)); // 1234.588
        System.out.println(String.format("%6.2f", 1234.587654321)); // 1234.59
        System.out.println(String.format("%06.1f", 1234.587654321)); // 1235.6
        System.out.println(String.format("%06.0f", 1234.587654321)); // 001235.0
        System.out.println(8 + 10 * 3 / 6 % 4 - 3);

        System.out.println(calcFinalPrice (100.00, 0.80, 15.00, 1.0825));

    }

    static double calcFinalPrice (double originalPrice, double discountPct, double discountAmt, double salesTax) {
        return ((originalPrice * discountPct) - discountAmt) * salesTax;
    }
}
