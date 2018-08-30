import java.io.BufferedReader;
import java.io.FileReader;

public class More {
//	enum FIELDS {ID(0), COMPANY(1), DATE(2), WEEK(3), LOCATION(4), JOB_DESCRIPTION(5), TITLE(6);
//	int value;
//	}

	public static void main(String[] args) {
		String line = "";
		String whatJob, whatCity;
		do {
			int countJobs = 0;
			whatJob = Utils.getInput("Title: ");
			whatCity = Utils.getInput("City: ");
			try {
				//	read the file line by line
				BufferedReader br = new BufferedReader(new FileReader("JobSearch.csv"));

				line = br.readLine();
				while (line != null) {

					String[] fields = line.split(",");		//	split line into fields

					if (fields[4].equalsIgnoreCase(whatCity) &&	//	check for city and job title
						fields[6].equalsIgnoreCase(whatJob)) {
						countJobs++;							//	we found one!
						System.out.println("Company = " + fields[1]);
					}

					line = br.readLine();
				}
			} catch (Exception e) {
				System.err.println(e.getMessage()); // handle exception
			}
			System.out.println("We found " + countJobs + "  " +  whatJob + " jobs in " + whatCity);
		} while (!whatCity.equals("Orem"));
	}
}
