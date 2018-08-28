package inheritance;

public class Movies {
	private String title;
	private float budget;		//	in millions of dollars

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Movies{" +
				"title='" + title + '\'' +
				", budget=" + budget +
				'}';
	}

	public Movies(String title, float budget) {
		this.title = title;
		this.budget = budget;
	}

	public static void main(String[] args) {
		Horror wud = new Horror("Wait until Dark", 3, 1);
		System.out.println("wud = " + wud);
		War ww2 = new War("The Big Red One", 7, "Germany", "WWII");
		System.out.println("ww2 = " + ww2);
	}
}
class War extends Movies {
	private String enemy;
	private String warName;

	public String getEnemy() {
		return enemy;
	}

	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}

	public String getWarName() {
		return warName;
	}

	public void setWarName(String warName) {
		this.warName = warName;
	}

	@Override
	public String toString() {
		return "War{" +
				"enemy='" + enemy + '\'' +
				", warName='" + warName + '\'' +
				"} " + super.toString();
	}

	public War(String title, float budget, String enemy, String warName) {
		super(title, budget);
		this.enemy = enemy;
		this.warName = warName;
	}
}
class Horror extends Movies {
	private int jumpScareCount;

	public int getJumpScareCount() {
		return jumpScareCount;
	}

	public void setJumpScareCount(int jumpScareCount) {
		this.jumpScareCount = jumpScareCount;
	}

	@Override
	public String toString() {
		return "Horror{" +
				"jumpScareCount=" + jumpScareCount +
				"} " + super.toString();
	}

	public Horror(String title, float budget, int jumpScareCount) {
		super(title, budget);
		this.jumpScareCount = jumpScareCount;
	}
}