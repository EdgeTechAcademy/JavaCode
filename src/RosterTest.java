/**
 * Created by Edge Tech Academy on 3/10/2017.
 */

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.lang.Iterable;
import java.util.stream.Collectors;


public class RosterTest {

	interface CheckPerson {
		boolean test(Person p);
	}

	// Approach 1: Create Methods that Search for Persons that Match One
	// Characteristic

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getGender() == Person.Sex.MALE
				&& p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	// Approach 2: Create More Generalized Search Methods

	public static void printPersonsWithinAgeRange(List<Person> roster, int lo, int hi) {
		for (Person p : roster) {
			if (p.getGender() == Person.Sex.MALE
						&& lo <= p.getAge() && p.getAge() < hi) {
				p.printPerson();
			}
		}
	}

	// Approach 3: Specify Search Criteria Code in a Local Class
	// Approach 4: Specify Search Criteria Code in an Anonymous Class
	// Approach 5: Specify Search Criteria Code with a Lambda Expression

	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Approach 6: Use Standard Functional Interfaces with Lambda Expressions

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Approach 7: Use Lambda Expressions Throughout Your Application

	public static void processPersons(List<Person> roster,
									  Predicate<Person> tester,
									  Consumer<Person> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				block.accept(p);
			}
		}
	}

	// Approach 7, second example

	public static void processPersonsWithFunction(List<Person> roster,
												  Predicate<Person> tester,
												  Function<Person, String> mapper,
												  Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	// Approach 8: Use Generics More Extensively

	public static <X, Y> void processElements(Iterable<X> source,
											  Predicate<X> tester,
											  Function<X, Y> mapper,
											  Consumer<Y> block) {
		for (X p : source) {
			if (tester.test(p)) {
				Y data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	public static void main(String... args) {

		List<Person> roster = Person.createRoster();

		for (Person p : roster) {
			p.printPerson();
		}

		// Approach 1: Create Methods that Search for Persons that Match One
		// Characteristic

		System.out.println("Persons older than 20:");
		printPersonsOlderThan(roster, 20);
		System.out.println();

		// Approach 2: Create More Generalized Search Methods

		System.out.println("Persons between the ages of 14 and 30:");
		printPersonsWithinAgeRange(roster, 14, 30);
		System.out.println();

		// Approach 3: Specify Search Criteria Code in a Local Class

		System.out.println("Persons who are eligible for Selective Service:");

		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE
					   && p.getAge() >= 18
					   && p.getAge() <= 25;
			}
		}

		printPersons(
				roster, new CheckPersonEligibleForSelectiveService());


		System.out.println();

		// Approach 4: Specify Search Criteria Code in an Anonymous Class

		System.out.println("Persons who are eligible for Selective Service " +
								   "(anonymous class):");

		printPersons(
				roster,
				new CheckPerson() {
					public boolean test(Person p) {
						return p.getGender() == Person.Sex.MALE
							   && p.getAge() >= 18
							   && p.getAge() <= 25;
					}
				}
		);

		System.out.println();

		// Approach 5: Specify Search Criteria Code with a Lambda Expression

		System.out.println("Persons who are eligible for Selective Service " +
								   "(lambda expression):");

		printPersons(
				roster,
				(Person p) -> p.getGender() == Person.Sex.MALE
							  && p.getAge() >= 18
							  && p.getAge() <= 25
		);

		System.out.println();

		// Approach 6: Use Standard Functional Interfaces with Lambda
		// Expressions

		System.out.println("Persons who are eligible for Selective Service " +
								   "(with Predicate parameter):");

		printPersonsWithPredicate(
				roster,
				p -> p.getGender() == Person.Sex.MALE
					 && p.getAge() >= 18
					 && p.getAge() <= 25
		);

		System.out.println();

		// Approach 7: Use Lamba Expressions Throughout Your Application

		System.out.println("Persons who are eligible for Selective Service " +
								   "(with Predicate and Consumer parameters):");

		processPersons(
				roster,
				p -> p.getGender() == Person.Sex.MALE
					 && p.getAge() >= 18
					 && p.getAge() <= 25,
				p -> p.printPerson()
		);

		System.out.println();

		// Approach 7, second example

		System.out.println("Persons who are eligible for Selective Service " +
								   "(with Predicate, Function, and Consumer parameters):");

		processPersonsWithFunction(
				roster,
				p -> p.getGender() == Person.Sex.MALE
					 && p.getAge() >= 18
					 && p.getAge() <= 25,
				p -> p.getEmail(),
				email -> System.out.println(email)
		);

		System.out.println();

		// Approach 8: Use Generics More Extensively

		System.out.println("Persons who are eligible for Selective Service " +
								   "(generic version):");

		processElements(
				roster,
				p -> p.getGender() == Person.Sex.MALE
					 && p.getAge() >= 18
					 && p.getAge() <= 25,
				p -> p.getEmail(),
				email -> System.out.println(email)
		);

		System.out.println();

		// Approach 9: Use Bulk Data Operations That Accept Lambda Expressions
		// as Parameters

		System.out.println("Persons who are eligible for Selective Service " +
								   "(with bulk data operations):");

		roster
				.stream()
				.filter(
						p -> p.getGender() == Person.Sex.MALE
							 && p.getAge() >= 18
							 && p.getAge() <= 25)
				.map(p -> p.getEmail())
				.forEach(email -> System.out.println(email));

//---------------------------------------------------------------------------------------------------
//	Other examples using the wonderful Lambda expressions
//---------------------------------------------------------------------------------------------------

		System.out.println("Show programmers names:");
		roster.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		System.out.println("Increase salary by 5% to programmers:");
		Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());

		roster.forEach(giveRaise);

		System.out.println("Show PHP programmers that earn more than $1,400:");
		roster.stream()
				.filter((p) -> (p.getSalary() > 1400))
				.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		// Define some filters
		Predicate<Person> ageFilter		= (p) -> (p.getAge() > 25);
		Predicate<Person> salaryFilter	= (p) -> (p.getSalary() > 1400);
		Predicate<Person> genderFilter	= (p) -> ("female".equals(p.getGender()));
		Predicate<Person> JavaFilter	= (p) -> ("Java programmer".equals(p.getJob()));
		Predicate<Person> PHPFilter		= (p) -> ("PHP programmer".equals(p.getJob()));

		System.out.println("Show female PHP programmers that earn more than $1,400 and are older than 24 years:");
		roster.stream()
							.filter(ageFilter)
							.filter(salaryFilter)
							.filter(genderFilter)
							.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

// Reuse filters
		System.out.println("Show female Java programmers older than 24 years:");
		roster.stream()
							.filter(ageFilter)
							.filter(genderFilter)
							.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		System.out.println("Show first 3 Java programmers:");
		roster				.stream()
							.limit(3)
							.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		System.out.println("Show first 3 female Java programmers:");
		roster.stream()
							.filter(genderFilter)
							.limit(3)
							.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		System.out.println("Sort and show the first 5 Java programmers by name:");
		List<Person> sortedroster = roster
							.stream()
							.sorted((p, p2) -> (p.getLastName().compareTo(p2.getLastName())))
							.limit(5)
							.collect(Collectors.toList());

		sortedroster.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));

		System.out.println("Sort and show Java programmers by salary:");
		sortedroster = roster
							.stream()
							.filter(JavaFilter)
							.sorted((p, p2) -> (p.getSalary() - p2.getSalary()))
							.collect(Collectors.toList());

		sortedroster.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));

		System.out.println("Get the lowest Java programmer salary:");
		Person pers = roster
							.stream()
							.filter(JavaFilter)
							.min((p1, p2) -> (p1.getSalary() - p2.getSalary()))
							.get();

		System.out.printf("Name: %s %s; Salary: $%,d.", pers.getFirstName(), pers.getLastName(), pers.getSalary());

		System.out.println("Get the highest Java programmer salary:");
		Person person = roster
							.stream()
							.filter(JavaFilter)
							.max((p, p2) -> (p.getSalary() - p2.getSalary()))
							.get();

		System.out.printf("Name: %s %s; Salary: $%,d.", person.getFirstName(), pers.getLastName(), person.getSalary());

		System.out.println("Get PHP programmers first name to String:");
		String phpDevelopers = roster
							.stream()
							.filter(PHPFilter)
							.map(Person::getFirstName)
							.collect(Collectors.joining(" ; "));    // this can be used as a token in further operations

		System.out.println("Get Java programmers first name to Set:");
		Set<String> javaDevFirstName = roster
							.stream()
							.filter(JavaFilter)
							.map(Person::getFirstName)
							.collect(Collectors.toSet());

		System.out.println("Get Java programmers last name to TreeSet:");
		TreeSet<String> javaDevLastName = roster
							.stream()
							.filter(JavaFilter)
							.map(Person::getLastName)
							.collect(Collectors.toCollection(TreeSet::new));

		System.out.println("Calculate total money spent for paying Java programmers:");
		int totalSalary = roster
							.parallelStream()
							.filter(JavaFilter)
							.mapToInt(p -> p.getSalary())
							.sum();

		IntSummaryStatistics salaryStats = roster
							.stream()
							.mapToInt(Person::getSalary)
							.summaryStatistics();

		//Get count, min, max, sum, and average for Salaries
		System.out.println("Highest Salary : " + salaryStats.getMax());
		System.out.println("Lowest  Salary : " + salaryStats.getMin());
		System.out.println("Count   of all Salaries : " + salaryStats.getCount());
		System.out.println("Sum     of all Salaries : " + salaryStats.getSum());
		System.out.println("Average of all Salaries : " + salaryStats.getAverage());
	}
}