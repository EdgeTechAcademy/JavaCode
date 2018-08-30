import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CrimeStats {
	 private String complaint;			//	0
	 private String reportDate;			//	5
	 private int keyCode;				//	6
	 private String offense;			//	7
	 private int pdCode;				//	8
	 private String pdDescription;		//	9
	 private String lawCategoryCode;	//	11
	 private String borough;			//	13
	 private String precicntCode;		//	14
	 private String location;			//	15
	 private String premiseType;		//	16
	 private String parkName;			//	17
	 private String development;		//	18
	 private float latitude;			//	21
	 private float longitude;			//	22

	public CrimeStats(String complaint, String reportDate, int keyCode, String offense,
					  int pdCode, String pdDescription, String lawCategoryCode, String borough,
					  String precicntCode, String location, String premiseType,
					  String parkName, String development, float latitude, float longitude) {

		this.complaint = complaint;
		this.reportDate = reportDate;
		this.keyCode = keyCode;
		this.offense = offense;
		this.pdCode = pdCode;
		this.pdDescription = pdDescription;
		this.lawCategoryCode = lawCategoryCode;
		this.borough = borough;
		this.precicntCode = precicntCode;
		this.location = location;
		this.premiseType = premiseType;
		this.parkName = parkName;
		this.development = development;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getComplaint() {
		return complaint;
	}

	public String getReportDate() {
		return reportDate;
	}

	public int getKeyCode() {
		return keyCode;
	}

	public String getOffense() {
		return offense;
	}

	public int getPdCode() {
		return pdCode;
	}

	public String getPdDescription() {
		return pdDescription;
	}

	public String getLawCategoryCode() {
		return lawCategoryCode;
	}

	public String getBorough() {
		return borough;
	}

	public String getPrecicntCode() {
		return precicntCode;
	}

	public String getLocation() {
		return location;
	}

	public String getPremiseType() {
		return premiseType;
	}

	public String getParkName() {
		return parkName;
	}

	public String getDevelopment() {
		return development;
	}

	public float getLatitude() {
		return latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public static List<CrimeStats> getCrimes() {
		List<CrimeStats> crimes = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("Crime.csv"));
			String line;

			//	consume the header line
			String header = br.readLine();
			//	find the column number of the 'address' field
			int lineCnt = 0;
			while ((line = br.readLine()) != null) {
				String[] f = line.split(",");
				CrimeStats stat = new CrimeStats(f[0],f[5], getInt(f[6]), f[7], getInt(f[8]), f[9], f[11], f[13], f[14], f[15], f[16], f[17], f[18], getFloat(f[21]), getFloat(f[22]));
				crimes.add(stat);
				lineCnt++;
				System.out.println(lineCnt + " " + f[0]);
			}
			System.out.println(crimes.size());
		} catch (Exception e) {
			System.err.println(e.getMessage()); // handle exception
		}
		return crimes;
	}

	public static float getFloat (String num) { return (num.length()>0) ? Float.parseFloat(num) : 0; }
	public static int   getInt   (String num) { return (num.length()>0) ? Integer.parseInt(num) : 0; }
}
