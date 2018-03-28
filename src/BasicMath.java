import java.text.SimpleDateFormat;

/**
 * Created by Edge Tech Academy on 11/9/2016.
 * inheritance.Base Math
 */
public class BasicMath {


    public static void split(String string, int number) {


        String[] done = string.split(" ");
        String all = " ";
        for (int i = 0; i < done.length; i++) {

            if (done[i].length() > number) {

                System.out.println(i + " = " + done[i]);
            }
        }

    }

    public static void loop(String string) {

        String all = " ";

        String[] array = string.split(" ");

        for (int i = 0; i < array.length; i++) {

            switch (array[i].length()) {

                case 1:
                case 2:
                case 3:
                    System.out.println("Small word " + array[i]);
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Medium word " + array[i]);
                    break;
                default:
                    System.out.println("Bigger word " + array[i]);
            }
        }

    }

    public static void whatTimeIsIt(int seconds) {


        //I'm sure this can be done much easier but had fun breaking it down
        //Please advise on the easy way

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds2 = seconds % 60;

        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds2);
        if (seconds > 43200 && seconds < 46800) {
            timeString = String.format("%02d:%02d:%02d", hours = 12, minutes, seconds2);
            System.out.println(timeString + " PM");

        } else {
            if (seconds > 43200 && seconds > 46800) {
                timeString = String.format("%02d:%02d:%02d", hours - 12, minutes, seconds2);
                System.out.println(timeString + " PM");
            } else {
                if (seconds < 3600) {
                    timeString = String.format("%02d:%02d:%02d", hours + 12, minutes, seconds2);
                } else {

                }
                System.out.println(timeString + " AM");
            }
        }
    }


    public static void main(String[] args) {
        String quote = "Now is the time for all good men (and women) to come to the aid of their country";

        split(quote, 5);


        loop(quote);


        whatTimeIsIt(12000);
    }
}