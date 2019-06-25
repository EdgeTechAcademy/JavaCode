/**
 * Created by Edge Tech Academy on 3/10/2017.
 */

import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;

public class Person  implements Comparable<Person> {

	public enum Gender { MALE, FEMALE }

	private String		firstName, lastName;
	private String		job;
	private String		state;
	private String		email;
	private LocalDate	birthday;
	private Gender 		gender;
	private int			salary;

	Person(String firstName, String lastName, String job, LocalDate birthday, Gender gender, String state, String email) {
		this.firstName= firstName;
		this.lastName = lastName;
		this.job	 = job;
		this.birthday = birthday;
		this.gender	 = gender;
		this.state	 = state;
		this.email	 = email;
		salary   	 = (int)((Math.random() * 60_000) + 40_000);
	}

	public String getEmail() {
		return email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int			getAge() {
		return birthday.until(IsoChronology.INSTANCE.dateNow())
					   .getYears();
	}
	public String		getJob() {
		return job;
	}
	public Gender 		getGender() {
		return gender;
	}
	public String		getLastName() {
		return lastName;
	}
	public String		getFirstName() {
		return firstName;
	}
	public LocalDate	getBirthday() {
		return birthday;
	}
	public int			getSalary() {
		return salary;
	}
	public void			setSalary(int salary) { this.salary = salary; }

	public void printPerson() {
		System.out.println(firstName + " " + lastName + ", " + this.getAge());
	}

	@Override
	public String toString() {
		return firstName;
	}

	public int compareTo(Person another) {
		return this.getAge() - another.getAge();
	}

	public static List<Person> createRoster() {

		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Addison", "Texas", 	"Java", 	IsoChronology.INSTANCE.date(1980, 8, 1), Gender.FEMALE, "TX", "Addison@example.com"));
		roster.add(new Person("Evonne", "Saint", 	"C Sharp", 	IsoChronology.INSTANCE.date(1993, 1, 8), Gender.FEMALE, "CO", "Evonne@example.com"));
		roster.add(new Person("Jayden", "Trump", 	"Node.js", 	IsoChronology.INSTANCE.date(2000, 11, 17), Gender.FEMALE, "NY", "Jayden@example.com"));
		roster.add(new Person("Maude", "Lethargy", 	"Java", 	IsoChronology.INSTANCE.date(1980, 8, 13), Gender.FEMALE, "CO", "Maude@example.com"));
		roster.add(new Person("Queen", "Eskimo", 	"C Sharp", 	IsoChronology.INSTANCE.date(1980, 9, 5), Gender.FEMALE, "NY", "jane@example.com"));
		roster.add(new Person("Ros", "Line", 		"Node.js", 	IsoChronology.INSTANCE.date(2007, 9, 3), Gender.FEMALE, "LA", "Quinn@example.com"));
		roster.add(new Person("Sammy", "Spade", 	"C Sharp", 	IsoChronology.INSTANCE.date(2005, 12, 2), Gender.FEMALE, "CA", "Ros@example.com"));
		roster.add(new Person("Sindy", "Who", 		"Java", 	IsoChronology.INSTANCE.date(1998, 1, 25), Gender.FEMALE, "TX", "Tori@example.com"));
		roster.add(new Person("Tamsen", "Leatherson", "Java", 	IsoChronology.INSTANCE.date(1993, 4, 16), Gender.FEMALE, "TX", "Sindy@example.com"));
		roster.add(new Person("Tori", "Brit", 		"C Sharp", 	IsoChronology.INSTANCE.date(2005, 12, 23), Gender.FEMALE, "CO", "Tamsen@example.com"));

		roster.add(new Person("Alvin", "Dyer", "C Sharp", IsoChronology.INSTANCE.date(2006, 11, 2), Gender.MALE, "CO", "Tori@example.com"));
		roster.add(new Person("Bob", "Flemming", "C Sharp", IsoChronology.INSTANCE.date(2001, 2, 3), Gender.MALE, "NY", "Alvin@example.com"));
		roster.add(new Person("Elsdon", "Jaycob", "Java", IsoChronology.INSTANCE.date(1980, 4, 5), Gender.MALE, "CO", "bob@example.com"));
		roster.add(new Person("Floyd", "Meriweather", "Java", IsoChronology.INSTANCE.date(1986, 2, 13), Gender.MALE, "NY", "Elsdon@example.com"));
		roster.add(new Person("Fraser", "Hughes", "Node.js", IsoChronology.INSTANCE.date(1990, 10, 21), Gender.MALE, "TX", "Floyd@example.com"));
		roster.add(new Person("Fred", "Gwinn", "C Sharp", IsoChronology.INSTANCE.date(1980, 5, 31), Gender.MALE, "CA", "Fraser@example.com"));
		roster.add(new Person("George", "Harrison", "Java", IsoChronology.INSTANCE.date(1991, 7, 29), Gender.MALE, "NY", "fred@example.com"));
		roster.add(new Person("Jarrod", "Brother", "Node.js", IsoChronology.INSTANCE.date(1990, 6, 19), Gender.MALE, "TX", "george@example.com"));
		roster.add(new Person("Osborne", "Clutch", "C Sharp", IsoChronology.INSTANCE.date(1980, 3, 11), Gender.MALE, "CA", "Jarrod@example.com"));
		roster.add(new Person("Palmer", "Dene", "Java", IsoChronology.INSTANCE.date(1992, 7, 7), Gender.MALE, "CA", "Osborne@example.com"));
		roster.add(new Person("Shawn", "Patton", "Java", IsoChronology.INSTANCE.date(1993, 10, 30), Gender.MALE, "NY", "Palmer@example.com"));
		roster.add(new Person("Vern", "Hervey", "Node.js", IsoChronology.INSTANCE.date(2005, 6, 4), Gender.MALE, "CA", "Shawn@example.com"));
		roster.add(new Person("Victor", "Krum", "C Sharp", IsoChronology.INSTANCE.date(1999, 3, 6), Gender.MALE, "CA", "Vere@example.com"));
		roster.add(new Person("Walter", "James", "Fortran", IsoChronology.INSTANCE.date(1909, 7, 16), Gender.MALE, "UT", "grandpa@gmail.com"));
		return roster;
	}
}
