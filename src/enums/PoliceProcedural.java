package enums;

public class PoliceProcedural {

	public enum PP_STYLE { GRITTY, BUDDY, COMEDY, INNER_CITY, DRAMA }

	public enum LOCATION {NEW_YORK, CHICAGO, LA, DC, MIAMI, DALLAS, FORT_WORTH}

	private String title;
	private boolean ensemble;            //  true - ensemble, false buddy
	private PP_STYLE style;              //  "Gritty", "Comedy", "Drama", "Inner City"
	private LOCATION location;             //  New York, Chicago, LA
	private boolean forensicBased;       //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

	public PoliceProcedural(String title, LOCATION  location) {
		this(title, true, PP_STYLE.INNER_CITY, location, true);
	}

	public PoliceProcedural(String title, boolean ensemble, PP_STYLE style, LOCATION  location, boolean forensicBased) {
		this.ensemble = ensemble;
		this.style = style;
		this.location = location;
		this.forensicBased = forensicBased;
	}

	public PoliceProcedural(String title, PP_STYLE style, LOCATION  location) {
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

		PoliceProcedural NCIS = new PoliceProcedural("NCIS", true, PP_STYLE.BUDDY, LOCATION.DC, true);
		PoliceProcedural CSI= new PoliceProcedural("CSI", PP_STYLE.DRAMA, LOCATION.MIAMI);
		PoliceProcedural SVU = new PoliceProcedural("SVU", LOCATION.CHICAGO);
		PoliceProcedural CriminalMinds = new PoliceProcedural("Criminal Minds", false, PP_STYLE.DRAMA, LOCATION.DC, true);

		System.out.println(CriminalMinds);
		System.out.println(SVU);
		System.out.println(NCIS);
		System.out.println(CSI);
	}
}
