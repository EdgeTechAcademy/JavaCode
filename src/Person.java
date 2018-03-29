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
	private LocalDate	birthday;
	private Gender 		gender;
	private String		email;
	private int			salary;

	Person(String firstNameArg, String lastNameArg, String jobArg, LocalDate birthdayArg, Gender genderArg, String emailArg) {
		firstName= firstNameArg;
		lastName = lastNameArg;
		job		 = jobArg;
		birthday = birthdayArg;
		gender	 = genderArg;
		email	 = emailArg;
		salary   = (int)((Math.random() * 50_000) + 40_000);
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
	public String		getEmail() {
		return email;
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
//				"Person{" +
//					   "firstName='" + firstName + '\'' +
//					   ", lastName='" + lastName + '\'' +
//					   ", age=" + getAge() +
//					   '}';
}

	public int compareTo(Person another) {
		return this.getAge() - another.getAge();
	}

	public static List<Person> createRoster() {

		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Addison",	"Texas",		"Java programmer",	IsoChronology.INSTANCE.date(1980, 8,   1),  Gender.FEMALE,  "Addison@example.com"));
		roster.add(new Person("Evonne",		"Saint",		"PHP programmer",   IsoChronology.INSTANCE.date(1993, 1,   8),  Gender.FEMALE,  "Evonne@example.com"));
		roster.add(new Person("Jayden",		"Trump",		"Java programmer",  IsoChronology.INSTANCE.date(2000, 11, 17),  Gender.FEMALE,  "Jayden@example.com"));
		roster.add(new Person("Maude",		"Lethargy",		"Java programmer",  IsoChronology.INSTANCE.date(1980, 8,  13),  Gender.FEMALE,  "Maude@example.com"));
		roster.add(new Person("Jane",		"James",		"Java programmer",  IsoChronology.INSTANCE.date(1990, 5,  23),  Gender.FEMALE,  "jane@example.com"));
		roster.add(new Person("Queen",		"Eskimo",		"PHP programmer",   IsoChronology.INSTANCE.date(1980, 9,   5),  Gender.FEMALE,  "Quinn@example.com"));
		roster.add(new Person("Ros",		"Line",			"PHP programmer",   IsoChronology.INSTANCE.date(2007, 9,   3),  Gender.FEMALE,  "Ros@example.com"));
		roster.add(new Person("Sammy",		"Spade",		"PHP programmer",   IsoChronology.INSTANCE.date(2005, 12,  2),  Gender.FEMALE,  "Tori@example.com"));
		roster.add(new Person("Sindy",		"Who",			"Java programmer",  IsoChronology.INSTANCE.date(1998, 1,  25),  Gender.FEMALE,  "Sindy@example.com"));
		roster.add(new Person("Tamsen",		"Leatherson",	"Java programmer",  IsoChronology.INSTANCE.date(1993, 4,  16),  Gender.FEMALE,  "Tamsen@example.com"));
		roster.add(new Person("Tori",		"Brit",			"PHP programmer",   IsoChronology.INSTANCE.date(2005, 12, 23),  Gender.FEMALE,  "Tori@example.com"));

		roster.add(new Person("Alvin",		"Dyer",			"PHP programmer",   IsoChronology.INSTANCE.date(2006, 11,  2),  Gender.MALE,    "Alvin@example.com"));
		roster.add(new Person("Bob",		"Flemming",		"PHP programmer",   IsoChronology.INSTANCE.date(2001, 2,   3),  Gender.MALE,    "bob@example.com"));
		roster.add(new Person("Elsdon",		"Jaycob",		"Java programmer",  IsoChronology.INSTANCE.date(1980, 4,   5),  Gender.MALE,    "Elsdon@example.com"));
		roster.add(new Person("Floyd",		"Meriweather",  "Java programmer",  IsoChronology.INSTANCE.date(1986, 2,  13),  Gender.MALE,    "Floyd@example.com"));
		roster.add(new Person("Fraser",		"Hughes",		"PHP programmer",   IsoChronology.INSTANCE.date(1990, 10, 21),  Gender.MALE,    "Fraser@example.com"));
		roster.add(new Person("Fred",		"Gwinn",		"PHP programmer",   IsoChronology.INSTANCE.date(1980, 5,  31),  Gender.MALE,    "fred@example.com"));
		roster.add(new Person("George",		"Harrison",		"Java programmer",  IsoChronology.INSTANCE.date(1991, 7,  29),  Gender.MALE,    "george@example.com"));
		roster.add(new Person("Jarrod",		"Brother",		"PHP programmer",   IsoChronology.INSTANCE.date(1990, 6,  19),  Gender.MALE,    "Jarrod@example.com"));
		roster.add(new Person("Osborne",	"Clutch",		"PHP programmer",	IsoChronology.INSTANCE.date(1980, 3,  11),  Gender.MALE,    "Osborne@example.com"));
		roster.add(new Person("Palmer",		"Dene",			"Java programmer",  IsoChronology.INSTANCE.date(1992, 7,   7),  Gender.MALE,    "Palmer@example.com"));
		roster.add(new Person("Shawn",		"Patton",		"Java programmer",  IsoChronology.INSTANCE.date(1993, 10, 30),  Gender.MALE,    "Shawn@example.com"));
		roster.add(new Person("Vern",		"Hervey",		"Java programmer",  IsoChronology.INSTANCE.date(2005, 6,   4),  Gender.MALE,    "Vere@example.com"));
		roster.add(new Person("Victor",		"Krum",			"PHP programmer",   IsoChronology.INSTANCE.date(1999, 3,   6),  Gender.MALE,    "Victor@example.com"));
		return roster;
	}
}
