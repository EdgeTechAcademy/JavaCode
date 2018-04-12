import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		try  {
			BufferedReader br = new BufferedReader(new FileReader("OutFile.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println("line = " + line);
			}
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage()); // handle exception
		}
	}
}
