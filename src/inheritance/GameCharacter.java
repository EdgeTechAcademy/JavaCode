package inheritance;

import java.util.ArrayList;

public class GameCharacter {
	private String name;
	private int health;
	private int power;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
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
				", health=" + health +
				", power=" + power +
				'}';
	}

	public GameCharacter(String name, int health, int power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}

	public static void main(String[] args) {
		Monster x1 = new Monster("Aarrg", 90, 75);
		Monster x2 = new Monster("Meany Face", 50, 25);
		Monster x3 = new Monster("Big Bad Wolf", 30, 33);
		Wizard  w1 = new Wizard("Gandalf", 100, 100, 74);
		Wizard	w2 = new Wizard("Larry", 17, 25, 14);
		System.out.println("w2 = " + w2);

		x1.getCurses().add("Stub Toe");
		x1.getCurses().add("Paper Cut");
		System.out.println("x1 = " + x1);

		Werewolf werewolf1 = new Werewolf("Lupus", 66, 98, 91);
		werewolf1.getAbilities().add("Pouncing");
		werewolf1.getAbilities().add("Bite");
		System.out.println("werewolf1 = " + werewolf1);
	}
}

class Wizard extends GameCharacter {
	private float mana;
	private ArrayList<String> spells;

	public float getMana() {
		return mana;
	}
	public void setMana(float mana) {
		this.mana = mana;
	}
	public ArrayList<String> getSpells() {
		return spells;
	}

	@Override
	public String toString() {
		return "Wizard{" +
				"mana=" + mana +
				", spells=" + spells +
				"} " + super.toString();
	}

	public Wizard(String name, int health, int power, float mana) {
		super(name, health, power);
		this.mana = mana;
		spells = new ArrayList<>();
	}
}

class Monster extends GameCharacter {
	private ArrayList<String> curses;

	public ArrayList<String> getCurses() {
		return curses;
	}

	@Override
	public String toString() {
		return "Monster{" +
				"curses=" + curses +
				"} " + super.toString();
	}

	public Monster(String name, int health, int power) {
		super(name, health, power);
		curses = new ArrayList<>();
	}
}

class Werewolf extends GameCharacter {
	private int fury;
	private ArrayList<String> abilities;

	public int getFury() {
		return fury;
	}

	public void setFury(int fury) {
		this.fury = fury;
	}

	public ArrayList<String> getAbilities() {
		return abilities;
	}

	@Override
	public String toString() {
		return "Werewolf{" +
				"fury=" + fury +
				", abilities=" + abilities +
				"} " + super.toString();
	}

	public Werewolf(String name, int health, int power, int fury) {
		super(name, health, power);
		this.fury = fury;
		abilities = new ArrayList<>();
	}
}