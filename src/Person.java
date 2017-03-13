/**
 * Created by Edge Tech Academy on 3/10/2017.
 */

import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;

public class Person {

	public enum Sex { MALE, FEMALE }

	String 		name;
	LocalDate 	birthday;
	Sex 		gender;
	String 		email;
	int			salary;

	Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
		name 	 = nameArg;
		birthday = birthdayArg;
		gender 	 = genderArg;
		email	 = emailArg;
		salary   = (int)((Math.random() * 50_000) + 40_000);
	}

	public int getAge() {
		return birthday.until(IsoChronology.INSTANCE.dateNow())
					   .getYears();
	}

	public void printPerson() {
		System.out.println(name + ", " + this.getAge());
	}

	public Sex getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) { this.salary = salary; }

	public static int compareByAge(Person a, Person b) {
		return a.birthday.compareTo(b.birthday);
	}

	public static List<Person> createRoster() {

		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Fred",	 IsoChronology.INSTANCE.date(1980,  6, 20),	Person.Sex.MALE,   "fred@example.com"));
		roster.add(new Person("Jane",	 IsoChronology.INSTANCE.date(1990,  7, 30),	Person.Sex.FEMALE, "jane@example.com"));
		roster.add(new Person("George",	 IsoChronology.INSTANCE.date(1991,  8, 13),	Person.Sex.MALE,   "george@example.com"));
		roster.add(new Person("Bob",	 IsoChronology.INSTANCE.date(2001,  2, 15),	Person.Sex.MALE,   "bob@example.com"));
		roster.add(new Person("Elsdon",  IsoChronology.INSTANCE.date(1980,  5, 11),	Person.Sex.MALE,   "Elsdon@example.com"));
		roster.add(new Person("Tamsen",  IsoChronology.INSTANCE.date(1993,  5, 22),	Person.Sex.FEMALE, "Tamsen@example.com"));
		roster.add(new Person("Floyd",   IsoChronology.INSTANCE.date(1986,  2, 17),	Person.Sex.MALE,   "Floyd@example.com"));
		roster.add(new Person("Sindy",   IsoChronology.INSTANCE.date(1998,  1, 22),	Person.Sex.FEMALE, "Sindy@example.com"));
		roster.add(new Person("Vere",    IsoChronology.INSTANCE.date(2005,  7, 15),	Person.Sex.MALE,   "Vere@example.com"));
		roster.add(new Person("Maude",   IsoChronology.INSTANCE.date(1980,  9, 12),	Person.Sex.FEMALE, "Maude@example.com"));
		roster.add(new Person("Shawn",   IsoChronology.INSTANCE.date(1993,  9, 12),	Person.Sex.MALE,   "Shawn@example.com"));
		roster.add(new Person("Jayden",  IsoChronology.INSTANCE.date(2000, 11, 02),	Person.Sex.FEMALE, "Jayden@example.com"));
		roster.add(new Person("Palmer",  IsoChronology.INSTANCE.date(1992,  8, 12),	Person.Sex.MALE,   "Palmer@example.com"));
		roster.add(new Person("Addison", IsoChronology.INSTANCE.date(1980,  9, 18),	Person.Sex.FEMALE, "Addison@example.com"));
		roster.add(new Person("Jarrod",  IsoChronology.INSTANCE.date(1990,  7, 24),	Person.Sex.MALE,   "Jarrod@example.com"));
		roster.add(new Person("Victor",  IsoChronology.INSTANCE.date(1999,  4, 12),	Person.Sex.MALE,   "Victor@example.com"));
		roster.add(new Person("Tori",    IsoChronology.INSTANCE.date(2005, 12, 13),	Person.Sex.FEMALE, "Tori@example.com"));
		roster.add(new Person("Osborne", IsoChronology.INSTANCE.date(1980,  4, 28),	Person.Sex.MALE,   "Osborne@example.com"));
		roster.add(new Person("Ros",     IsoChronology.INSTANCE.date(2007,  9, 12),	Person.Sex.FEMALE, "Ros@example.com"));
		roster.add(new Person("Fraser",  IsoChronology.INSTANCE.date(1990, 10, 11),	Person.Sex.MALE,   "Fraser@example.com"));
		roster.add(new Person("Quinn",   IsoChronology.INSTANCE.date(1980,  9, 27),	Person.Sex.FEMALE, "Quinn@example.com"));
		roster.add(new Person("Alvin",   IsoChronology.INSTANCE.date(2006, 11, 12),	Person.Sex.MALE,   "Alvin@example.com"));
		roster.add(new Person("Evonne",  IsoChronology.INSTANCE.date(1993,  1, 10),	Person.Sex.FEMALE, "Evonne@example.com"));
		return roster;
	}
}