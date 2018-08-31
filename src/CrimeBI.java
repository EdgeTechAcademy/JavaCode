import java.util.*;

public class CrimeBI {
	public static void main(String[] args) {
		List<CrimeStats> nycCrimes = CrimeStats.getCrimes();
		Set<String> boroughs = new HashSet<>();		//	create a set of the boroughs
		Set<String> crimes = new TreeSet<>();		//	create a set of the crimes for a particular borough
		int boroughCount = 0;

		//	look at all the crimes in the city.
		for (CrimeStats nycCrime : nycCrimes) {
			boroughs.add(nycCrime.getBorough());
			if ( nycCrime.getBorough().equals("STATEN ISLAND") ) {
				crimes.add(nycCrime.getOffense());		//	what are all the crimes committed on Staten Island
				boroughCount++;							//	count the crimes in the borough
			}
		}
		System.out.println("STATEN ISLAND had " + boroughCount + " crimes");
		System.out.println("List of crimes = " + crimes);
		System.out.println("Boroughs of NYC = " + boroughs);

		//	create a map of the number of crimes per borough
		Map<String, Integer> crimesPerBorough = new HashMap<>();
		for (CrimeStats nycCrime : nycCrimes) {
			Integer count = 1;
			if ( crimesPerBorough.containsKey(nycCrime.getBorough())) {
				count = crimesPerBorough.get(nycCrime.getBorough()) + 1;
			}
			crimesPerBorough.put(nycCrime.getBorough(), count);
		}
		System.out.println("Crimes / Borough = " + crimesPerBorough);
	}
}
