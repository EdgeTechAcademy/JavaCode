import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by EdgeTech Academy on 5/31/2017.
 */
public class QuickTests {

	public static void test () {


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

		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);

		System.out.println(nums.stream()
								   .map(number -> String.valueOf(number))
								   .collect(Collectors.joining(", ")));
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
		System.out.println("There are " + totalMale + " men");

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

	public static int[] answer(int area) {

		List list = new ArrayList();
		do {
			int square = (int)Math.sqrt(area);
			square *= square;
			list.add (square);
			area -= square;
		}
		while (area >= 1);

		int[] ret = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ret[i] = ((Integer)list.get(i)).intValue();
		}
		return ret;
	}

	public static void main(String[] args) {

		char c = 'A';
		System.out.println(c);


		for ( int z = 1; z < 20; z++ ) {
			int[] x = answer(z);

			for (int i = 0; i < x.length; i++) {
				System.out.print((i > 0 ? ", " : z + " ") + x[i]);
			}
			System.out.println();
		}

		String quote = "Now is the time for all good men (and women) to come to the aid of their country";

		String[] words = quote.split(" " );
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 4)
				System.out.println("words[" + i + "] = " + words[i]);
		}

		String[] endsWithE = quote.split("e " );
		for (int i = 0; i < endsWithE.length; i++) {
			String s = endsWithE[i];
			System.out.println("s = " + s);
		}

		Date today = new Date();

		String dateWords = today.toString();
		words = dateWords.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println("words{" + i + "] = " + words[i]);

		}

		float boxOffice = 0;
		BigDecimal take = new BigDecimal(0);
		System.out.println("take = " + take);
		System.out.println("boxOffice = " + boxOffice);
	}
}
