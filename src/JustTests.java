import inheritance.SUV;
import inheritance.Truck;
import inheritance.VehicleE;

import java.util.Deque;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class JustTests {
    public static void main(String[] args) {
    	int males = 0, females = 0;
		List<Person> people = Person.createRoster();
		for (Person person : people) {
			if(person.getGender() == Person.Gender.MALE) {
				males++;
			} else {
				females++;
			}
		}
		System.out.println("males = " + males);
		System.out.println("females = " + females);
//		HashMap<String, Person> map = new HashMap<>();
//		map.put(person.getFirstName(), person);
//		Person a = map.get("Allen");
//		Sort the List in Last Name order, print the result. Just first and last name.
//		Deque<Person> deque = new Deque();
//		Add each person from people to a Deque. Now process the Deque from the end (LIFO order), verify that that people come out in the reverse order.
    }
}
