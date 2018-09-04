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
		getCountByState(people, "UT");
		countForJobsAndState(people, "C Sharp", "CO");
		Set<String> states = getListOfStates(people, "Java");
		System.out.println("states = " + states + ": there are " + states.size() + " states with Java jobs" );
		Set<String> jobs = getJobs(people);
		jobs.remove("Java");
		System.out.println("Found these jobs = " + jobs + ": there are " + jobs.size() + " different job types" );
		float totalSalary = totalSalaryByState(people, "ut");
		System.out.println("totalSalary = " + totalSalary);
    }

	private static float totalSalaryByState(List<Person> people, String state) {
    	float totalSalary = 0;
		for (Person person : people) {
			if (person.getState().equalsIgnoreCase(state)) {
				totalSalary += person.getSalary();
			}
		}
		return totalSalary;
	}

	private static Set<String> getJobs(List<Person> people) {
		Set<String> jobs = new TreeSet<>();
		for (Person person : people) {
			jobs.add(person.getJob());
		}
    	return jobs;
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

	/*	get the count of programmers for a state AND a particular programming skill  */
	private static void countForJobsAndState(List<Person> people, String job, String state) {
		int count = 0;
		for (Person person : people) {
			if( person.getState().equalsIgnoreCase(state) &&
				person.getJob().equalsIgnoreCase(job)) {
				count++;
			}
		}
		System.out.println(count + " " + job + " programmers live in " + state);
	}

	private static void getCountByState(List<Person> people, String state) {
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
