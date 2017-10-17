/**
 * Created by Edge Tech Academy on 6/7/2017.
 */

// Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class TryCatchFinally {

	private List<Integer> list;
	private static final int SIZE = 10;

	public TryCatchFinally() {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
	}

	public static void main(String... args) {
		TryCatchFinally tcf = new TryCatchFinally();
		tcf.writeList();
	}
	public void writeList() {
		PrintWriter out = null;
		try {
			System.out.println ("Entering try statement");
			out = new PrintWriter (new FileWriter ("OutFile.txt"));			//	change to E: to demonstrate the IOException
			for (int i = 0; i < SIZE; i++) {								//	change to <= to demonstrate the IndexOutOfBoundException
				out.println ("Value at: " + i + " = " + list.get (i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println ("Caught IndexOutOfBoundsException: " +  e.getMessage ());
		} catch (IOException e) {
			System.err.println ("Caught IOException: " +  e.getMessage ());
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