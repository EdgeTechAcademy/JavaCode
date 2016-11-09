/**
 * Created by GJames on 10/31/2016.
 *      Sample simple class
 */
@SuppressWarnings("WeakerAccess")
public class Employee {
    private String  name;
    private String  title;
    private boolean isEmployeed;

    public Employee(String name, String title, boolean isEmployeed) {
        this.name = name;
        this.title = title;
        this.isEmployeed = isEmployeed;
    }

    public Employee() {
        this.name = "";
        this.title = "";
        this.isEmployeed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEmployeed() {
        return isEmployeed;
    }

    public void setEmployeed(boolean employeed) {
        isEmployeed = employeed;
    }

    public static void manin(String[] args) {

        Employee    emp1 = new Employee("Steve Martin", "Banjo Player", true);
        Employee    emp2 = new Employee();
        emp2.setName("Bill Murray");
        emp2.setTitle("Ghostbuster");
        emp2.setEmployeed(true);
    }
}
