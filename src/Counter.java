/**
 * Created by Edge Tech Academy on 10/31/2016.
 *      Day one: The Anatomy of a Java Class
 */
@SuppressWarnings("WeakerAccess")
public class Counter {
    private int     counter;
    private String  name;

    public Counter(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int incCounter() {
        return ++counter;
    }

    public int getCounter() {
        return counter;
    }

    public void resetCounter() {
        this.counter = 0;
    }

    @Override
    public String toString() {
        return "Counter{" +
                ", name='" + name + '\'' +
                "counter=" + counter +
                '}';
    }

    public static void main(String[] args) {

        Counter blueCars  = new Counter("Blue Cars", 0);
        Counter blackCars = new Counter("Black Cars", 0);

        System.out.println(blueCars);
        System.out.println(blackCars);

    }
}
