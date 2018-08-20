import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by gjames on 12/6/2016.
 */
public class TryCatch {

	public static void main(String[] args) {
		TryCatch tc = new TryCatch();
		tc.cat(new File("OutFile.txt"));
	}

	public static void cat (File file) {
		RandomAccessFile input = null;
		String line = null;

		try {
			input = new RandomAccessFile(file, "r");
			while ( (line = input.readLine ()) != null) {
				System.out.println (line);
			}
			return;
/*1.*/	} catch (FileNotFoundException fnf) {
/*2.*/		System.err.format ("File: %s not found%n", file);
/*3.*/	} catch (IOException e) {
/*4.*/		System.err.println (e.toString ());
/*5.*/	} finally {
			if (input != null) {
	//			input.close();
/*6.*/
			}
		}
	}
}
