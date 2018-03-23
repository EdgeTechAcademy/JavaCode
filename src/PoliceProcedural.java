public class PoliceProcedural {
	private boolean ensemble;           // true - ensemble, false buddy
	private String style;              //  "Gritty", "Comedy", "Drama", "Inner City"
	private String location;           // New York, Chicago, LA
	private boolean forensicBased;      //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy


	public PoliceProcedural(String location) {
		this(true, "Drama", location, true);
	}

	public PoliceProcedural(boolean ensemble, String style, String location, boolean forensicBased) {
		this.ensemble = ensemble;
		this.style = style;
		this.location = location;
		this.forensicBased = forensicBased;
	}

	public PoliceProcedural(String style, String location) {
		this(true, style, location, true);
	}


	@Override
	public String toString() {
		return "PoliceProcedural{" +
					   "ensemble=" + ensemble +
					   ", style='" + style + '\'' +
					   ", location='" + location + '\'' +
					   ", forensicBased=" + forensicBased +
					   '}';
	}

	public static void main(String[] args) {

		PoliceProcedural CSI = new PoliceProcedural(true, "Drama", "Chicago", true);
		PoliceProcedural Dexter = new PoliceProcedural("Drama", "Miami");
		PoliceProcedural SVU = new PoliceProcedural("New Jersey");
		PoliceProcedural CriminalMinds = new PoliceProcedural(false, "Drama", "Florida", true);

		System.out.println(CriminalMinds);
		System.out.println(SVU);
		System.out.println(Dexter);
		System.out.println(CSI);

	}
}

