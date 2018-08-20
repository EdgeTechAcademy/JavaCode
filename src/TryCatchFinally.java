import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Edge Tech Academy on 6/7/2017.
 */

public class TryCatchFinally {

	private ArrayList<Integer> list;
	private static final int SIZE = 10;

	//	This is the constructor for our object
	//	it just recreates a line with numbers in it
	public TryCatchFinally() {
		list = new ArrayList<>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add((int)(Math.random()*100));
		}
	}

	public static void main(String[] args) {
		//	Create an object we will use to test different code situations to generate exceptions
		TryCatchFinally tcf = new TryCatchFinally();

		//	call a method to write to a local file
		tcf.writeList();
	}

	public void writeList() {
		PrintWriter out = null;
		try {
			//	we will open a file to write to it
			System.out.println ("Entering try statement");

			/*
			 *		change to E: to demonstrate the IOException
			 */
			out = new PrintWriter (new FileWriter("OutFile.txt"));

			//	we are adding the date to the start of the file to show that this was the file created just now
			out.println(new Date());

			/*
			 *		change to <= to demonstrate the IndexOutOfBoundException
			 */
			for (int i = 0; i < SIZE; i++) {
				// take the values from our list and write them to this file
				out.println ("Value at: " + i + " = " + list.get (i));
			}

			//	we are adding the date to the end of the file to show that this was the file created just now
			out.println(new Date());

		} catch (IndexOutOfBoundsException e) {
			/*
			 *		this exception is generated when we go past the end of our array
		 	 */
			System.err.println ("Caught IndexOutOfBoundsException: " +  e.getMessage ());
		} catch (IOException e) {
			/*
			 *		this exception is generated when we try to access an illegal file location
			 */
			System.err.println ("Caught IOException: " +  e.getMessage () + "\n" + e.getCause());
		} finally {
			/*
			 *		this is a guaranteed piece of code to be called after failure or success
			 */
			if (out != null) {
				System.out.println ("Closing PrintWriter");
				out.close ();
			}
			else {
				System.out.println ("PrintWriter not open");
			}
		}
	}
}