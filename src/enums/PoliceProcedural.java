package enums;

public class PoliceProcedural {

	public enum PP_Style { GRITTY, BUDDY, COMEDY, INNER_CITY, DRAMA }

	private String title;
	private boolean ensemble;            //  true - ensemble, false buddy
	private PP_Style style;              //  "Gritty", "Comedy", "Drama", "Inner City"
	private String location;             //  New York, Chicago, LA
	private boolean forensicBased;       //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

	public PoliceProcedural(String title, String location) {
		this(title, true, PP_Style.INNER_CITY, location, true);
	}

	public PoliceProcedural(String title, boolean ensemble, PP_Style style, String location, boolean forensicBased) {
		this.ensemble = ensemble;
		this.style = style;
		this.location = location;
		this.forensicBased = forensicBased;
	}

	public PoliceProcedural(String title, PP_Style style, String location) {
		this(title, true, style, location, true);
	}

	@Override
	public String toString() {
		return "PoliceProcedural{" +
				"title='" + title + '\'' +
				", ensemble=" + ensemble +
				", style=" + style +
				", location='" + location + '\'' +
				", forensicBased=" + forensicBased +
				'}';
	}

	public static void main(String[] args) {

		PoliceProcedural NCIS = new PoliceProcedural("NCIS", true, PP_Style.BUDDY, "Virginia", true);
		PoliceProcedural CSI= new PoliceProcedural("CSI", PP_Style.DRAMA, "Miami");
		PoliceProcedural SVU = new PoliceProcedural("SVU", "New Jersey");
		PoliceProcedural CriminalMinds = new PoliceProcedural("Criminal Minds", false, PP_Style.DRAMA, "Washington D.C.", true);

		System.out.println(CriminalMinds);
		System.out.println(SVU);
		System.out.println(NCIS);
		System.out.println(CSI);
	}
}
