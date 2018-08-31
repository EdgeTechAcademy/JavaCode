import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class JustTests {

    public static void main(String[] args) {
		List<Person> people = Person.createRoster();
    	calcMF(people);
		calcState(people, "UT");
		calcStateJobs(people, "Java", "UT");
		Set<String> states = getListOfStates(people, "Java");
		System.out.println("states = " + states + ": there are " + states.size() + " states with Java jobs" );
		Set<String> jobs = getJobs(people);
		System.out.println("Found these jobs = " + jobs + ": there are " + jobs.size() + " different job types" );
    }

	private static Set<String> getJobs(List<Person> people) {
    	return null;
	}

	private static Set<String> getListOfStates(List<Person> people, String jobs) {
    	Set<String> states = new TreeSet<>();
		for (Person person : people) {
			if (person.getJob().equalsIgnoreCase(jobs)) {
				states.add(person.getState());
			}
		}
		return states;
	}

	/*
			get the count of programmers for a state AND a particular programming skill
	 */
	private static void calcStateJobs(List<Person> people, String job, String state) {
		int count = 0;
		for (Person person : people) {
			if(person.getState().equalsIgnoreCase(state)) {
				count++;
			}
		}
		System.out.println(count + " " + job + " programmers live in " + state);
	}

	private static void calcState(List<Person> people, String state) {
		int stateCnt = 0;
		for (Person person : people) {
			if(person.getState().equalsIgnoreCase(state)) {
				stateCnt++;
			}
		}
		System.out.println(stateCnt + " programmers live in " + state);
	}

	private static void calcMF(List<Person> people) {
		int males = 0, females = 0;
		for (Person person : people) {
			if(person.getGender() == Person.Gender.MALE) {
				males++;
			} else {
				females++;
			}
		}
		System.out.println("males = " + males);
		System.out.println("females = " + females);
	}

}
