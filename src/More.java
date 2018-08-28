import java.io.BufferedReader;
import java.io.FileReader;

public class More {
	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(Utils.getInput("File Name: ")));

			do {
				line = br.readLine();
				System.out.println(line);
			} while (line != null);
		} catch (Exception e) {
			System.err.println(e.getMessage()); // handle exception
		}
	}
}
