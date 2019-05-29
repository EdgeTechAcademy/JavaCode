import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz5 {
	public static void main(String[] args) {


		double answer, num1, num2;
		String input = Utils.getInput("Type in Equation");  // type ANY oporation
		Pattern p = Pattern.compile("\\d+");                     // \\d+ allows you to add first digit plus any others
		Pattern z = Pattern.compile("\\p{Punct}");
		Matcher l = z.matcher(input);
		Matcher m = p.matcher(input);
		String bucket = "";
		String oporator = "";
		while (l.find()){
			oporator = l.group();
		}
		while (m.find()) {
			bucket += " " + m.group();
		}
		bucket = bucket.trim();

		String[] buckets = bucket.split(" ");
		double[] numbuck = new double[buckets.length];
		for (int i = 0; i < buckets.length; i++) {
			numbuck[i] = Double.parseDouble(buckets[i]);

		}

		num1 = numbuck[0];
		num2 = numbuck[1];

		switch (oporator) {
			case "+":
				answer = num1 + num2;
				System.out.println(answer);
				break;
			case "-":
				answer = num1 - num2;
				System.out.println(answer);
				break;
			case "*":
				answer = num1 * num2;
				System.out.println(answer);
				break;
			case "/":
				answer = num1 / num2;
				System.out.println(answer);
				break;
			default:
				System.out.println("Sorry, try again.");
				break;
		}
	}
}