/**
 * Created by Edge Tech Academy on 3/6/2017.
 */
public class StringMethods {
	public static void main(String[] args) {

		String fullPathName = "C:\\Projects\\firstJava\\Verion.1.2.0\\src\\FirstClass.java";

		int slashIndex = fullPathName.lastIndexOf("\\");            // find the last slash
		String fullFileName = fullPathName.substring(slashIndex + 1);    // we found the slash now go 1 more  char

		String[] tokens = fullPathName.split("\\\\");                //	What’s the deal with all of the slashes
		for (int i = 0; i < tokens.length - 1; i++)
			System.out.println(i + " " + tokens[i]);

		int dotIndex = fullPathName.lastIndexOf(".");

		if (dotIndex >= 0 && slashIndex >= 0) {
			String fileName = fullPathName.substring(slashIndex + 1, dotIndex);
			String extension = fullPathName.substring(dotIndex + 1);
			System.out.println("File name: " + fileName + " ext " + extension);
		} else {
			System.out.println("File name: " + fullPathName + " does not contain proper path name");
		}

		if ( fullFileName.endsWith(".java"))
			System.out.println("This is a Java file!");
	}
}
