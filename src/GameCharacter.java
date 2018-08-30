import java.util.ArrayList;

public class GameCharacter {
	private String name;
	private String outfit;
	private ArrayList<String> weapons;    //	list of weapons in our possession
	private int health;                    //	health is from 0 - 100
	private boolean shield;
	private int power;                    //	power is from 0 - 100

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOutfit() {
		return outfit;
	}

	public void setOutfit(String outfit) {
		this.outfit = outfit;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean hasShield() {
		return shield;
	}

	public void setShield(boolean shield) {
		this.shield = shield;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "GameCharacter{" +
				"name='" + name + '\'' +
				", outfit='" + outfit + '\'' +
				", weapons=" + weapons +
				", health=" + health +
				", shield=" + shield +
				", power=" + power +
				'}';
	}

	public GameCharacter(String name) {
		this.name = name;
		this.outfit = "Peasant";
		this.power = 100;
		this.health = 100;
		this.shield = false;
		this.weapons = new ArrayList<>();
	}

	public boolean attack(String weapon, GameCharacter op) {
		String opWeapon = op.chooseWeapon();

		int myTotalPower = power + getPowerRatingOfWeapon(weapon) + health;
		int opTotalPower = op.power + getPowerRatingOfWeapon(opWeapon) + op.health;

		myTotalPower += (int) (Math.random() * 180);
		opTotalPower += (int) (Math.random() * 180);

		boolean didIWin = myTotalPower >= opTotalPower;

		System.out.println("The winner was..." + ((didIWin) ? name : op.name) + " " + myTotalPower + " " + opTotalPower);
		if (didIWin) {
			addWeapon(opWeapon);
			op.loseWeapon(opWeapon);
			power += myTotalPower - opTotalPower;
			health -= 10;
			health += op.health / 10;
			op.health *= .10;
		} else {
			op.addWeapon(weapon);
			loseWeapon(weapon);
			op.power += opTotalPower - myTotalPower;
			op.health -= 10;
			op.health += health / 10;
			health *= .10;
		}
		return didIWin;
	}

	public int getPowerRatingOfWeapon(String weapon) {
		int power;
		switch (weapon) {
			case "Sword": power = 7; break;
			case "Hammer": power = 10; break;
			case "Knife": power = 5; break;
			case "Gun": power = 10; break;
			case "Pen": power = 11; break;
			default: power = 3; break;
		}
		return power;
	}

	public void addWeapon(String weapon) {
		weapons.add(weapon);
	}

	public void loseWeapon(String weapon) {
		weapons.remove(weapon);
	}

	public String chooseWeapon() {
		int count = weapons.size();
		count = (int) (Math.random() * count);
		return weapons.get(count);
	}

	public static void main(String[] args) {
		GameCharacter me = new GameCharacter("Java Wizard");
		me.addWeapon("Sword");
		me.addWeapon("Pen");
		me.addWeapon("Knife");

		GameCharacter op = new GameCharacter("Non Programmer");
		op.addWeapon("Hammer");
		op.addWeapon("Knife");
		op.addWeapon("Gun");

		do {
			me.attack(me.chooseWeapon(), op);
			System.out.println(me.weapons.size() + " " + op.weapons.size());
		} while (me.weapons.size() > 0 && op.weapons.size() > 0);

		for (int i = 0; i < me.weapons.size(); i++) {
			System.out.println("my wepons " + me.weapons.get(i));
		}
		for (int i = 0; i < op.weapons.size(); i++) {
			System.out.println("op wepons " + op.weapons.get(i));
		}
	}
}
