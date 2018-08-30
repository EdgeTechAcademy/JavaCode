import java.util.*;

public class CrimeBI {
	public static void main(String[] args) {
		List<CrimeStats> nycCrimes = CrimeStats.getCrimes();
		Set<String> boroughs = new HashSet<>();
		int manhatten = 0;
		for (CrimeStats nycCrime : nycCrimes) {
			boroughs.add(nycCrime.getBorough());
			if ( nycCrime.getBorough().equals("STATEN ISLAND") ) {
				manhatten++;
			}
		}
		System.out.println("STATEN ISLAND = " + manhatten);
		System.out.println("boroughs = " + boroughs);
		Map<String, Integer> crimesPerBorough = new HashMap<>();
		for (CrimeStats nycCrime : nycCrimes) {
			Integer count = 1;
			if ( crimesPerBorough.containsKey(nycCrime.getBorough())) {
				count = crimesPerBorough.get(nycCrime.getBorough()) + 1;
			}
			crimesPerBorough.put(nycCrime.getBorough(), count);
		}
		System.out.println("crimesPerBorough = " + crimesPerBorough);
	}
}
