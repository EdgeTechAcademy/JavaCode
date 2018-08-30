// filename Main.java
class Grandparent {
	public void printMe() {
		System.out.println("Grandparent");
	}
}

class Parent extends Grandparent {
	public void printMe() {
		System.out.println("Parent");
		super.printMe();
	}
}

class Child extends Parent {
	public void printMe() {
		System.out.println("Child");
		super.printMe();
	}
}

public class Main {
	public static void main(String[] args) {
		Child c = new Child();
		c.printMe();
	}
}