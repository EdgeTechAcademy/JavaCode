import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLExpSimple {

	public static void main(String[] args) {
		try {
			URL mySite = new URL("http://crapfilter.com/");
			URLConnection yc = mySite.openConnection();
			Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
			int count = 0;
			while (in.hasNext()) {
				String text = in.next();
				System.out.println(text.length() + " " + text);
				count++;
			}
			System.out.println("Number of tokens: " + count);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}