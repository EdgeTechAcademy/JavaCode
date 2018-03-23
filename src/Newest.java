import java.util.Calendar;
import java.util.Date;

/**
 * Created by Edge Tech Academy on 3/13/2018.
 */
public class Newest {

    String sayHello(String name, int yob, String state) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);

        String greeting = state.equalsIgnoreCase("tx") ? "Howdy" :
                state.equalsIgnoreCase("HI") ? "Aloha" : "Hello";
        return greeting + "! " + name + ". You will be " + (year - yob) + " in " + year;
    }

    public String getDatePart(String datePart) {

        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        String part = "";
        String[] parts = datePart.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("Y")) {
                part += " " + calendar.get(Calendar.YEAR);
            } else if (parts[i].equals("D")) {
                part += " " + calendar.get(Calendar.DAY_OF_MONTH);
            } else if (parts[i].equals("M")) {
                part += " " + calendar.get(Calendar.MONTH);
            } else if (parts[i].equals("m")) {
                part += " " + calendar.get(Calendar.MINUTE);
            } else if (parts[i].equals("h")) {
                part += " " + calendar.get(Calendar.HOUR);
            } else if (parts[i].equals("s")) {
                part += " " + calendar.get(Calendar.SECOND);
            }
            System.out.println("part = " + part);
        }
        return part.trim();
    }

    String[] getStudentList() {
        String[] test = {"Abe", "Bob"};
        return test;
    }

    public static void main(String[] args) {

        Newest dt = new Newest();

        System.out.println(dt.getDatePart("Y M D h m s"));
        System.out.println(dt.getDatePart("DoW"));

        System.out.println(dt.getStudentList()[0]);

        System.out.println(dt.sayHello("Shiloh", 1979, "UT"));
        System.out.println(dt.sayHello("Tari", 1953, "TX"));
        System.out.println(dt.sayHello("Stephanie", 1984, "HI"));
    }
}
