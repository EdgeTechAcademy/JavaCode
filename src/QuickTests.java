import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * Created by gjames on 5/31/2017.
 */
public class QuickTests {
	public static void main(String[] args) {

		int [][] daysInTheYear = {
				{0, 1, 2, 3},
				{4, 5},
				{6, 7, 8, 9, 10},
				new int[31], new int[28], new int[31],
				new int[30], new int[31], new int[30],
				new int[31], new int[31], new int[30],
				new int[31], new int[30], new int[31]
		};
		System.out.println(daysInTheYear[0][0] + daysInTheYear[1][0]);
		System.out.println(daysInTheYear[0][2] + daysInTheYear[1][1]);

		int sum = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
		System.out.println("Sum : " + sum + " size " + daysInTheYear.length);

		int[] numbers = {123, 456, 789, 246, 135, 802, 791};

		//sum = IntStream.of(numbers).reduce(0, (a,b) -> a + b);
		sum = Arrays.stream(numbers).reduce(0, (x, y) -> (x + y));
//		sum = Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println("sum = " + sum);

//------------------------	Person data examples	---------------------------

		List<Person> people = Person.createRoster();

		IntSummaryStatistics stats = people.stream()
											 .collect(Collectors.summarizingInt(Person::getAge));
		System.out.println("stats: " + stats);

		Map<Person.Gender, List<Person>> byGender	=
			people.stream()
				.collect (Collectors.groupingBy(p -> p.getGender()));
		System.out.println(byGender.get(Person.Gender.MALE));

		long totalMale	= people.stream()
								.filter	(p -> p.getGender().equals(Person.Gender.MALE))
								.count();

		people.stream()
				.filter	(p -> p.getGender().equals(Person.Gender.MALE))
				.map		(Person::getAge)
				.filter	(a -> a > 26)
				.forEach(System.out::println);

		people.stream()
				.filter	(p -> p.getGender().equals(Person.Gender.MALE))
				.filter	(p -> p.getAge() > 26)
				.forEach(System.out::println);

		people.stream()
		//	.sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
			.sorted(Comparator.comparing(Person::getFirstName))
			.limit(3)
			.forEach(System.out::println);

		people.stream()
				.map(Person::getAge)
				.sorted()
				.skip(people.size() - 1)
				.forEach(System.out::println);

		people.stream()
				.sorted()
				.limit(3)
				.forEach(System.out::println);
	}
}
