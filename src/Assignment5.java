public class Assignment5 {
	public static void main(String[] args) {
		String[] classNames = new String[5];
		classNames[0] = "Jayme";
		classNames[1] = "Arianne";
		classNames[2] = "Victoria";
		classNames[3] = "Samuel";
		classNames[4] = "Gary";

		System.out.println(classNames[3]);

		//	i need an integer array of size 20
		int[] myNumbers = new int[20];
		myNumbers[4] = 687609;
		myNumbers[9] = 2342314;
		myNumbers[14] = 876;
		myNumbers[19] = 6;

		float[] myFloats = new float[30];
		myFloats[0] = 99.99f;
		myFloats[myFloats.length - 1] = 99.99f;
		//	put your code here
		//	we did this in class on Aug 8

		double num = Math.random();
		num *= 50;
		num += 10;
		int arraySize = (int)num;
		int[] randomNumbers = new int[arraySize];
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 100) + 5;
		}
		System.out.println("randomNumbers[0] = " + randomNumbers[0]);
		System.out.println("randomNumbers[1] = " + randomNumbers[1]);
		System.out.println("randomNumbers[2] = " + randomNumbers[2]);
		System.out.println("randomNumbers[" + (randomNumbers.length-3) + "] = " + randomNumbers[randomNumbers.length-3]);
		System.out.println("randomNumbers[" + (randomNumbers.length-2) + "] = " + randomNumbers[randomNumbers.length-2]);
		System.out.println("randomNumbers[" + (randomNumbers.length-1) + "] = " + randomNumbers[randomNumbers.length-1]);


		for (int i = 0; i <= 1024; i++) {
			System.out.format("%3d = %04X %012d %n", i, i, Long.parseLong(Integer.toBinaryString(i)));
		}

	}
}
