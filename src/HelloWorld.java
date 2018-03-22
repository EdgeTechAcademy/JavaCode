import java.sql.Array;

/**
 * Created by Edge Tech Academy on 10/31/2016.
 *       Demonstrating a simple Class definition
 */

@SuppressWarnings("WeakerAccess")
public class HelloWorld {

	private String name;

	private HelloWorld() {
	}

	private HelloWorld(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello " + name + "!: Welcome to Edge Tech Academy";
	}

	public static void main(String[] args) {

		HelloWorld me;

		String textEle = "Alice; Bob; Clem;   Don   ;Ellen   ;Francis;    Greg";
		String[] nameArray = textEle.split(";");
		for (int i = 0; i < nameArray.length; i++) {
			me = new HelloWorld(nameArray[i]);           //  Create your me Object
			System.out.println("more students " + i + ">" + me.getName().trim() +"<");
			System.out.println("more students " + i + ">" + me.getName() + "<");
		}
	}
}
