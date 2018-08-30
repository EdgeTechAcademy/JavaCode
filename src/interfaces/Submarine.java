package interfaces;

public class Submarine implements Submersible {

	private int 	depth;
	private int 	divingSpeed;

	@Override
	public void dive() {
		divingSpeed = -10;
		System.out.println("Take us down");
	}

	@Override
	public void surface() {
		divingSpeed = 10;
		System.out.println("Bring us to the top");
	}
}
