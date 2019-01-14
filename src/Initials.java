public class Initials {
	public static void main(String[] args) {
		String me = "Gary Thomas James";
		String[] myNames = me.split(" ");
		String initials = "";
		for (int i = 0; i < myNames.length; i++) {
			initials += myNames[i].charAt(0);
		}
		System.out.println(initials);
	}
}
