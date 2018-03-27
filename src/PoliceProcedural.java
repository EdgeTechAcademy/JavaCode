public class PoliceProcedural {

	public enum PP_Style { GRITTY, BUDDY, COMEDY, INNER_CITY, DRAMA }
	private boolean ensemble;           // true - ensemble, false buddy
	private PP_Style style;              //  "Gritty", "Comedy", "Drama", "Inner City"
	private String location;           // New York, Chicago, LA
	private boolean forensicBased;      //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy


	public PoliceProcedural(String location) {
		this(true, PP_Style.INNER_CITY, location, true);
	}

	public PoliceProcedural(boolean ensemble, PP_Style style, String location, boolean forensicBased) {
		this.ensemble = ensemble;
		this.style = style;
		this.location = location;
		this.forensicBased = forensicBased;
	}

	public PoliceProcedural(PP_Style style, String location) {
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

		PoliceProcedural CSI = new PoliceProcedural(true, PP_Style.BUDDY, "Chicago", true);
		PoliceProcedural Dexter = new PoliceProcedural(PP_Style.DRAMA, "Miami");
		PoliceProcedural SVU = new PoliceProcedural("New Jersey");
		PoliceProcedural CriminalMinds = new PoliceProcedural(false, PP_Style.DRAMA, "Florida", true);

		System.out.println(CriminalMinds);
		System.out.println(SVU);
		System.out.println(Dexter);
		System.out.println(CSI);

	}
}

