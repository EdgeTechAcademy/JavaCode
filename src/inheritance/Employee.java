package inheritance;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class Staff extends Employee {
    private float hourlyRate;

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Staff(String name, Date startDate, Date dateOfBirth, float hourlyRate) {
        super(name, startDate, dateOfBirth);
        this.hourlyRate = hourlyRate;
    }
}
class CEO extends Manager {
    private String parkingSpot;
    private float bonusAmt;

    public String getParkingSpot() {
        return parkingSpot;
    }
    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
    public float getBonusAmt() {
        return bonusAmt;
    }
    public void setBonusAmt(float bonusAmt) {
        this.bonusAmt = bonusAmt;
    }

    public CEO(String name, Date startDate, Date dateOfBirth, double signingLimit, float bonusPct, float salary, String parkingSpot, float bonusAmt) {
        super(name, startDate, dateOfBirth, signingLimit, bonusPct, salary);
        this.parkingSpot = parkingSpot;
        this.bonusAmt = bonusAmt;
    }
}

class Manager extends Employee {
    private double signingLimit;
    private float bonusPct;
    private float salary;

    public double getSigningLimit() {
        return signingLimit;
    }
    public void setSigningLimit(double signingLimit) {
        this.signingLimit = signingLimit;
    }
    public float getBonusPct() {
        return bonusPct;
    }
    public void setBonusPct(float bonusPct) {
        this.bonusPct = bonusPct;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Manager(String name, Date startDate, Date dateOfBirth,
                   double signingLimit, float bonusPct, float salary) {
        super(name, startDate, dateOfBirth);
        this.signingLimit = signingLimit;
        this.bonusPct = bonusPct;
        this.salary = salary;
    }
    public Manager(double signingLimit, float bonusPct, float salary) {
        super("Gary", new Date(), new Date());
        this.signingLimit = signingLimit;
        this.bonusPct = bonusPct;
        this.salary = salary;
    }
}

public class Employee {
    private String name;
    private Date startDate;
    private Date dateOfBirth;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(String name, Date startDate, Date dateOfBirth) {
        this.name = name;
        this.startDate = startDate;
        this.dateOfBirth = dateOfBirth;
    }

    public static void main(String[] args) {
        try {
            DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
            Date startDate = df.parse("1/1/2011");
            Date dob = df.parse("10/21/1991");
            CEO ceo = new CEO("Tim", startDate, dob,
                    10000, 25.0f, 100_000, "A1", 25_000);
            System.out.println("ceo.getName() = " + ceo.getName());

        } catch (ParseException ex) {
            System.out.println("Bad date conversion");
        }
    }
}
