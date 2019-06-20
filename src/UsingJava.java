import java.util.*;

public class UsingJava {
	public static void main(String[] args) {
		int a, b, closestNum;

		a = Utils.getNumber("#1 ");
		b = Utils.getNumber("#2 ");

		closestNum = closestTo10 (a, b);
		System.out.println("This num is the closest number to 10: " + closestNum);
	}

	private static int closestTo10(int x, int y) {
		int distX = 10 - x;
		int distY = 10 - y;
		distX = Math.abs(distX);
		distY = Math.abs(distY);
		if (distX < distY)
			return x;
		else
			return y;

//		return (Math.abs(10 - x) < Math.abs(10 - y)) ? x : y;
//
//		if (Math.abs(10 - x) < Math.abs(10 - y))
//			return x;
//		else
//			return y;

	}
}
