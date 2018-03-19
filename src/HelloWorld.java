import java.sql.Array;

/**
 * Created by Edge Tech Academy on 10/31/2016.
 *       Demonstrating a simple Class definition
 */

@SuppressWarnings("WeakerAccess")
public class HelloWorld {

	private String name;
	private	int 	age;

	public HelloWorld() {	}

	public HelloWorld(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ( age <= 110 ) {
			this.age = age;
		}
	}

	public void setName(String name) {
		if ( name.length() > 20)
			name = name.substring(0,20);
		if (name.equals("vern")) {
			this.name = name.toUpperCase() + "!";
		}
		else {
			this.name = name;
		}
	}

	@Override
	public String toString() {
		return "Hello " + name + "!: Welcome to Edge Tech Academy";
	}

	public static void main(String[] args) {

		Employee vern = new Employee("vern", "Programmer", true);
		System.out.println("vern = " + vern);
		HelloWorld v = new HelloWorld();
		v.setName(vern.getName());
		System.out.println("v = " + v);
//		HelloWorld student1 = new HelloWorld("Alice");
//		HelloWorld student2 = new HelloWorld();
//		System.out.println("student2.getName() = " + student2.getName());
//
//		HelloWorld me;
//
//		String textEle = "Alice; Bob; Clem;   Don   ;Ellen   ;Francis;    Greg";
//		String[] nameArray = textEle.split(";");
//		for (int i = 0; i < nameArray.length; i++) {
//			me = new HelloWorld(nameArray[i]);
//			System.out.println("more students " + i + ">" + me.getName().trim() +"<");
//			student2.setName(me.getName());
//			System.out.println("student2 = " + student2.getName());
//		}
	}
}
