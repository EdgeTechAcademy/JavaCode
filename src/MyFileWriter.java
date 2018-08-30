import java.io.*;

public class MyFileWriter {

	public static void main(String[] args) throws java.io.IOException {

		String s1;

		// set up the buffered reader to read from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Set up the output file
		FileWriter fw = new FileWriter("MyFileWriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		while (true) {
			s1 = Utils.getInput("Enter a line of input");

			if (s1.length() > 0) {
				pw.println(s1);
			} else {
				break;
			}
		}
		pw.close();
	}
}