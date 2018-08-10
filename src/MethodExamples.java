import java.util.Date;

public class MethodExamples {
	public static void main(String[] args) {
		MethodExamples method = new MethodExamples();

		String msg = method.hello("Programmer Rock Star");
		System.out.println("msg = " + msg);

		msg = method.getDate();
		System.out.println("The current time is: "  + msg);
	}

	public String hello(String name) {
		return "Hello " + name + " how are you?";
	}

	public String getDate() {
		Date date = new Date();
		return date.toString();
	}

//	public String getDate(String datePart) {
//		Date date = new Date();
//		if (datePart == 'H') {
//			return date.
//		}
//	}

}
