import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static int getColNum(String header, String colName) {
		String[] aHeader = header.split(",");
		int hdr = -1;
		for (int i = 0; i < aHeader.length; i++) {
			if (aHeader[i].equalsIgnoreCase(colName)) {
				hdr = i;
				break;
			}
		}
		return hdr;
	}


	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("JobSearch.csv"));
			String line;

			//	consume the header line
			String header = br.readLine();
			int col1 = getColNum(header, "location");
			int col2 = getColNum(header, "title");
			if (col1 == -1 || col2 == -1)
				return;
			//	find the column number of the 'address' field
			int cntDallas = 0, cntPune = 0;
			while ((line = br.readLine()) != null) {
				String[] aLine = line.split(",");
				if (aLine[col1].equalsIgnoreCase("Dallas")) {
					cntDallas++;
					System.out.println(aLine[col1] + ": " + aLine[col2]);            // print the address
				}
				if (aLine[col1].equalsIgnoreCase("Pune")) {
					cntPune++;
					System.out.println(aLine[col1] + ": " + aLine[col2]);            // print the address
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage()); // handle exception
		}
	}
}
