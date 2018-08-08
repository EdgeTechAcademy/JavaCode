public class ArrayExamples {
	public static void main(String[] args) {
		int shotsMade[] = new int[24];

		int[] scores = new int[40];
// Let's set the scores equal to the index times 2.

		for ( int i = 0; i < scores.length; i++ ) {
			scores[i] = i * 2;           // element will be equal to index * 2
		}

		int ages[] = new int[11];
		ages[0] = 94;		//	Dad
		ages[1] = 90;		//	Mom
		ages[2] = 70;		//	Stephen
		ages[3] = 69;		//	Sharon
		ages[4] = 64;		//	me
		//ages[5] = 0;		//	unknown

		for (int a = 0; a < ages.length; a++) {
			System.out.println("ages[" + a + "] = " + ages[a]);
		}

		String[] garage = { "Acura", "VW", "Toyota", "Subaru", "Peterbilt", "Maserati", "Ford", "Chevy", "Audi", "Citroen", "BWW", "Mercedes Benz", "Rolls Royce" };
		System.out.println("how big is your array? " + garage.length);
		System.out.println("What is first car in the garage? " + garage[0]);
		System.out.println("What is at the last car in the garage? " + garage[garage.length-1]);

	}
}
