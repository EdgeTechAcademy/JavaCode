import java.util.Date;

public class MethodExamples {
	private String name;
	public static void main(String[] args) {
		MethodExamples method1 = new MethodExamples("Gary");
		MethodExamples method2 = new MethodExamples("Tari");

		String msg = method1.hello("Programmer Rock Star");
		System.out.println("msg = " + msg);

		msg = method1.getDate();
		System.out.println("The current time is: "  + msg);
	}

	public MethodExamples(String name) {
		this.name = name;
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
