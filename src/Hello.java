import java.util.*;
import java.util.stream.Collectors;

public class Hello {
	/*
	this module was created as sample code
	for the Summer Java class in 2018

	 */
	public static void main(String[] args) {
		int [] testA = new int[10];
		int testB [] = new int[10];
		for (int i = 0; i < testA.length; i++) {
			testB[i] = (int)(Math.random()*1000);
		}
		for (int z :testB) {
			System.out.println("z = " + z);
		}
	}
}
