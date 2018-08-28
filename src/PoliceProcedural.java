public class PoliceProcedural {
	private   String      title;              // "NCIS", "NCIS L.A.", "NCIS Ne Orleans", "NCIS Moon Base 1"
	private   String      location;           // New York, Chicago, LA
	private   String      style;              //  "Gritty", "Comedy", "Drama", "Inner City"
	private   boolean     ensemble;           // true - ensemble, false buddy
	private   boolean     forensicBased;      //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public boolean isEnsemble() {
		return ensemble;
	}

	public void setEnsemble(boolean ensemble) {
		this.ensemble = ensemble;
	}

	public boolean isForensicBased() {
		return forensicBased;
	}

	public void setForensicBased(boolean forensicBased) {
		this.forensicBased = forensicBased;
	}

	//	right click Generate getters and setters
	//	right click Generate Constructors x 3
	//	right click Generate toString
	//	print out some of your cop shows


	public PoliceProcedural(String title, String location, String style, boolean ensemble, boolean forensicBased) {
		this.title = title;
		this.location = location;
		this.style = style;
		this.ensemble = ensemble;
		this.forensicBased = forensicBased;
	}

	public PoliceProcedural(String title, String location, String style) {
		this.title = title;
		this.location = location;
		this.style = style;
	}

	@Override
	public String toString() {
		return "PoliceProcedural" +
				"\n\ttitle    = '" + title + '\'' +
				"\n\tlocation = '" + location + '\'' +
				"\n\tstyle    = '" + style + '\'';
	}

	public static void main(String[] args) {
		PoliceProcedural cop = new PoliceProcedural("NCIS", "Washington D.C.", "Military/Forensic Based");
		System.out.println(cop);
		//	psvm
		//	create some cop shows
	}
}