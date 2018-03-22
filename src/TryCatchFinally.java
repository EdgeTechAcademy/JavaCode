import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edge Tech Academy on 6/7/2017.
 */

// Note: This class will not compile yet.


public class TryCatchFinally {

	private ArrayList<Integer> list;
	private static final int SIZE = 10;

	public TryCatchFinally() {
		list = new ArrayList<>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(i*i);
		}
	}

	public static void main(String... args) {
		TryCatchFinally tcf = new TryCatchFinally();
		tcf.writeList();
	}

	public void dummy (PrintWriter out) {
		for (int i = 0; i <= SIZE; i++) {								//	change to <= to demonstrate the IndexOutOfBoundException
			out.println ("Value at: " + i + " = " + list.get (i));
		}

	}
	public void writeList() {
		PrintWriter out = null;
		try {
			System.out.println ("Entering try statement");
			out = new PrintWriter (new FileWriter("Z:OutFile.txt"));			//	change to E: to demonstrate the IOException
			for (int i = 0; i <= SIZE; i++) {								//	change to <= to demonstrate the IndexOutOfBoundException
				out.println ("Value at: " + i + " = " + list.get (i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println ("Caught IndexOutOfBoundsException: " +  e.getMessage ());
		} catch (IOException e) {
			System.err.println ("Caught IOException: " +  e.getMessage () + "\n" + e.getCause());
		} finally {
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